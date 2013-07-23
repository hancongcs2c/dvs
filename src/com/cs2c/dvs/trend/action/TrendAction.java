package com.cs2c.dvs.trend.action;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.Trend;
import com.cs2c.dvs.trend.service.TrendService;

public class TrendAction {

	private TrendService service;
	
	private int trendId;
	private int trendWeeknum;
	private int comId;
	private String inopn;
	private String summary;
	private String col;
	private String status;
	private Date c_time;
	private String emailNum;
	private String translation;
	private String techArticle;
	private String ircMeeting;
	private String forumPosts;
	private Date o_time;
	private int userId;
	private Date trendCredate;
	private Date trendUpdate;
	
	@SuppressWarnings("rawtypes")
	private List<HashMap> userTrendList;
	@SuppressWarnings("rawtypes")
	private List<HashMap> trendList;
	@SuppressWarnings("rawtypes")
	private HashMap TrendMap;
	private Trend trend;
	

	public Trend getTrend() {
		return trend;
	}

	public void setTrend(Trend trend) {
		this.trend = trend;
	}

	public TrendService getService() {
		return service;
	}

	public void setService(TrendService service) {
		this.service = service;
	}


	public int getTrendId() {
		return trendId;
	}

	public void setTrendId(int trendId) {
		this.trendId = trendId;
	}

	public int getTrendWeeknum() {
		return trendWeeknum;
	}

	public void setTrendWeeknum(int trendWeeknum) {
		this.trendWeeknum = trendWeeknum;
	}

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	
	public String getInopn() {
		return inopn;
	}

	public void setInopn(String inopn) {
		this.inopn = inopn;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getC_time() {
		return c_time;
	}

	public void setC_time(Date c_time) {
		this.c_time = c_time;
	}

	public String getEmailNum() {
		return emailNum;
	}

	public void setEmailNum(String emailNum) {
		this.emailNum = emailNum;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String getTechArticle() {
		return techArticle;
	}

	public void setTechArticle(String techArticle) {
		this.techArticle = techArticle;
	}

	public String getIrcMeeting() {
		return ircMeeting;
	}

	public void setIrcMeeting(String ircMeeting) {
		this.ircMeeting = ircMeeting;
	}

	public String getForumPosts() {
		return forumPosts;
	}

	public void setForumPosts(String forumPosts) {
		this.forumPosts = forumPosts;
	}

	public Date getO_time() {
		return o_time;
	}

	public void setO_time(Date o_time) {
		this.o_time = o_time;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getTrendCredate() {
		return trendCredate;
	}

	public void setTrendCredate(Date trendCredate) {
		this.trendCredate = trendCredate;
	}

	public Date getTrendUpdate() {
		return trendUpdate;
	}

	public void setTrendUpdate(Date trendUpdate) {
		this.trendUpdate = trendUpdate;
	}

	@SuppressWarnings("rawtypes")
	public List<HashMap> getUserTrendList() {
		return userTrendList;
	}

	@SuppressWarnings("rawtypes")
	public void setUserTrendList(List<HashMap> userTrendList) {
		this.userTrendList = userTrendList;
	}

	@SuppressWarnings("rawtypes")
	public List<HashMap> getTrendList() {
		return trendList;
	}

	@SuppressWarnings("rawtypes")
	public void setTrendList(List<HashMap> trendList) {
		this.trendList = trendList;
	}

	@SuppressWarnings("rawtypes")
	public HashMap getTrendMap() {
		return TrendMap;
	}

	@SuppressWarnings("rawtypes")
	public void setTrendMap(HashMap trendMap) {
		TrendMap = trendMap;
	}
	
	public String queryAllTrend(){
		try {
			trendList = service.queryAllTrend();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryAllTrend";
	}
	public String queryTrByUser(){
		try {
			userTrendList = service.queryTrByUser(userId);
			//System.out.println("userTrendList"+userTrendList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryTrByUser";
	}
	public String addTrend(){
		this.trendCredate = new Date();
		this.trendUpdate = new Date();
		trend = new Trend(this.trendWeeknum,this.comId,this.inopn,this.summary,this.col,this.status,
				this.c_time,this.emailNum,this.translation,this.techArticle,this.ircMeeting,this.forumPosts,
				this.o_time,this.userId,this.trendCredate,this.trendUpdate);
		try {
			service.addTrend(trend);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "addTrend";
	}
}
