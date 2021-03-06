package com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util;

/**
 * Created by psygate (https://github.com/psygate) on 22.01.2016.
 */

//Source: http://allstarnix.blogspot.co.at/2013/03/how-to-execute-sql-script-file-using.html

import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlRunner {

    public static final String DELIMITER_LINE_REGEX = "(?i)DELIMITER.+", DELIMITER_LINE_SPLIT_REGEX = "(?i)DELIMITER", DEFAULT_DELIMITER = ";";
    private static final Logger LOG = Logger.getLogger(SqlRunner.class.getName());
    private final boolean autoCommit, stopOnError;
    private final Connection connection;
    private String delimiter = SqlRunner.DEFAULT_DELIMITER;

    public SqlRunner(final Connection connection, final boolean autoCommit, final boolean stopOnError) {
        if (connection == null) {
            throw new RuntimeException("SqlRunner requires an SQL Connection");
        }

        this.connection = connection;
        this.autoCommit = autoCommit;
        this.stopOnError = stopOnError;
    }

    public void runScript(final Reader reader) throws SQLException {
        final boolean originalAutoCommit = this.connection.getAutoCommit();
        try {
            if (originalAutoCommit != this.autoCommit) {
                this.connection.setAutoCommit(this.autoCommit);
            }
            this.runScript(this.connection, reader);
        } finally {
            this.connection.setAutoCommit(originalAutoCommit);
        }
    }

    private void runScript(final Connection conn, final Reader reader) {
        StringBuffer command = null;
        try {
            final LineNumberReader lineReader = new LineNumberReader(reader);
            String line;
            while ((line = lineReader.readLine()) != null) {
                if (command == null) {
                    command = new StringBuffer();
                }
                String trimmedLine = line.trim();

                if (trimmedLine.startsWith("--") || trimmedLine.startsWith("//") || trimmedLine.startsWith("#")) {

                    // Line is a comment
                    LOG.info(trimmedLine);

                } else if (trimmedLine.endsWith(this.delimiter)) {

                    // Line is end of statement
                    // Support new delimiter
                    final Pattern pattern = Pattern.compile(SqlRunner.DELIMITER_LINE_REGEX);
                    final Matcher matcher = pattern.matcher(trimmedLine);
                    if (matcher.matches()) {
                        delimiter = trimmedLine.split(SqlRunner.DELIMITER_LINE_SPLIT_REGEX)[1].trim();

                        // New delimiter is processed, continue on next
                        // statement
                        line = lineReader.readLine();
                        if (line == null) {
                            break;
                        }
//                        trimmedLine = line.trim();
                    }

                    // Append
                    command.append(line.substring(0, line.lastIndexOf(this.delimiter)));
                    command.append(" ");

                    Statement stmt = null;
                    ResultSet rs = null;
                    try {
                        stmt = conn.createStatement();
                        LOG.info(command.toString());
                        boolean hasResults = false;
                        if (this.stopOnError) {
                            hasResults = stmt.execute(command.toString());
                        } else {
                            try {
                                stmt.execute(command.toString());
                            } catch (final SQLException e) {
                                LOG.log(Level.SEVERE, "Error on command: {0}", command);
                            }
                        }
                        if (this.autoCommit && !conn.getAutoCommit()) {
                            conn.commit();
                        }
                        rs = stmt.getResultSet();
                        if (hasResults && rs != null) {

                            // Print result column names
                            final ResultSetMetaData md = rs.getMetaData();
                            final int cols = md.getColumnCount();
                            for (int i = 0; i < cols; i++) {
                                final String name = md.getColumnLabel(i + 1);
                                LOG.info(name + "\t");
                            }
                            LOG.info("");
                            LOG.info(StringUtils.repeat("---------", md.getColumnCount()));

                            // Print result rows
                            while (rs.next()) {
                                for (int i = 1; i <= cols; i++) {
                                    final String value = rs.getString(i);
                                    LOG.info(value + "\t");
                                }
                            }
                        } else {
                            LOG.info("Updated: " + stmt.getUpdateCount());
                        }
                        command = null;
                    } finally {
                        if (rs != null) {
                            try {
                                rs.close();
                            } catch (final Exception e) {
                                LOG.severe("Failed to close result: " + e.getMessage());
                            }
                        }
                        if (stmt != null) {
                            try {
                                stmt.close();
                            } catch (final Exception e) {
                                LOG.severe("Failed to close statement: " + e.getMessage());
                            }
                        }
                    }
                } else {

                    // Line is middle of a statement
                    // Support new delimiter
                    final Pattern pattern = Pattern.compile(SqlRunner.DELIMITER_LINE_REGEX);
                    final Matcher matcher = pattern.matcher(trimmedLine);
                    if (matcher.matches()) {
                        delimiter = trimmedLine.split(SqlRunner.DELIMITER_LINE_SPLIT_REGEX)[1].trim();
                        line = lineReader.readLine();
                        if (line == null) {
                            break;
                        }
//                        trimmedLine = line.trim();
                    }
                    command.append(line);
                    command.append(" ");
                }
            }
            if (!this.autoCommit) {
                conn.commit();
            }
        } catch (final SQLException | IOException e) {
            LOG.log(Level.SEVERE, "Error on command: " + command, e);
        }
    }
}