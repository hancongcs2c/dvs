/**
 * 
 */
package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.dao.NoticeDao;
import com.cs2c.dvs.pojo.Notice;
import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author hancong
 *
 */
public class NoticeDaoImpl implements NoticeDao {
	private SqlMapClient sqlMapClient;
	
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}


	@Override
	public List<Notice> queryAllNotice() throws SQLException {
		return sqlMapClient.queryForList("QueryAllNotice");
	}

	@Override
	public Notice queryNoticeById(int noticeId) throws SQLException {
		// TODO Auto-generated method stub
		return (Notice) sqlMapClient.queryForObject("QueryNoticeById", noticeId);
	}


	@Override
	public void addNotice(Notice notice) throws SQLException {
		sqlMapClient.insert("AddNotice", notice);
		
	}


	@Override
	public void deleteNotice(int noticeId) throws SQLException {
		// TODO Auto-generated method stub
		sqlMapClient.delete("DeleteNotice", noticeId);
	}


	@Override
	public void updateNotice(HashMap noticeMap) throws SQLException {
		// TODO Auto-generated method stub
		sqlMapClient.update("UpdateNotice",noticeMap);
	}

}
