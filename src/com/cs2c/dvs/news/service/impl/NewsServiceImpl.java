package com.cs2c.dvs.news.service.impl;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.NewsDao;
import com.cs2c.dvs.news.service.NewsService;
import com.cs2c.dvs.pojo.News;


public class NewsServiceImpl implements NewsService {

	private NewsDao dao;

	public NewsDao getDao() {
		return dao;
	}

	public void setDao(NewsDao dao) {
		this.dao = dao;
	}

	@Override
	public void addNews(News news) throws SQLException {
		// TODO Auto-generated method stub
		dao.addNews(news);
	}

	@Override
	public List<HashMap> queryNews()  throws SQLException{
		// TODO Auto-generated method stub
		return dao.queryNews();
	}

	@Override
	public List<News> queryNewsByLink(String link) throws SQLException{
		return dao.queryNewsByLink(link);
		
	}

	

}
