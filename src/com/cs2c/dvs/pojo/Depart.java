package com.cs2c.dvs.pojo;

public class Depart {
	private int departId;
	private String departName;
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	@Override
	public String toString() {
		return "Depart [departId=" + departId + ", departName=" + departName
				+ "]";
	}
	
	
}
