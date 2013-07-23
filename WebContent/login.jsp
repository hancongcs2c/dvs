<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/jsp/common/header.jsp"></jsp:include>

<!--login form-->
<div class="hero-unit">
	<div class="tabbable">
		<!-- Only required for left/right tabs -->
		<ul class="nav nav-tabs">
			<li class="active"><a href="#user" data-toggle="tab">用户登录</a></li>
			<li><a href="#admin" data-toggle="tab">管理员登录</a></li>
		</ul>
		<div class="tab-content login">
			<div class="tab-pane active" id="user">
				<form class="form-horizontal" action="<%=request.getContextPath()%>/userLogin.action" method="post">
					<div class="control-group">
						<label class="control-label" for="inputEmail">邮箱</label>
						<div class="controls ">
							<input type="text" id="loginEmail" name="userEmail"
								placeholder="someone@cs2c.com.cn">
							  <span class="help help-inline" id="loginue"></span>
						</div>
						
					</div>
					<div class="control-group">
						<label class="control-label" for="inputPassword">密码</label>
						<div class="controls">
							<input type="password" id="inputPassword" placeholder="您的密码"
								name="userPassword">
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<label class="checkbox"> <input type="checkbox">
								记住我
							</label>
							<button type="submit" class="btn">登 录</button>
						</div>
					</div>
				</form>
				<img src="<%=request.getContextPath()%>/img/loginbg.jpg"
					class="img-circle loginbg">
			</div>
			<div class="tab-pane" id="admin">
				<form class="form-horizontal"
					action="<%=request.getContextPath()%>/login.action" method="post">
					<div class="control-group">
						<label class="control-label" for="inputEmail">邮箱</label>
						<div class="controls ">
							<input type="text" id="adLoginEmail" name="userEmail"
								placeholder="someone">
							<span class="help help-inline" id="adLoginue"></span>
						</div>
						
					</div>
					<div class="control-group">
						<label class="control-label" for="inputPassword">密码</label>
						<div class="controls">
							<input type="password" id="inputPassword" placeholder="您的密码"
								name="userPassword">
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<label class="checkbox"> <input type="checkbox">
								记住我
							</label>
							<button type="submit" class="btn">登 录</button>
						</div>
					</div>
				</form>
				<img src="<%=request.getContextPath()%>/img/loginbg2.jpg"
					class="img-circle loginbg">
			</div>
		</div>
	</div>
	<div class="round"></div>
</div>

<jsp:include page="/jsp/common/footer.jsp"></jsp:include>