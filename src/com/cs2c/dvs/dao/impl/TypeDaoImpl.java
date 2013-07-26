package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.dao.TypeDao;
import com.cs2c.dvs.pojo.Type;
import com.ibatis.sqlmap.client.SqlMapClient;

public class TypeDaoImpl implements TypeDao {
	private SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public Type queryTypeById(int typeId) throws SQLException  {
		return (Type) sqlMapClient.queryForObject("QueryTypeById", typeId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Type> queryAllType() throws SQLException {
		return sqlMapClient.queryForList("QueryAllType");
	}

}
