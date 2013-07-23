package com.cs2c.dvs.user.action;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.cs2c.dvs.common.BaseAction;
import com.cs2c.dvs.common.Pager;
import com.cs2c.dvs.depart.service.DepartService;
import com.cs2c.dvs.pojo.Depart;
import com.cs2c.dvs.pojo.Role;
import com.cs2c.dvs.pojo.User;
import com.cs2c.dvs.user.service.UserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class UserAction extends BaseAction implements Action {

	private static final long serialVersionUID = 1L;
	private UserService service;
	@SuppressWarnings("rawtypes")
	private List<HashMap> userList;

	private DepartService departService;
	private int userId;
	private String userEmail;
	private String userTruename;
	private int departId;
	private String userPassword;
	private Date userCredate;
	private Date userUpdate;
	private List<Depart> departList;

	private List<Role> roleList;
	@SuppressWarnings("rawtypes")
	private HashMap userMap;
	private String submitFlag;
	private Pager pager;
	private int pageNum;
	private int roleId;
	private String pageNumStr;
	private String departIdStr;

	public Pager getPager() {
		return pager;
	}

	public String getPageNumStr() {
		return pageNumStr;
	}

	public void setPageNumStr(String pageNumStr) {
		this.pageNumStr = pageNumStr;
	}

	public String getDepartIdStr() {
		return departIdStr;
	}

	public void setDepartIdStr(String departIdStr) {
		this.departIdStr = departIdStr;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getSubmitFlag() {
		return submitFlag;
	}

	public void setSubmitFlag(String submitFlag) {
		this.submitFlag = submitFlag;
	}

	public DepartService getDepartService() {
		return departService;
	}

	public List<Depart> getDepartList() {
		return departList;
	}

	public void setDepartList(List<Depart> departList) {
		this.departList = departList;
	}

	public void setDepartService(DepartService departService) {
		this.departService = departService;
	}

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@SuppressWarnings("rawtypes")
	public HashMap getUserMap() {
		return userMap;
	}

	@SuppressWarnings("rawtypes")
	public void setUserMap(HashMap userMap) {
		this.userMap = userMap;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@SuppressWarnings("rawtypes")
	public List<HashMap> getUserList() {
		return userList;
	}

	@SuppressWarnings("rawtypes")
	public void setUserList(List<HashMap> userList) {
		this.userList = userList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmail() {

		return userEmail.replace("%40", "@");
	}

	public void setUserEmail(String userEmail) {

		userEmail = userEmail.replace("%40", "@");
		this.userEmail = userEmail;
	}

	public String getUserTruename() {
		return userTruename;
	}

	public void setUserTruename(String userTruename) {

		this.userTruename = userTruename;
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
		this.userCredate = new Date();
	}

	public Date getUserUpdate() {
		return userUpdate;
	}

	public void setUserUpdate(Date userUpdate) {
		this.userUpdate = new Date();
	}

	/*
	 * 管理员登录
	 */
	public String login() {

		try {

			ActionContext context = ActionContext.getContext();

			userMap = service.isValidate(userEmail, userPassword);
			System.out.println("usermap:" + userMap);

			if (userMap != null) {
				context.getSession()
						.put("userEmail", userMap.get("USER_EMAIL"));
				context.getSession().put("roleId", userMap.get("ROLE_ID"));
				context.getSession().put("roleName", userMap.get("ROLE_NAME"));
				context.getSession().put("departName",
						userMap.get("DEPART_NAME"));
				context.getSession().put("userTruename",
						userMap.get("USER_TRUENAME"));
				return "success";
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	/*
	 * 用户登录
	 */
	public String userLogin() {

		try {

			ActionContext context = ActionContext.getContext();

			userMap = service.isUserValidate(userEmail, userPassword);
			//System.out.println("usermap:" + userMap);

			if (userMap != null) {
				context.getSession()
						.put("userEmail", userMap.get("USER_EMAIL"));
				context.getSession().put("roleId", userMap.get("ROLE_ID"));
				context.getSession().put("roleName", userMap.get("ROLE_NAME"));
				context.getSession().put("departName",
						userMap.get("DEPART_NAME"));
				context.getSession().put("userTruename",
						userMap.get("USER_TRUENAME"));
				return "success";
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	/*
	 * 用户注销
	 */
	public String logout() {
		this.session.clear();
		return "error";
	}

	public void init() {
		if (departId == 0) {
			departIdStr = null;
		}
	}

	/*
	 * 查询所有用户
	 */
	public String queryAllUser() {
		init();
		HttpSession session = servletRequest.getSession();

		/* 用session记录查询条件 */
		if ("yes".equals(this.submitFlag)) {
			if (this.departId != 0) {
				session.setAttribute("departId", this.departId);
				this.departIdStr = session.getAttribute("departId").toString();
			}

		}

		try {
			departList = departService.queryAllDepart();
			pager = new Pager(service.getCount(departIdStr), pageNum);
			userList = service.queryAllUser(pager, departIdStr);
			// System.out.println(service.queryAllUser(pager,departIdStr).size());
		} catch (SQLException e) {
			e.printStackTrace();
			pageNum = 1;
		}

		return "queryAllUser";

	}

	/*
	 * 添加用户同时分配角色
	 */
	@common.validation.FormValidator(input = "paraNull", value = "userEmail,nimemei,required validate-email;"
			+ "userTruename,nimeime-name,required validate-chinese;"
			+ "userPassword,密码,required")
	public String addUser() throws Exception {
		userCredate = new Date();
		userUpdate = new Date();

			User user = new User(userId, this.userEmail, this.getUserTruename(),
				this.departId, this.userPassword, userCredate, userUpdate);
			service.addUser(user, roleId, userEmail);
			// System.out.println("^^^Action:departId" +departId + "user:"+
			// user.toString());
			return "addUser";		
	}

	public String toAdd() throws Exception {
		this.roleList = service.queryRole();
		return "toAdd";
	}

	/*
	 * ajax查询email是否存在
	 */
	public void queryByEmail() throws SQLException {
		Writer out = null;
		try {
			out = this.servletResponse.getWriter();
			User user = service.queryByEmail(userEmail);
			if (user == null) {
				// System.out.println("Email不存在，可以使用"+userEmail);
				out.write("true");
			} else {
				// System.out.println("Email存在，不可以使用"+userEmail);
				out.write("false");
			}
		} catch (IOException e1) {
			e1.printStackTrace();

		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String deleteUser() {
		try {
			service.deleteUser(userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "deleteUser";
	}

	public String recoverUser() {
		try {
			service.recoverUser(userId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "recoverUser";
	}

	public String queryUserById() {
		try {
			userMap = service.queryUserById(userId);
			departList = departService.queryAllDepart();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "queryUserById";
	}

	@common.validation.FormValidator(input = "paraNull", value = "userEmail,nimemei,required validate-email;"
			+ "userTruename,nimeime-name,required validate-chinese")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String updateUser() {
		HashMap userMap = new HashMap();
		userMap.put("userId", userId);
		userMap.put("userEmail", userEmail);
		userMap.put("userTruename", userTruename);
		userMap.put("departId", departId);
		userMap.put("userUpdate", new Date());
		userMap.put("roleId", roleId);
		// System.out.println(userMap);

		try {
			service.updateUser(userMap);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "updateUser";
	}

}
