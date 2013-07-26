package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.dao.DepartDao;
import com.cs2c.dvs.pojo.Depart;
import com.ibatis.sqlmap.client.SqlMapClient;

public class DepartDaoImpl implements DepartDao {

	private SqlMapClient sqlMapClient;
	
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}


	@Override
	public Depart queryDepartById(int departId) throws SQLException {
		return (Depart) sqlMapClient.queryForObject("QueryDepartById", departId);
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Depart> queryAllDepart() throws SQLException {
		return sqlMapClient.queryForList("QueryAllDepart");
	}


	@Override
	public void addDepart(String departName)  throws SQLException{
		sqlMapClient.insert("AddDepart", departName);
	}

}
