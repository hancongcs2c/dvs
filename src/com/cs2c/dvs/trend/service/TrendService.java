package com.cs2c.dvs.trend.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.Trend;

public interface TrendService {
	List<HashMap> queryTrByUser(int userId) throws SQLException;
	List<HashMap> queryAllTrend() throws SQLException;
	void addTrend(Trend trend) throws SQLException;
}
