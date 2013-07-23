package com.cs2c.dvs.pojo;

public class Type {
	private int typeId;
	private String typeName;
	
	
	
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Type(String typeName) {
		super();
		this.typeName = typeName;
	}


	public Type(int typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		return "Type [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	
	
}
