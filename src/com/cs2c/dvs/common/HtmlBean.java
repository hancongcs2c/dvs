package com.cs2c.dvs.common;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.cs2c.dvs.dao.impl.NewsDaoImpl;
import com.cs2c.dvs.pojo.News;

public class HtmlBean implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	private static ArrayList<String> openofficeNewsList = new ArrayList<String>();
	
	public void iniOpenOfficeNewsList() {
		openofficeNewsList.add("https://blogs.apache.org/OOo/feed/entries/atom");
	}

	private void rss(String url, String website, String topic) throws IOException {
		
		//String xml = url;
		
		Document document = Jsoup.connect(url).timeout(100000).get();
		// 定位到所有li节点

		Elements itemList = document.getElementsByTag("li");
		for(Element itemNode : itemList){
			String catgory = website;
			String title = itemNode.tagName("h4").tagName("a").html();
			String pubDate = itemNode.tagName("h4").nextSibling().toString();
			String link = itemNode.tagName("h4").tagName("a").attr("href");
			//System.out.println(link);
			String description = null;
			
			//this.description = itemNode.selectSingleNode("description").getStringValue();
			NewsDaoImpl newsDao = (NewsDaoImpl) this.applicationContext.getBean("newsDaoImpl");
			System.out.println("openoffice------out3:"+newsDao);
			
			try {
				if(newsDao.queryNewsByLink(link).size()==0){
					
					News news = new News(catgory,title,pubDate,link,description);
					System.out.println("@@@@@@"+news);
					newsDao.addNews(news);
				}else{
					System.out.println("新闻已存在");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void rss_openofficeNews() throws IOException {
		System.out.println("openoffice:");
		// 同上
		iniOpenOfficeNewsList();
		for (int i = 0; i < openofficeNewsList.size(); i++) {
			this.rss(openofficeNewsList.get(i), "OpenOffice", "新闻");
		}
		openofficeNewsList.clear();
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;

	}

	
}
