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


	@SuppressWarnings("rawtypes")
	@Override
	public List<HashMap> queryTrByUser(int userId) throws SQLException {
		return dao.queryTrByUser(userId);
	}


	@SuppressWarnings("rawtypes")
	@Override
	public List<HashMap> queryAllTrend() throws SQLException {
		return dao.queryAllTrend();
	}


	@Override
	public void addTrend(Trend trend) throws SQLException {
		dao.addTrend(trend);
	}

}
