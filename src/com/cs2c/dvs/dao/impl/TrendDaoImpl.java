package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.TrendDao;
import com.cs2c.dvs.pojo.Trend;
import com.ibatis.sqlmap.client.SqlMapClient;

public class TrendDaoImpl implements TrendDao{

	private SqlMapClient sqlMapClient;
	
	
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}


	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}


	@Override
	public List<HashMap> queryTrByUser(int userId) throws SQLException {
		return sqlMapClient.queryForList("QueryTrByUser",userId);
	}


	@Override
	public List<HashMap> queryAllTrend() throws SQLException {
		// TODO Auto-generated method stub
		return sqlMapClient.queryForList("QueryAllTrend");
	}


	@Override
	public void addTrend(Trend trend) throws SQLException {
		// TODO Auto-generated method stub
		sqlMapClient.insert("AddTrend", trend);
	}

}
