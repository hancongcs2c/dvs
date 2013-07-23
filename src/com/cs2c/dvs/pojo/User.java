package com.cs2c.dvs.pojo;

import java.util.Date;

public class User {
	private int userId;
	private String userEmail;
	private String userTruename;
	private int departId;
	private String userPassword;
	private Date userCredate;
	private Date userUpdate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userEmail, String userTruename, int departId,
			String userPassword, Date userCredate, Date userUpdate) {
		super();
		this.userEmail = userEmail;
		this.userTruename = userTruename;
		this.departId = departId;
		this.userPassword = userPassword;
		this.userCredate = userCredate;
		this.userUpdate = userUpdate;
	}


	public User(int userId, String userEmail, String userTruename,
			int departId, String userPassword, Date userCredate, Date userUpdate) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userTruename = userTruename;
		this.departId = departId;
		this.userPassword = userPassword;
		this.userCredate = userCredate;
		this.userUpdate = userUpdate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTruename() {
		return userTruename;
	}
	public void setUserTruename(String userTruename) {
		this.userTruename = userTruename;
	}
	public int getDepartId() {
		return departId;
	}
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getUserCredate() {
		return userCredate;
	}
	public void setUserCredate(Date userCredate) {
		this.userCredate = userCredate;
	}
	public Date getUserUpdate() {
		return userUpdate;
	}
	public void setUserUpdate(Date userUpdate) {
		this.userUpdate = userUpdate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail
				+ ", userTruename=" + userTruename + ", departId=" + departId
				+ ", userPassword=" + userPassword + ", userCredate="
				+ userCredate + ", userUpdate=" + userUpdate + "]";
	}
	
	

}
