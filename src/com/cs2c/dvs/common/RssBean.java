package com.cs2c.dvs.common;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.cs2c.dvs.dao.impl.NewsDaoImpl;
import com.cs2c.dvs.pojo.News;

public class RssBean implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	private static String openstackNewsList = "http://www.openstack.org/blog/feed/";
	private static String monoNewsList ="http://news.mono-project.com/feed/";
	private static String canonicalNewsList = "http://www.canonical.com/rss.xml";
	private static String nebulaNewsList = "http://blog.opennebula.org/?feed=rss2";
	private static String eucalyptusNewsList = "http://www.eucalyptus.com/rss.xml";
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	private void rss(String url, String website, String topic){
		// 这里解析url的RSS文件
		URL xml;
		try {
			xml = new URL(url);
			// 获得SAXReader对象
			SAXReader reader = new SAXReader();

			// 获得文档对象
			Document document = reader.read(xml);
			// 定位到所有item节点

			List<Node> itemList = document.selectNodes("//rss/channel/item");
			for(Node itemNode : itemList){
				String catgory = website;
				String title = itemNode.selectSingleNode("title").getStringValue();
				String pubDate = itemNode.selectSingleNode("pubDate").getStringValue();
				String link = itemNode.selectSingleNode("link").getStringValue();
				//System.out.println(link);
				String description = null;
				
				//this.description = itemNode.selectSingleNode("description").getStringValue();
				NewsDaoImpl newsDao = (NewsDaoImpl) this.applicationContext.getBean("newsDaoImpl");
				int newSize = newsDao.queryNewsByLink(link).size();
				if(newSize==0){
					Date d = new Date(pubDate);
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    String curDate = format.format(d);
				    //System.out.println("%%%"+curDate);
				    pubDate = curDate;
					News news = new News(catgory,title,pubDate,link,description);
					System.out.println("@@@@@@"+news);
					try {
						newsDao.addNews(news);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}else{
					System.out.println("新闻已存在");
				}
				
			}
		} catch (MalformedURLException e2) {
			e2.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		
		
	}

	public void rss_openstackNews() throws DocumentException, IOException {
		this.rss(openstackNewsList, "OpenStack", "新闻");
	}

	public void rss_monoNews() throws DocumentException, IOException {
		this.rss(monoNewsList, "Mono", "新闻");
	}

	public void rss_canonicalNews() throws DocumentException, IOException {
		this.rss(canonicalNewsList, "Canonical", "新闻");
	}

	public void rss_nebulaNews() throws DocumentException, IOException {
		this.rss(nebulaNewsList, "OpenNebula", "新闻");
	}
	public void rss_EucalyptusNews() throws DocumentException, IOException {
		this.rss(eucalyptusNewsList, "Eucalyptus", "新闻");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;

	}



	
}
