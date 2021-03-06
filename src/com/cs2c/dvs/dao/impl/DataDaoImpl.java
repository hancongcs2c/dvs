package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.dao.DataDao;
import com.cs2c.dvs.pojo.Data;
import com.ibatis.sqlmap.client.SqlMapClient;

public class DataDaoImpl implements DataDao {
	
	private SqlMapClient sqlMapClient;
	
	
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}


	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Data> queryData(Pager pager, String name, String project,String affliation,Date startDate,Date overDate)
			throws SQLException {
		HashMap map = new HashMap();
		
		map.put("name", name);
		map.put("project", project);
		map.put("affliation", affliation);
		map.put("pageStart", pager.getStart());
		map.put("startDate", startDate);
		map.put("overDate", overDate);
		return sqlMapClient.queryForList("QueryData",map);
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int getCount(String name, String project,String affliation,Date startDate,Date overDate) throws SQLException {
		HashMap map = new HashMap();
		
		map.put("name", name);
		map.put("project", project);
		map.put("affliation", affliation);
		map.put("startDate", startDate);
		map.put("overDate", overDate);
		return (int) sqlMapClient.queryForObject("SelectDataCount", map);
	}


	@Override
	public void addData(Data data) throws SQLException {
		sqlMapClient.insert("AddData", data);
	}


	@Override
	public void deleteData() throws SQLException {
		sqlMapClient.delete("DeleteData");
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Data> queryData(String name, String project, String affliation,Date startDate,Date overDate) throws SQLException {
		HashMap map = new HashMap();
		
		map.put("name", name);
		map.put("project", project);
		map.put("affliation", affliation);
		map.put("startDate", startDate);
		map.put("overDate", overDate);
		return sqlMapClient.queryForList("QueryDataTotal",map);
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<HashMap> queryRank(String community) throws SQLException {
		return sqlMapClient.queryForList("QueryRank",community);
	}


	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<HashMap> querySumData() throws SQLException {
		return sqlMapClient.queryForList("QuerySumData");
	}

	
}
