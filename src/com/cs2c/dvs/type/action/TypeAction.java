package com.cs2c.dvs.type.action;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.type.service.TypeService;

public class TypeAction extends BaseAction {

private int typeId;

private String typeName;
private TypeService typeService;

public void setTypeService(TypeService typeService) {
	this.typeService = typeService;
}
public int getTypeId() {
	return typeId;
}
public void setTypeId(int typeId) {
	this.typeId = typeId;
	System.out.println("set@yuan"+typeId);
}
public String getTypeName() {
	return typeName;
}
public void setTypeName(String typeName) {
	this.typeName = typeName;
}
}
