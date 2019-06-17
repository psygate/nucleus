/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;


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
public class NucleusUserLog implements Serializable {

	private static final long serialVersionUID = 716238967;

	private final String    username;
	private final UUID      puuid;
	private final byte[]    ip;
	private final Timestamp seen;

	public NucleusUserLog(NucleusUserLog value) {
		this.username = value.username;
		this.puuid = value.puuid;
		this.ip = value.ip;
		this.seen = value.seen;
	}

	public NucleusUserLog(
		String    username,
		UUID      puuid,
		byte[]    ip,
		Timestamp seen
	) {
		this.username = username;
		this.puuid = puuid;
		this.ip = ip;
		this.seen = seen;
	}

	public String getUsername() {
		return this.username;
	}

	public UUID getPuuid() {
		return this.puuid;
	}

	public byte[] getIp() {
		return this.ip;
	}

	public Timestamp getSeen() {
		return this.seen;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("NucleusUserLog (");

		sb.append(username);
		sb.append(", ").append(puuid);
		sb.append(", ").append("[binary...]");
		sb.append(", ").append(seen);

		sb.append(")");
		return sb.toString();
	}
}