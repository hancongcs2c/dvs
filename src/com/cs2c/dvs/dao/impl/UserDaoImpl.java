package com.cs2c.dvs.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.dao.UserDao;
import com.cs2c.dvs.pojo.Role;
import com.cs2c.dvs.pojo.User;
import com.ibatis.sqlmap.client.SqlMapClient;

public class UserDaoImpl implements UserDao {

private SqlMapClient sqlMapClient;
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public HashMap isValidate(String userEmail, String userPassword)
			throws SQLException {
		HashMap map = new HashMap();
		map.put("userEmail", userEmail);
		map.put("userPassword", userPassword);
		System.out.println("dao"+sqlMapClient.queryForObject("IsValidate", map));
		System.out.println("dao:email:"+userEmail+",userPassword:"+userPassword);
		return (HashMap) sqlMapClient.queryForObject("IsValidate", map);
	}

	@Override
	public HashMap isUserValidate(String userEmail, String userPassword)
			throws SQLException {
		HashMap map = new HashMap();
		map.put("userEmail", userEmail);
		map.put("userPassword", userPassword);
		System.out.println("dao"+sqlMapClient.queryForObject("IsValidate", map));
		System.out.println("dao:email:"+userEmail+",userPassword:"+userPassword);
		return (HashMap) sqlMapClient.queryForObject("IsUserValidate", map);
	}


	@SuppressWarnings("unchecked")
	@Override
	public void addUser(User user) throws SQLException {
		@SuppressWarnings("rawtypes")
		HashMap userMap = new HashMap();
		userMap.put("userEmail", user.getUserEmail());
		userMap.put("userTruename", user.getUserTruename());
		userMap.put("departId", user.getDepartId());
		userMap.put("userPassword", user.getUserPassword());
		userMap.put("userCredate", user.getUserCredate());
		userMap.put("userUpdate", user.getUserUpdate());
		System.out.println("dao:"+"usermap:"+userMap);
		sqlMapClient.insert("AddUser", userMap);
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public void addUserRole(int roleId, String userEmail) throws SQLException {
			@SuppressWarnings("rawtypes")
			HashMap userRoleMap = new HashMap();
			userRoleMap.put("roleId", roleId);
			userRoleMap.put("userEmail", userEmail);
			System.out.println("dao:roleId"+roleId+"userrolemap:"+userRoleMap);
			
			sqlMapClient.insert("InsertUserRole", userRoleMap);
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Role> queryRole() throws SQLException {
		return sqlMapClient.queryForList("QueryRole");
	}


	@Override
	public User queryByEmail(String userEmail) throws SQLException {
		
		return (User) sqlMapClient.queryForObject("QueryByEmail",userEmail);
	}


	@Override
	public void deleteUser(int userId) throws SQLException {
		sqlMapClient.update("DeleteUser", userId);
	}


	@Override
	public void recoverUser(int userId) throws SQLException {
		sqlMapClient.update("RecoverUser", userId);
	}


	@SuppressWarnings("rawtypes")
	@Override
	public void updateUser(HashMap userMap) throws SQLException {
		sqlMapClient.update("UpdateUser", userMap);
	}


	@SuppressWarnings("rawtypes")
	@Override
	public HashMap queryUserById(int userId) throws SQLException {
		return (HashMap) sqlMapClient.queryForObject("QueryUserById", userId);
	}


	@Override
	public List<HashMap> queryAllUser(Pager pager, String departId)
			throws SQLException {
		HashMap map = new HashMap();
		
		map.put("departId", departId);
		map.put("pageStart", pager.getStart());
		
		return sqlMapClient.queryForList("QueryAllUser",map);
	}


	@Override
	public int getCount(String departId) throws SQLException {
		return (int) sqlMapClient.queryForObject("SelectUserCount", departId);
	}


}
