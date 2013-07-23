<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>

<meta charset="utf-8">
<title>代码管理数据可视化系统</title>
<link href="<%=request.getContextPath()%>/css/bootstrap.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/bootstrap-responsive.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/style.css"
	rel="stylesheet">
<link rel="icon" href="<%=request.getContextPath()%>/img/icon.png" type="image/png" sizes="48x48" />
</head>

<body>
	<div id="wrap">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<a class="brand" href="/dvs/index.jsp">代码管理数据可视化系统</a>
					<div class="nav-collapse collapse">
						<ul class="nav">
							<li><a rel="#notice"
								href="<%=request.getContextPath()%>/index.jsp#notice">通知</a></li>
							<li><a  rel="#about"
								href="<%=request.getContextPath()%>/index.jsp#about">关于</a></li>
							<li><a  rel="#contact"
								href="<%=request.getContextPath()%>/index.jsp#contact">联系我们</a></li>
							<li><a class="label label-info" href="<%=request.getContextPath()%>/data/queryData.action">本周数据</a></li>
							
							<li><a class="label label-info" href="<%=request.getContextPath()%>/news/queryNews.action">开源新闻</a></li>
						</ul>
					</div>

					<c:choose>

						<c:when test="${sessionScope.userEmail==null}">
							<a class="btn-link reg"
								href="<%=request.getContextPath()%>/login.jsp">登录</a>
						</c:when>
						
						<c:when test="${sessionScope.roleId==1}">
							<a class="btn-link reg"
								href="<%=request.getContextPath()%>/logout.action">退出</a>

							<a class="btn-link reg" id="admingrep" 
								href="<%=request.getContextPath()%>/user/queryAllUser.action">管理通道</a>
							<div class="navinfo">
								<i class="icon-user icon-white"></i> <a
									class="badge badge-important" id="navusername"  href="<%=request.getContextPath()%>/jsp/myboard.jsp"
									data-toggle="tooltip" data-placement="bottom" title
									data-original-title="${sessionScope.departName}${sessionScope.userEmail }">
										${sessionScope.userTruename}【${sessionScope.roleName}】
									</a>
							</div>
						</c:when>
							
						<c:otherwise>
							<a class="btn-link reg"
								href="<%=request.getContextPath()%>/logout.action">退出</a>
							<a class="btn-link reg" id="admingrep" 
								href="<%=request.getContextPath()%>/user/queryAllUser.action">管理通道</a>
							<div class="navinfo">
								<i class="icon-user icon-white"></i> <a
									class="badge badge-important" id="navusername" href="<%=request.getContextPath()%>/jsp/myboard.jsp"
									data-toggle="tooltip" data-placement="bottom" title
									data-original-title="${sessionScope.departName}${sessionScope.userEmail }">
										${sessionScope.userTruename}【${sessionScope.roleName}】
									</a>
							</div>
						</c:otherwise>

					</c:choose>
				</div>
			</div>
		</div>
		<!--navbar over-->

		<div class="container main">