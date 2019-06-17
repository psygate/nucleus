/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.nucleus.db.model.tables.pojos;


import java.io.Serializable;

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
public class NucleusPluginVersions implements Serializable {

	private static final long serialVersionUID = 1861252112;

	private final String  pluginName;
	private final Integer pluginVersion;

	public NucleusPluginVersions(NucleusPluginVersions value) {
		this.pluginName = value.pluginName;
		this.pluginVersion = value.pluginVersion;
	}

	public NucleusPluginVersions(
		String  pluginName,
		Integer pluginVersion
	) {
		this.pluginName = pluginName;
		this.pluginVersion = pluginVersion;
	}

	public String getPluginName() {
		return this.pluginName;
	}

	public Integer getPluginVersion() {
		return this.pluginVersion;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("NucleusPluginVersions (");

		sb.append(pluginName);
		sb.append(", ").append(pluginVersion);

		sb.append(")");
		return sb.toString();
	}
}