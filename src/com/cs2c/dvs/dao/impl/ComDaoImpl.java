/**
 * 
 */
package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.ComDao;
import com.cs2c.dvs.pojo.Com;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author hancong
 *
 */
public class ComDaoImpl implements ComDao {

	private SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public  List<HashMap> queryAllCom() throws SQLException {
		return sqlMapClient.queryForList("QueryAllCom");
	}

	@Override
	public void addCom(Com com) throws SQLException {
		sqlMapClient.insert("AddCom", com);
		
	}

	@Override
	public void deleteCom(int comId) throws SQLException {
		sqlMapClient.delete("DeleteCom", comId);
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public HashMap queryComById(int comId) throws SQLException {
		return (HashMap) sqlMapClient.queryForObject("QueryComById", comId);
	}

	@Override
	public void updateCom(Com com) throws SQLException {
		sqlMapClient.update("UpdateCom", com);
	}

}
