<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.User"%>

<jsp:include page="common/header.jsp"></jsp:include>


<div class="hero-unit db">
	
	<div class="panel span7">
		<h4>所有用户
		<c:if test="${sessionScope.roleId==1 }">
		<a  data-target="#addUserModal" role="button" data-toggle="modal"
				class="btn-warning btn adduser">添加</a></c:if></h4>
		<!--search form-->
		<form class="boardform" action="<%=request.getContextPath() %>/user/queryAllUser.action?submitFlag=yes" method="post">
			<label for="selectDepart">部门：</label> 
			<select id="selectDepart" name="departId">
				<option value="0">--请选择--</option>
				<c:forEach items="${requestScope.departList }" var="depart">
					<option value="${depart['DEPART_ID'] }">${depart['DEPART_NAME'] }</option>
				</c:forEach>
			</select>
			<button type="submit" class="btn">选择</button>
			
		</form>
		<div class="tb">
			<table class="table reguser1  table-hover table-striped">
				<tr>
					<th></th>
					<th>姓名</th>
					<th>邮箱</th>
					<th>部门</th>
					<c:if test="${sessionScope.roleId==1 }"><th>操作</th></c:if>
				</tr>
				<c:forEach items="${requestScope.userList}" var="user">
				<!-- 如果role_id=3显示浅灰色 -->
				<c:choose>
					<c:when test="${user['ROLE_ID']==3 }">
						<tr class="dimissionUser">
					</c:when>
					<c:otherwise>
						<tr>
					</c:otherwise>
				</c:choose>
							<td><input type="hidden" class="userIdHidden" value="${user['USER_ID']}" name="userId"></td>
							<td><a class="queryUserTrHref" title="修改信息">${user['USER_TRUENAME']}</a></td>
							<td><a href="mailto:${user['USER_EMAIL']}">${user['USER_EMAIL']}</a></td>
							<td>${user['DEPART_NAME']}</td>
							<c:if test="${sessionScope.roleId==1 }">
							<td>
							<c:choose>
								<c:when test="${user['ROLE_ID']==3 }">
									<a class="recoverUserHref">恢复</a>
								</c:when>
								<c:otherwise>
									<a href="#updateUserModal" class="updateUserHref">修改</a> | <a class="deleteUserHref">删除</a>
								</c:otherwise>
							</c:choose>
							</td>
							</c:if>
						</tr>
				</c:forEach>
			</table>
			<p class="pageTip">共${pager.recordCount}条记录，${pager.pageCount }页</p>
			<div class="pagination pagination-centered">						
				<ul>
					<li></li>
					<li class="disabled"><a href="?pageNum=1">&laquo;</a></li>
					<li ><a href="?pageNum=${pager.pageNum-1 }">&lt;</a></li>
					<li class="active" ><a>${pager.pageNum }</a></li>
					<li><a href="?pageNum=${pager.pageNum+1 }">&gt;</a></li>
					<li><a href="?pageNum=${pager.pageCount}">&raquo;</a></li>
				</ul>
			</div>
		</div>
		<!--添加用户-->
		<div id="addUserModal" class="modal hide fade commu addUserModal" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 id="myModalLabel">添加用户</h4>
			</div>
			<div class="modal-body">
				<div class="narrowpanel">
					<form class="form-horizontal" action="<%=request.getContextPath() %>/user/addUser.action" method="post">
					<!-- <input type="hidden" name="userId"> -->
					<div class="control-group">
						<label class="control-label" for="userEmail">邮箱</label>
						<div class="controls ">
							<input type="text" id="userEmail" name="userEmail"
								placeholder="someone@cs2c.com.cn">
							<span class="help help-inline" id="ue"></span>
						</div>
						
					</div>

					<div class="control-group">
						<label class="control-label" for="inputTruename">真实姓名</label>
						<div class="controls">
							<input type="text" id="inputTruename" name="userTruename" placeholder="例：张三">
							<span class="help help-inline" id="tn"></span>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="selectDepart">部门</label>
						<div class="controls" id="departSelectDiv">
							
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="inputPassword">密码</label>
						<div class="controls">
							<input type="text" id="inputPassword" name="userPassword"
								placeholder="数字或字母开头不包含特殊字符">
								<span class="help help-inline" id="pw"></span>
						</div>
					</div>
					
					<div class="control-group">
						<div class="controls">
							<div>
								<label class="radio inline">
								  <input type="radio" name="roleId" id="roleAdmin" value="1" checked>
								  管理员
								</label>
								<label class="radio inline">
								  <input type="radio" name="roleId" id="roleUser" value="0">
								  普通用户
								</label>
								
							</div>
									<button type="submit" class="btn btn-success">添加</button>
							
						</div>
					</div>
				</form>
				
				</div>
			</div>
		</div>
		<!--添加用户over-->
		<!--修改用户-->
		<div id="updateUserModal" class="modal hide fade commu addUserModal" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 id="myModalLabel">修改用户</h4>
			</div>
			<div class="modal-body">
				<div class="narrowpanel">
					<form class="form-horizontal" action="<%=request.getContextPath() %>/user/updateUser.action" method="post">
					<!-- ajax -->
				</form>
				</div>
			</div>
		</div>
		<!--修改用户over-->
		<!--痕迹管理-->
		<div id="activity" class="modal hide fade commu" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 id="myModalLabel">贡献类型</h4>
			</div>
			<div class="modal-body">
				<div class="narrowpanel">
					<form class="form-horizontal comform allact" action="admin.jsp">
						<!-- ajax添加 -->
					</form>
				</div>
			</div>
		</div>
		<!--痕迹管理-->
	</div>
	<!-- ------------------------------------------------------------------------------------------------------------------------- -->	
	<div class="span3 rightpanel">
	<div class="panel reguser2"><!-- 本部分ajax加载标签云 --></div>
	<!-- --------------------------------------------------------------------------------------------- -->
	<div class="panel">
		<h4>社区</h4>
		<p id="coms"><!-- 此处ajax加载所有社区 --></p>
		<!-- 修改社区 -->
		<div id="updateCom" class="modalInline"><form><!-- 修改社区信息，ajax加载 --></form></div>
		<!-- 添加社区 -->
		<div id="addCom" class="modalInline" >
			<form>
			<div class="control-group">
				<input type="text" id="comName" name="comName"
					placeholder="社区名称">
				<span class="help help-inline" id="cn"></span>
			</div>
			
			<div class="control-group">
				<div class="controls comselect">
				
				<!-- 此处ajax加载社区 -->
				</div>
			</div>
			<c:if test="${sessionScope.roleId==1 }">
			<a class="addComHref">添加</a>
			</c:if>
				
			</form>
		</div>
	</div>

	<!-- ------------------------------------------------------------------------------------------------------------------------- -->	
	
	<div class="panel">
		<h4>部门</h4>
		<p class="reguser3"><!-- 本部分ajax加载 --></p>
		<!-- 修改部门-->
		<div id="updateDepart" class="modalInline"><form><!-- 修改社区信息，ajax加载 --></form></div>
		<!-- 添加部门 -->
		<div id="addDepart" class="modalInline" >
			<form>
			<input placeholder="部门名称" id="departNameInput" name="departName" type="text">
			<a class="addDepartName">添加</a>
			</form>
		</div>
	</div>
	</div>
	<!-- ------------------------------------------------------------------------------------------------------------------------- -->	
	<div class="clear"></div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>