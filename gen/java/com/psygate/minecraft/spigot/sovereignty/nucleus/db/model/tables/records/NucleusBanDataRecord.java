/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.nucleus.bans.BanType;
import com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables.NucleusBanData;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class NucleusBanDataRecord extends UpdatableRecordImpl<NucleusBanDataRecord> implements Record7<Long, BanType, UUID, Timestamp, Timestamp, Boolean, String> {

	private static final long serialVersionUID = -230890884;

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.ban_id</code>.
	 */
	public void setBanId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.ban_id</code>.
	 */
	public Long getBanId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.ban_type</code>.
	 */
	public void setBanType(BanType value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.ban_type</code>.
	 */
	public BanType getBanType() {
		return (BanType) getValue(1);
	}

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.banned_by_puuid</code>.
	 */
	public void setBannedByPuuid(UUID value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.banned_by_puuid</code>.
	 */
	public UUID getBannedByPuuid() {
		return (UUID) getValue(2);
	}

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.ban_time</code>.
	 */
	public void setBanTime(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.ban_time</code>.
	 */
	public Timestamp getBanTime() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.banned_until</code>.
	 */
	public void setBannedUntil(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.banned_until</code>.
	 */
	public Timestamp getBannedUntil() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.banned_forever_bool</code>.
	 */
	public void setBannedForeverBool(Boolean value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.banned_forever_bool</code>.
	 */
	public Boolean getBannedForeverBool() {
		return (Boolean) getValue(5);
	}

	/**
	 * Setter for <code>nucleus.nucleus_ban_data.ban_reason</code>.
	 */
	public void setBanReason(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nucleus.nucleus_ban_data.ban_reason</code>.
	 */
	public String getBanReason() {
		return (String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, BanType, UUID, Timestamp, Timestamp, Boolean, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, BanType, UUID, Timestamp, Timestamp, Boolean, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BAN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BanType> field2() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BAN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field3() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BANNED_BY_PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BAN_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BANNED_UNTIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field6() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BANNED_FOREVER_BOOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return NucleusBanData.NUCLEUS_BAN_DATA.BAN_REASON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getBanId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BanType value2() {
		return getBanType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value3() {
		return getBannedByPuuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getBanTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getBannedUntil();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value6() {
		return getBannedForeverBool();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getBanReason();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value1(Long value) {
		setBanId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value2(BanType value) {
		setBanType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value3(UUID value) {
		setBannedByPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value4(Timestamp value) {
		setBanTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value5(Timestamp value) {
		setBannedUntil(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value6(Boolean value) {
		setBannedForeverBool(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord value7(String value) {
		setBanReason(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NucleusBanDataRecord values(Long value1, BanType value2, UUID value3, Timestamp value4, Timestamp value5, Boolean value6, String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NucleusBanDataRecord
	 */
	public NucleusBanDataRecord() {
		super(NucleusBanData.NUCLEUS_BAN_DATA);
	}

	/**
	 * Create a detached, initialised NucleusBanDataRecord
	 */
	public NucleusBanDataRecord(Long banId, BanType banType, UUID bannedByPuuid, Timestamp banTime, Timestamp bannedUntil, Boolean bannedForeverBool, String banReason) {
		super(NucleusBanData.NUCLEUS_BAN_DATA);

		setValue(0, banId);
		setValue(1, banType);
		setValue(2, bannedByPuuid);
		setValue(3, banTime);
		setValue(4, bannedUntil);
		setValue(5, bannedForeverBool);
		setValue(6, banReason);
	}
}
