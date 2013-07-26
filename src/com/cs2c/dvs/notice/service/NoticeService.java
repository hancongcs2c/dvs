package com.cs2c.dvs.notice.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.Notice;

public interface NoticeService {
	Notice queryNoticeById(int noticeId) throws SQLException;
	List<Notice> queryAllNotice() throws SQLException;
	void addNotice(Notice notice) throws SQLException;
	void deleteNotice(int noticeId) throws SQLException; 
	@SuppressWarnings("rawtypes")
	void updateNotice(HashMap noticeMap) throws SQLException;
}
