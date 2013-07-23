package com.cs2c.dvs.depart.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.dao.DepartDao;
import com.cs2c.dvs.depart.service.DepartService;
import com.cs2c.dvs.pojo.Depart;

public class DepartServiceImpl implements DepartService {

	private DepartDao dao;
	
	
	public void setDao(DepartDao dao) {
		this.dao = dao;
	}


	@Override
	public Depart queryDepartById(int departId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.queryDepartById(departId);
	}


	@Override
	public List<Depart> queryAllDepart() throws SQLException {
		// TODO Auto-generated method stub
		return dao.queryAllDepart();
	}


	@Override
	public void addDepart(String departName) throws SQLException {
		// TODO Auto-generated method stub
		dao.addDepart(departName);
	}

}
