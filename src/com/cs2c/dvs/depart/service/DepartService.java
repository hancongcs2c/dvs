package com.cs2c.dvs.depart.service;

import java.sql.SQLException;
import java.util.List;

import com.cs2c.dvs.pojo.Depart;

public interface DepartService {
	List<Depart> queryAllDepart() throws SQLException;
	Depart queryDepartById(int departId) throws SQLException;
	void addDepart(String departName) throws SQLException;
}
