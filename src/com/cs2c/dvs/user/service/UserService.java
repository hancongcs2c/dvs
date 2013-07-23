package com.cs2c.dvs.user.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.pojo.Role;
import com.cs2c.dvs.pojo.User;

public interface UserService {
	List<HashMap> queryAllUser(Pager pager,String departIdStr) throws SQLException;

	HashMap isValidate(String userEmail, String userPassword)
			throws SQLException;
	HashMap isUserValidate(String userEmail, String userPassword)
			throws SQLException;
	void addUser(User user, int roleId, String userEmail) throws SQLException;
	
	List<Role> queryRole() throws SQLException;
	
	User queryByEmail(String email) throws SQLException;
	
	void deleteUser(int userId) throws SQLException;
	
	void recoverUser(int userId) throws SQLException;
	
	void updateUser(HashMap userMap) throws SQLException;
	HashMap queryUserById(int userId) throws SQLException;
	int getCount(String departIdStr) throws SQLException;
}
