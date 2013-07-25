/**
 * 
 */
package com.cs2c.dvs.notice.action;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.notice.service.NoticeService;
import com.cs2c.dvs.pojo.Notice;

/**
 * @author hancong
 *
 */
public class NoticeAction extends BaseAction {

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	private NoticeService service;
	private Notice notice;
	private List<Notice> noticeList;
	
	private int noticeId;
	private String noticeTitle;
	private Date noticeCredate;
	private Date noticeUpdate;
	private String noticeAuthor;
	private String noticeBody;


	public List<Notice> getNoticeList() {
		return noticeList;
	}
	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	public void setService(NoticeService service) {
		this.service = service;
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
	
	public String queryNoticeById(){
		try {
			notice = service.queryNoticeById(noticeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryNoticeById";
	}
	
	public String queryAllNotice(){
		try {
			noticeList = service.queryAllNotice();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryAllNotice";
	}
	
	public String addNotice(){
		noticeCredate = new Date();
		noticeUpdate = new Date();
		
		notice = new Notice(this.noticeTitle,noticeCredate,noticeUpdate,this.noticeAuthor,this.noticeBody);
		try {
			service.addNotice(notice);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "addNotice";
	}
	
	public String deleteNotice(){
		try {
			service.deleteNotice(noticeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "deleteNotice";
	}
	
	public String updateNotice(){
		
		HashMap noticeMap = new HashMap();
		noticeMap.put("noticeId", noticeId);
		noticeMap.put("noticeTitle",  noticeTitle);
		noticeMap.put("noticeUpdate", new Date());
		noticeMap.put("noticeAuthor", noticeAuthor);
		noticeMap.put("noticeBody", noticeBody);
		try {
			service.updateNotice(noticeMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "updateNotice";
	}

}
