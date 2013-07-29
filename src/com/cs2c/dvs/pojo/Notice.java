/**
 * 
 */
package com.cs2c.dvs.pojo;

import java.util.Date;

/**
 * @author hancong
 *
 */
public class Notice {
	private int noticeId;
	private String noticeTitle;
	private Date noticeCredate;
	private Date noticeUpdate;
	private String noticeAuthor;
	private String noticeBody;
	
	
	
	public Notice() {
		super();
	}



	public Notice(String noticeTitle, Date noticeCredate, Date noticeUpdate,
			String noticeAuthor, String noticeBody) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeCredate = noticeCredate;
		this.noticeUpdate = noticeUpdate;
		this.noticeAuthor = noticeAuthor;
		this.noticeBody = noticeBody;
	}

	public Notice(int noticeId, String noticeTitle,	Date noticeUpdate, String noticeAuthor, String noticeBody) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.noticeUpdate = noticeUpdate;
		this.noticeAuthor = noticeAuthor;
		this.noticeBody = noticeBody;
	}

	public Notice(int noticeId, String noticeTitle, Date noticeCredate,
			Date noticeUpdate, String noticeAuthor, String noticeBody) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.noticeCredate = noticeCredate;
		this.noticeUpdate = noticeUpdate;
		this.noticeAuthor = noticeAuthor;
		this.noticeBody = noticeBody;
	}



	public int getNoticeId() {
		return noticeId;
	}



	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}



	public String getNoticeTitle() {
		return noticeTitle;
	}



	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}



	public Date getNoticeCredate() {
		return noticeCredate;
	}



	public void setNoticeCredate(Date noticeCredate) {
		this.noticeCredate = noticeCredate;
	}



	public Date getNoticeUpdate() {
		return noticeUpdate;
	}



	public void setNoticeUpdate(Date noticeUpdate) {
		this.noticeUpdate = noticeUpdate;
	}



	public String getNoticeAuthor() {
		return noticeAuthor;
	}



	public void setNoticeAuthor(String noticeAuthor) {
		this.noticeAuthor = noticeAuthor;
	}



	public String getNoticeBody() {
		return noticeBody;
	}



	public void setNoticeBody(String noticeBody) {
		this.noticeBody = noticeBody;
	}



	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle
				+ ", noticeCredate=" + noticeCredate + ", noticeUpdate="
				+ noticeUpdate + ", noticeAuthor=" + noticeAuthor
				+ ", noticeBody=" + noticeBody + "]";
	}
	
	
}
