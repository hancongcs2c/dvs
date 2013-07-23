<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.User"%>
<%@ page import="com.cs2c.dvs.pojo.Depart"%>
<input type="hidden" name="userId" value="${userMap['USER_ID'] }">
<div class="control-group">
	<label class="control-label" for="UPuserEmail">邮箱</label>
	<div class="controls ">
		<input type="text" id="UPuserEmail" name="userEmail" value="${userMap['USER_EMAIL'] }">
		<span class="help help-inline" id="UPue"></span>
	</div>
	
</div>

<div class="control-group">
	<label class="control-label" for="UPinputTruename">真实姓名</label>
	<div class="controls">
		<input type="text" id="UPinputTruename" name="userTruename" value="${userMap['USER_TRUENAME'] }">
		<span class="help help-inline" id="UPtn"></span>
	</div>
</div>

<div class="control-group">
	<label class="control-label" for="UPselectDepart">部门</label>
	<div class="controls" id="UPdepartSelectDiv">
		<select name="departId">
			<c:forEach items="${requestScope.departList}" var="depart">
				<option value="${depart['DEPART_ID'] }">${depart['DEPART_NAME']}</option>
			</c:forEach>
		</select>
	</div>
</div>

<div class="control-group">
	<label class="control-label" for="UPinputPassword">密码</label>
	<div class="controls">
		<input type="text" id="UPinputPassword" name="userPassword" value="${userMap['USER_PASSWORD'] }">
			<span class="help help-inline" id="UPpw"></span>
	</div>
</div>

<div class="control-group">
	<div class="controls">
		<div>
			<label class="radio inline">
			<c:choose>
				<c:when test="${userMap['ROLE_ID']==1 }">
					<input type="radio" name="roleId" id="UProleAdmin" value="1" checked>
				</c:when>
				<c:otherwise>
					<input type="radio" name="roleId" id="UProleAdmin" value="1">
				</c:otherwise>
			</c:choose>
			  管理员
			</label>
			
			<label class="radio inline">
			<c:choose>
				<c:when test="${userMap['ROLE_ID']==1 }">
					<input type="radio" name="roleId" id="UProleUser" value="0">
				</c:when>
				<c:otherwise>
					<input type="radio" name="roleId" id="UProleUser" value="0" checked>
				</c:otherwise>
			</c:choose>
			  
			  普通用户
			</label>
			
		</div>
				<button type="submit" class="btn btn-success">修改</button>
		
	</div>
</div>