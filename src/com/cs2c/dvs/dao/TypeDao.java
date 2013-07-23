package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.pojo.Type;

public interface TypeDao {

	Type queryTypeById(int typeId) throws SQLException;
	
	List<Type> queryAllType() throws SQLException;
}
