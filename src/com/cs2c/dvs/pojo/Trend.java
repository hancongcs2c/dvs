package com.cs2c.dvs.pojo;

import java.util.Date;

public class Trend {

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
	
	public Trend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Trend(int trendId, int trendWeeknum, int comId, String inopn,
			String summary, String col, String status, Date c_time,
			String emailNum, String translation, String techArticle,
			String ircMeeting, String forumPosts, Date o_time, int userId,
			Date trendCredate, Date trendUpdate) {
		super();
		this.trendId = trendId;
		this.trendWeeknum = trendWeeknum;
		this.comId = comId;
		this.inopn = inopn;
		this.summary = summary;
		this.col = col;
		this.status = status;
		this.c_time = c_time;
		this.emailNum = emailNum;
		this.translation = translation;
		this.techArticle = techArticle;
		this.ircMeeting = ircMeeting;
		this.forumPosts = forumPosts;
		this.o_time = o_time;
		this.userId = userId;
		this.trendCredate = trendCredate;
		this.trendUpdate = trendUpdate;
	}

	public Trend(int trendWeeknum, int comId, String inopn, String summary,
			String col, String status, Date c_time, String emailNum,
			String translation, String techArticle, String ircMeeting,
			String forumPosts, Date o_time, int userId, Date trendCredate,
			Date trendUpdate) {
		super();
		this.trendWeeknum = trendWeeknum;
		this.comId = comId;
		this.inopn = inopn;
		this.summary = summary;
		this.col = col;
		this.status = status;
		this.c_time = c_time;
		this.emailNum = emailNum;
		this.translation = translation;
		this.techArticle = techArticle;
		this.ircMeeting = ircMeeting;
		this.forumPosts = forumPosts;
		this.o_time = o_time;
		this.userId = userId;
		this.trendCredate = trendCredate;
		this.trendUpdate = trendUpdate;
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

	@Override
	public String toString() {
		return "Trend [trendId=" + trendId + ", trendWeeknum=" + trendWeeknum
				+ ", comId=" + comId + ", inopn=" + inopn + ", summary="
				+ summary + ", col=" + col + ", status=" + status + ", c_time="
				+ c_time + ", emailNum=" + emailNum + ", translation="
				+ translation + ", techArticle=" + techArticle
				+ ", ircMeeting=" + ircMeeting + ", forumPosts=" + forumPosts
				+ ", o_time=" + o_time + ", userId=" + userId
				+ ", trendCredate=" + trendCredate + ", trendUpdate="
				+ trendUpdate + "]";
	}	
	
}
