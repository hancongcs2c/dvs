package com.cs2c.dvs.data.service.impl;

import java.sql.SQLException;
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
			String affliation) throws SQLException {
		return dao.queryData(pager, name, project,affliation);
	}


	@Override
	public int getCount(String name, String project, String affliation)
			throws SQLException {
		return dao.getCount(name, project,affliation);
	}


	@Override
	public List<Data> queryData(String name, String project, String affliation)
			throws SQLException {
		return dao.queryData(name, project, affliation);
	}


	@Override
	public List<HashMap> queryRank(String community) throws SQLException {
		return dao.queryRank(community);
	}

}
