package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.pojo.Notice;

public interface NoticeDao {
	Notice queryNoticeById(int noticeId) throws SQLException;
	List<Notice> queryAllNotice() throws SQLException;
	void addNotice(Notice notice) throws SQLException;
	void deleteNotice(int noticeId) throws SQLException;
	void updateNotice(HashMap noticeMap) throws SQLException;
}
