package com.cs2c.dvs.trend.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.TrendDao;
import com.cs2c.dvs.pojo.Trend;
import com.cs2c.dvs.trend.service.TrendService;

public class TrendServiceImpl implements TrendService{

	private TrendDao dao;
	
	
	public TrendDao getDao() {
		return dao;
	}


	public void setDao(TrendDao dao) {
		this.dao = dao;
	}


	@Override
	public List<HashMap> queryTrByUser(int userId) throws SQLException {
		return dao.queryTrByUser(userId);
	}


	@Override
	public List<HashMap> queryAllTrend() throws SQLException {
		// TODO Auto-generated method stub
		return dao.queryAllTrend();
	}


	@Override
	public void addTrend(Trend trend) throws SQLException {
		// TODO Auto-generated method stub
		dao.addTrend(trend);
	}

}
