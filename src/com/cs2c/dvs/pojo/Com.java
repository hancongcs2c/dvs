/**
 * 
 */
package com.cs2c.dvs.pojo;

/**
 * @author hancong
 * 
 */
public class Com {
	private int comId;
	private String comName;
	private int typeId;

	public Com() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Com(String comName, int typeId) {
		super();
		this.comName = comName;
		this.typeId = typeId;
	}

	public Com(int comId, String comName, int typeId) {
		super();
		this.comId = comId;
		this.comName = comName;
		this.typeId = typeId;
	}

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "Com [comId=" + comId + ", comName=" + comName + ", typeId="
				+ typeId + "]";
	}

	

}
