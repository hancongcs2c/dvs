package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.NewsDao;
import com.cs2c.dvs.pojo.News;
import com.ibatis.sqlmap.client.SqlMapClient;

public class NewsDaoImpl implements NewsDao {

	private SqlMapClient sqlMapClient;
	
	
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> queryNewsByLink(String link) throws SQLException{
		return sqlMapClient.queryForList("QueryNewsByLink",link);
	}

	@Override
	public void addNews(News news) throws SQLException {
		sqlMapClient.insert("AddNews", news);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<HashMap> queryNews()  throws SQLException{
		return sqlMapClient.queryForList("QueryNews");
	}

}
