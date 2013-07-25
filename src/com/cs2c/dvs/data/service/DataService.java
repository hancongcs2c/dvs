package com.cs2c.dvs.data.service;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.pojo.Data;

public interface DataService {
	List<Data> queryData(Pager pager, String name, String project, String affliation,Date startDate,Date overDate) throws SQLException;

	int getCount(String name, String project, String affliation,Date startDate,Date overDate) throws SQLException;

	List<Data> queryData(String name, String project, String affliation,Date startDate,Date overDate) throws SQLException;
	
	List<HashMap> queryRank(String community) throws SQLException;
	
	List<HashMap> querySumData() throws  SQLException;
}
