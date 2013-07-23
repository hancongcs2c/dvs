/**
 * 
 */
package com.cs2c.dvs.notice.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.NoticeDao;
import com.cs2c.dvs.notice.service.NoticeService;
import com.cs2c.dvs.pojo.Notice;

/**
 * @author hancong
 *
 */
public class NoticeServiceImpl implements NoticeService {
	private NoticeDao dao;
	
	
	
	public void setDao(NoticeDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Notice> queryAllNotice() throws SQLException {
		return dao.queryAllNotice();
	}

	@Override
	public Notice queryNoticeById(int noticeId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.queryNoticeById(noticeId);
	}

	@Override
	public void addNotice(Notice notice) throws SQLException {
		dao.addNotice(notice);
		
	}

	@Override
	public void deleteNotice(int noticeId) throws SQLException {
		// TODO Auto-generated method stub
		dao.deleteNotice(noticeId);
	}

	@Override
	public void updateNotice(HashMap noticeMap) throws SQLException {
		// TODO Auto-generated method stub
		dao.updateNotice(noticeMap);
	}

}
