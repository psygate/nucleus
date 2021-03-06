/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables.records.NucleusBannedIpRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NucleusBannedIp extends TableImpl<NucleusBannedIpRecord> {

	private static final long serialVersionUID = 747968637;

	/**
	 * The reference instance of <code>nucleus.nucleus_banned_ip</code>
	 */
	public static final NucleusBannedIp NUCLEUS_BANNED_IP = new NucleusBannedIp();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NucleusBannedIpRecord> getRecordType() {
		return NucleusBannedIpRecord.class;
	}

	/**
	 * The column <code>nucleus.nucleus_banned_ip.ban_id</code>.
	 */
	public final TableField<NucleusBannedIpRecord, Long> BAN_ID = createField("ban_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>nucleus.nucleus_banned_ip.ip</code>.
	 */
	public final TableField<NucleusBannedIpRecord, byte[]> IP = createField("ip", org.jooq.impl.SQLDataType.VARBINARY.length(16).nullable(false), this, "");

	/**
	 * The column <code>nucleus.nucleus_banned_ip.netmask</code>.
	 */
	public final TableField<NucleusBannedIpRecord, byte[]> NETMASK = createField("netmask", org.jooq.impl.SQLDataType.VARBINARY.length(16).nullable(false), this, "");

	/**
	 * Create a <code>nucleus.nucleus_banned_ip</code> table reference
	 */
	public NucleusBannedIp() {
		this("nucleus_banned_ip", null);
	}

	/**
	 * Create an aliased <code>nucleus.nucleus_banned_ip</code> table reference
	 */
	public NucleusBannedIp(String alias) {
		this(alias, NUCLEUS_BANNED_IP);
	}

	private NucleusBannedIp(String alias, Table<NucleusBannedIpRecord> aliased) {
		this(alias, aliased, null);
	}

	private NucleusBannedIp(String alias, Table<NucleusBannedIpRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<NucleusBannedIpRecord>> getKeys() {
		return Arrays.<UniqueKey<NucleusBannedIpRecord>>asList(Keys.KEY_NUCLEUS_BANNED_IP_IP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<NucleusBannedIpRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<NucleusBannedIpRecord, ?>>asList(Keys.NUCLEUS_BANNED_IP_IBFK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBannedIp as(String alias) {
		return new NucleusBannedIp(alias, this);
	}

	/**
	 * Rename this table
	 */
	public NucleusBannedIp rename(String name) {
		return new NucleusBannedIp(name, null);
	}
}
