package com.cs2c.dvs.user.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.dao.UserDao;
import com.cs2c.dvs.pojo.Role;
import com.cs2c.dvs.pojo.User;
import com.cs2c.dvs.user.service.UserService;

//@Transactional(rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {

	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	@SuppressWarnings("rawtypes")
	@Override
	public HashMap isValidate(String userEmail, String userPassword)
			throws SQLException {
		return dao.isValidate(userEmail, userPassword);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public HashMap isUserValidate(String userEmail, String userPassword)
			throws SQLException {
		return dao.isUserValidate(userEmail, userPassword);
	}

	@Override
	public void addUser(User user, int roleId, String userEmail) throws SQLException {
		dao.addUser(user);
		dao.addUserRole(roleId, userEmail);
		System.out.println("service:roleId"+roleId+"user:"+user.toString());
	}

	@Override
	public List<Role> queryRole() throws SQLException {
		return dao.queryRole();
	}

	@Override
	public User queryByEmail(String userEmail) throws SQLException {
		return dao.queryByEmail(userEmail);
	}

	@Override
	public void deleteUser(int userId) throws SQLException {
		dao.deleteUser(userId);
	}

	@Override
	public void recoverUser(int userId) throws SQLException {
		dao.recoverUser(userId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updateUser(HashMap userMap) throws SQLException {
		dao.updateUser(userMap);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public HashMap queryUserById(int userId) throws SQLException {
		return dao.queryUserById(userId);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<HashMap> queryAllUser(Pager pager, String departId)
			throws SQLException {
		return dao.queryAllUser(pager, departId);
	}


	@Override
	public int getCount(String departId) throws SQLException {
		return dao.getCount(departId);
	}


}
