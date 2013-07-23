package com.cs2c.dvs.pojo;

public class Role {
	private int roleId;
	private String roleName;
	private String roleDesc;
	private String roleExt1;
	private String roleExt2;
	
	public Role(int roleId, String roleName, String roleDesc) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}
	public Role(int roleId, String roleName, String roleDesc, String roleExt1,
			String roleExt2) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.roleExt1 = roleExt1;
		this.roleExt2 = roleExt2;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public String getRoleExt1() {
		return roleExt1;
	}
	public void setRoleExt1(String roleExt1) {
		this.roleExt1 = roleExt1;
	}
	public String getRoleExt2() {
		return roleExt2;
	}
	public void setRoleExt2(String roleExt2) {
		this.roleExt2 = roleExt2;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleDesc=" + roleDesc + ", roleExt1=" + roleExt1
				+ ", roleExt2=" + roleExt2 + "]";
	}
	
	
}
