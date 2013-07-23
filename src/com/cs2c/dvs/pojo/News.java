package com.cs2c.dvs.pojo;


public class News {
	private int newsId;
	private String catgory;
	private String title;
	private String pubDate;
	private String link;
	private String description;
	
	
	public News() {
		super();
	}

	public News(String catgory, String title, String pubDate, String link,
			String description) {
		super();
		this.catgory = catgory;
		this.title = title;
		this.pubDate = pubDate;
		this.link = link;
		this.description = description;
	}




	public News(int newsId, String catgory, String title, String pubDate,
			String link, String description) {
		super();
		this.newsId = newsId;
		this.catgory = catgory;
		this.title = title;
		this.pubDate = pubDate;
		this.link = link;
		this.description = description;
	}

	public String getCatgory() {
		return catgory;
	}

	public void setCatgory(String catgory) {
		this.catgory = catgory;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
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
		//System.out.println("###"+pubDate);
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

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", catgory=" + catgory + ", title="
				+ title + ", pubDate=" + pubDate + ", link=" + link
				+ ", description=" + description + "]";
	}


	
	
}
