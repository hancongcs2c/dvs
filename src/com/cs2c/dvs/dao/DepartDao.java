package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.pojo.Depart;

public interface DepartDao {
	List<Depart> queryAllDepart() throws SQLException;
	Depart queryDepartById(int departId) throws SQLException;
	void addDepart(String departName) throws SQLException;
}
