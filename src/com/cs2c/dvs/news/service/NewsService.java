package com.cs2c.dvs.news.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.News;

public interface NewsService {

	void addNews(News news) throws SQLException;

	@SuppressWarnings("rawtypes")
	List<HashMap> queryNews()  throws SQLException;

	List<News> queryNewsByLink(String link) throws SQLException;
}
