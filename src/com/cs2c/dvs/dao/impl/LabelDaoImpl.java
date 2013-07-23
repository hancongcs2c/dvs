package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.dao.LabelDao;
import com.cs2c.dvs.pojo.Label;
import com.ibatis.sqlmap.client.SqlMapClient;

public class LabelDaoImpl implements LabelDao {

	private SqlMapClient sqlMapClient;
	
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}


	@Override
	public List<Label> queryAllLabel() throws SQLException {
		//System.out.println("dao:"+sqlMapClient.queryForList("QueryAllLabel"));
		return sqlMapClient.queryForList("QueryAllLabel");
	}


	@Override
	public void addLabel(Label label) throws SQLException {
		sqlMapClient.insert("AddLabel", label);
		
	}


	@Override
	public void deleteLabel(int labelId) throws SQLException {
		sqlMapClient.delete("DeleteLabel", labelId);
		
	}


	@Override
	public void updateLabel(Label label) throws SQLException {
		System.out.println("----"+label.toString());
		sqlMapClient.update("UpdateLabel", label);
		
	}

}
