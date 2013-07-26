package com.cs2c.dvs.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.pojo.Role;
import com.cs2c.dvs.pojo.User;

public interface UserDao {

	@SuppressWarnings("rawtypes")
	List<HashMap> queryAllUser(Pager pager, String departId) throws SQLException;

	@SuppressWarnings("rawtypes")
	HashMap isValidate(String userEmail, String userPassword)
			throws SQLException;
	@SuppressWarnings("rawtypes")
	HashMap isUserValidate(String userEmail, String userPassword)
			throws SQLException;
	void addUser(User user) throws SQLException;
	void addUserRole(int roleId, String userEmail) throws SQLException;
	List<Role> queryRole() throws SQLException;
	User queryByEmail(String userEmail) throws SQLException;
	void deleteUser(int userId) throws SQLException;
	void recoverUser(int userId) throws SQLException;
	@SuppressWarnings("rawtypes")
	void updateUser(HashMap userMap) throws SQLException;
	@SuppressWarnings("rawtypes")
	HashMap queryUserById(int userId) throws SQLException;
	int getCount(String departId) throws SQLException;
}
