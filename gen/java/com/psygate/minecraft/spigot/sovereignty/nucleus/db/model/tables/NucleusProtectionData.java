/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables.records.NucleusProtectionDataRecord;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.ByteBooleanConverter;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.UUIDByteConverter;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class NucleusProtectionData extends TableImpl<NucleusProtectionDataRecord> {

	private static final long serialVersionUID = -325108616;

	/**
	 * The reference instance of <code>nucleus.nucleus_protection_data</code>
	 */
	public static final NucleusProtectionData NUCLEUS_PROTECTION_DATA = new NucleusProtectionData();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<NucleusProtectionDataRecord> getRecordType() {
		return NucleusProtectionDataRecord.class;
	}

	/**
	 * The column <code>nucleus.nucleus_protection_data.puuid</code>.
	 */
	public final TableField<NucleusProtectionDataRecord, UUID> PUUID = createField("puuid", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "", new UUIDByteConverter());

	/**
	 * The column <code>nucleus.nucleus_protection_data.multi_account_ban_protection_bool</code>.
	 */
	public final TableField<NucleusProtectionDataRecord, Boolean> MULTI_ACCOUNT_BAN_PROTECTION_BOOL = createField("multi_account_ban_protection_bool", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "", new ByteBooleanConverter());

	/**
	 * The column <code>nucleus.nucleus_protection_data.rename_protection_bool</code>.
	 */
	public final TableField<NucleusProtectionDataRecord, Boolean> RENAME_PROTECTION_BOOL = createField("rename_protection_bool", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "", new ByteBooleanConverter());

	/**
	 * The column <code>nucleus.nucleus_protection_data.imposter_check_protection_bool</code>.
	 */
	public final TableField<NucleusProtectionDataRecord, Boolean> IMPOSTER_CHECK_PROTECTION_BOOL = createField("imposter_check_protection_bool", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "", new ByteBooleanConverter());

	/**
	 * The column <code>nucleus.nucleus_protection_data.ip_range_ban_bool</code>.
	 */
	public final TableField<NucleusProtectionDataRecord, Boolean> IP_RANGE_BAN_BOOL = createField("ip_range_ban_bool", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "", new ByteBooleanConverter());

	/**
	 * Create a <code>nucleus.nucleus_protection_data</code> table reference
	 */
	public NucleusProtectionData() {
		this("nucleus_protection_data", null);
	}

	/**
	 * Create an aliased <code>nucleus.nucleus_protection_data</code> table reference
	 */
	public NucleusProtectionData(String alias) {
		this(alias, NUCLEUS_PROTECTION_DATA);
	}

	private NucleusProtectionData(String alias, Table<NucleusProtectionDataRecord> aliased) {
		this(alias, aliased, null);
	}

	private NucleusProtectionData(String alias, Table<NucleusProtectionDataRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<NucleusProtectionDataRecord> getPrimaryKey() {
		return Keys.KEY_NUCLEUS_PROTECTION_DATA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<NucleusProtectionDataRecord>> getKeys() {
		return Arrays.<UniqueKey<NucleusProtectionDataRecord>>asList(Keys.KEY_NUCLEUS_PROTECTION_DATA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusProtectionData as(String alias) {
		return new NucleusProtectionData(alias, this);
	}

	/**
	 * Rename this table
	 */
	public NucleusProtectionData rename(String name) {
		return new NucleusProtectionData(name, null);
	}
}
