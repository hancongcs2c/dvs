package com.cs2c.dvs.news.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.news.service.NewsService;
import com.cs2c.dvs.pojo.News;

public class NewsAction {

	private int newsId;
	private String catgory;
	private String title;
	private String pubDate;
	private String link;
	private String description;
	
	private NewsService service;
	
	private News news;
	@SuppressWarnings("rawtypes")
	private List<HashMap> newsList;
	


	@SuppressWarnings("rawtypes")
	public List<HashMap> getNewsList() {
		return newsList;
	}

	@SuppressWarnings("rawtypes")
	public void setNewsList(List<HashMap> newsList) {
		this.newsList = newsList;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getCatgory() {
		return catgory;
	}

	public void setCatgory(String catgory) {
		this.catgory = catgory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NewsService getService() {
		return service;
	}

	public void setService(NewsService service) {
		this.service = service;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}
	
	public String queryNews(){
		try {
			newsList = service.queryNews();
			//System.out.println("$$$$$$newsList:"+newsList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryNews";
	}
	
}
