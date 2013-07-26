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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ComService service;
	@SuppressWarnings("rawtypes")
	private List<HashMap> comList;
	private Com com;
	@SuppressWarnings("rawtypes")
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
	@SuppressWarnings("rawtypes")
	public HashMap getComMap() {
		return comMap;
	}
	@SuppressWarnings("rawtypes")
	public void setComMap(HashMap comMap) {
		this.comMap = comMap;
	}
	public ComService getService() {
		return service;
	}
	@SuppressWarnings("rawtypes")
	public List<HashMap> getComList() {
		return comList;
	}
	@SuppressWarnings("rawtypes")
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
			e.printStackTrace();
		}
		return "deleteCom";
	}
	
	public String queryComById(){
		try {
			typeList = typeService.queryAllType();
			comMap = service.queryComById(comId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryComById";
	}
	
	public String updateCom(){
		int typeId = this.typeId;
		com = new Com(this.comId,this.comName,typeId);
		try {
			service.updateCom(com);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "updateCom";
	}
}
