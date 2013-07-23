package com.cs2c.dvs.pojo;

import java.util.Date;

public class Data {
	private int dataId;
	private String community;
	private String project;
	private String name;
	private String email;
	private String affliation;
	private Date date;
	private int added;
	private int removed;
	private int changeset;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Data(String community, String project, String name, String email,
			String affliation, Date date, int added, int removed, int changeset) {
		super();
		this.community = community;
		this.project = project;
		this.name = name;
		this.email = email;
		this.affliation = affliation;
		this.date = date;
		this.added = added;
		this.removed = removed;
		this.changeset = changeset;
	}


	public Data(int dataId, String community, String project, String name,
			String email, String affliation, Date date, int added, int removed,
			int changeset) {
		super();
		this.dataId = dataId;
		this.community = community;
		this.project = project;
		this.name = name;
		this.email = email;
		this.affliation = affliation;
		this.date = date;
		this.added = added;
		this.removed = removed;
		this.changeset = changeset;
	}

	
	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAffliation() {
		if(this.email.contains("cs2c")){
			affliation = "cs2c";
		}
		return affliation;
	}
	public void setAffliation(String affliation) {
		if(this.email.contains("cs2c")){
			affliation = "cs2c";
		}
		this.affliation = affliation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAdded() {
		return added;
	}
	public void setAdded(int added) {
		this.added = added;
	}
	public int getRemoved() {
		return removed;
	}
	public void setRemoved(int removed) {
		this.removed = removed;
	}
	public int getChangeset() {
		return changeset;
	}
	public void setChangeset(int changeset) {
		this.changeset = changeset;
	}
	@Override
	public String toString() {
		return "Data [dataId=" + dataId + ", project=" + project + ", name="
				+ name + ", email=" + email + ", affliation=" + affliation
				+ ", date=" + date + ", added=" + added + ", removed="
				+ removed + ", changeset=" + changeset + "]";
	}
	
}
