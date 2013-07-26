package com.cs2c.dvs.community.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.community.service.ComService;
import com.cs2c.dvs.dao.ComDao;
import com.cs2c.dvs.pojo.Com;

public class ComServiceImpl implements ComService{

	private ComDao dao;
	
	
	public void setDao(ComDao dao) {
		this.dao = dao;
	}


	@SuppressWarnings("rawtypes")
	@Override
	public List<HashMap> queryAllCom() throws SQLException {
		return dao.queryAllCom();
	}


	@Override
	public void addCom(Com com) throws SQLException {
		dao.addCom(com);
	}


	@Override
	public void deleteCom(int comId) throws SQLException {
		dao.deleteCom(comId);
		
	}


	@SuppressWarnings("rawtypes")
	@Override
	public HashMap queryComById(int comId) throws SQLException {
		System.out.println("service:"+dao.queryComById(comId));
		return dao.queryComById(comId);
	}


	@Override
	public void updateCom(Com com) throws SQLException {
		dao.updateCom(com);
	}
	

}
