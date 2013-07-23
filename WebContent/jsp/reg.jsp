<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="common/header.jsp"></jsp:include>

<!--login form-->
<div class="hero-unit">
	<div class="tabbable">
		<!-- Only required for left/right tabs -->
		<ul class="nav nav-tabs">
			<li class="active"><a href="#user" data-toggle="tab">请您注册</a></li>
		</ul>
		<div class="tab-content login">
			<div class="tab-pane active" id="user">
				<form class="form-horizontal" action="myboard.jsp">
					<div class="control-group">
						<label class="control-label" for="inputEmail">邮箱</label>
						<div class="controls">
							<input type="text" id="inputEmail"
								placeholder="例：Someone@cs2c.com.cn">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="inputTruename">真实姓名</label>
						<div class="controls">
							<input type="text" id="inputTruename" placeholder="例：张三">
						</div>
					</div>


					<div class="control-group">
						<label class="control-label" for="inputPassword">密码</label>
						<div class="controls">
							<input type="password" id="inputPassword"
								placeholder="数字或字母开头不包含特殊字符">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="reinputPassword">确认一遍</label>
						<div class="controls">
							<input type="password" id="reinputPassword" placeholder="重复输入密码">
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<div>
								<label class="checkbox"> <input type="checkbox"
									id="regforadmin">注册为管理员
								</label> <input id="verifycode" class="input-small" type="text"
									placeholder="管理员验证码"> <span class="help-block"
									id="verifycodehelp">请发送邮件至<a
									href="MAILTO:cong.han@cs2c.com.cn">someone@cs2c.com.cn</a>索取验证码
								</span>
							</div>
							<button type="submit" class="btn btn-primary">现在注册！</button>
						</div>
					</div>
				</form>
				<img src="../img/loginbg.jpg" class="img-circle loginbg">
			</div>

		</div>
	</div>
	<div class="round"></div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>