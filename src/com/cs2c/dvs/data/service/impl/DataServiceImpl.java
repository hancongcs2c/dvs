package com.cs2c.dvs.data.service.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.dao.DataDao;
import com.cs2c.dvs.data.service.DataService;
import com.cs2c.dvs.pojo.Data;

public class DataServiceImpl implements DataService {

	private DataDao dao;
	
	public DataDao getDao() {
		return dao;
	}


	public void setDao(DataDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Data> queryData(Pager pager, String name, String project,
			String affliation,Date startDate,Date overDate) throws SQLException {
		
		return dao.queryData(pager, name, project,affliation,startDate,overDate);
	}


	@Override
	public int getCount(String name, String project, String affliation,Date startDate,Date overDate)
			throws SQLException {
		return dao.getCount(name, project,affliation,startDate,overDate);
	}


	@Override
	public List<Data> queryData(String name, String project, String affliation,Date startDate,Date overDate)
			throws SQLException {
		return dao.queryData(name, project, affliation,startDate,overDate);
	}


	@Override
	public List<HashMap> queryRank(String community) throws SQLException {
		return dao.queryRank(community);
	}


	@Override
	public List<HashMap> querySumData() throws SQLException {
		return dao.querySumData();
	}

}
