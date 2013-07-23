package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.Com;

public interface ComDao {
	List<HashMap> queryAllCom() throws SQLException;
	
	void addCom(Com com) throws SQLException;
	
	void deleteCom(int comId) throws SQLException;
	
	HashMap queryComById(int comId) throws SQLException;
	
	void updateCom(Com com) throws SQLException;
}
