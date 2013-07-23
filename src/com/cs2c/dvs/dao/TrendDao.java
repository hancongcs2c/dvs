package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.Trend;

public interface TrendDao {
	List<HashMap> queryTrByUser(int userId) throws SQLException;
	List<HashMap> queryAllTrend()  throws SQLException;
	void addTrend(Trend trend) throws SQLException;
}
