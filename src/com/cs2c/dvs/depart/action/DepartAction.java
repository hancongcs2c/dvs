package com.cs2c.dvs.depart.action;
import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.depart.service.DepartService;
import com.cs2c.dvs.pojo.Depart;

@SuppressWarnings("serial")
public class DepartAction extends BaseAction {

	private int departId;
	private String departName;
	private DepartService departService;
	private List<Depart> departList;
	
	
	public List<Depart> getDepartList() {
		return departList;
	}


	public void setDepartList(List<Depart> departList) {
		this.departList = departList;
	}


	public int getDepartId() {
		return departId;
	}
	
	
	public DepartService getDepartService() {
		return departService;
	}


	public void setDepartService(DepartService departService) {
		this.departService = departService;
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
	
	public String queryAllDepart(){
		try {
			departList = departService.queryAllDepart();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryAllDepart";
	}
	
	public String addDepart(){
		try {
			departService.addDepart(departName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "addDepart";
	}

}
