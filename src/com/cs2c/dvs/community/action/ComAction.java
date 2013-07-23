package com.cs2c.dvs.community.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.community.service.ComService;
import com.cs2c.dvs.pojo.Com;
import com.cs2c.dvs.pojo.Type;
import com.cs2c.dvs.type.service.TypeService;

public class ComAction extends BaseAction{
	private ComService service;
	private List<HashMap> comList;
	private Com com;
	private HashMap comMap;
	private int comId;
	private String comName;
	private int typeId;
	private TypeService typeService;
	private List<Type> typeList;
		
	public List<Type> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<Type> typeList) {
		this.typeList = typeList;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public Com getCom() {
		return com;
	}
	public void setCom(Com com) {
		this.com = com;
	}
	public HashMap getComMap() {
		return comMap;
	}
	public void setComMap(HashMap comMap) {
		this.comMap = comMap;
	}
	public ComService getService() {
		return service;
	}
	public List<HashMap> getComList() {
		return comList;
	}
	public void setComList(List<HashMap> comList) {
		this.comList = comList;
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
	
	
	public void setService(ComService service) {
		this.service = service;
	}
	
	public String queryAllCom(){
		try {
			comList = service.queryAllCom();
			//System.out.println(comList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryAllCom";
	}
	
	public String toAdd(){
		try {
			typeList = typeService.queryAllType();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "toAdd";
	}
	public String addCom(){
		int typeId = this.typeId;
		com = new Com(this.comName,this.typeId);
		try {
			service.addCom(com);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "addCom";
	}
	
	public String deleteCom(){
		try {
			service.deleteCom(comId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "deleteCom";
	}
	
	public String queryComById(){
		try {
			typeList = typeService.queryAllType();
			comMap = service.queryComById(comId);
			//System.out.println("typeList:::"+typeList);
			//System.out.println("comMap:::"+comMap);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "queryComById";
	}
	
	public String updateCom(){
		int typeId = this.typeId;
		com = new Com(this.comId,this.comName,typeId);
		//System.out.println("%%%%%%%"+com);
		try {
			service.updateCom(com);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "updateCom";
	}
}
