<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Data"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="common/header.jsp"></jsp:include>

<div class="hero-unit db">
	<a class="rankTop"  href="<%=request.getContextPath() %>/data/rankData.action?community=openstack">
		<img alt="贡献Top!" src="<%=request.getContextPath() %>/img/ranking.png">
	</a>
	<!--search form-->
	<form class="boardform form-search" action="<%=request.getContextPath() %>/data/queryData.action?submitFlag=yes" method="post">
		<input placeholder="搜索社区/项目" class="input-medium search-query" type="text" name="project" id="project" value="${sessionScope.project }">
		<input placeholder="搜索贡献者" class="input-medium search-query"  type="text" name="name" id="name" value="${sessionScope.name }">
		
		<div class="input-append">
		    <input placeholder="搜索公司" class="input-small search-query"  type="text" name="affliation" id="affliation" value="${sessionScope.affliation }">
		    <a class="btn cs2c">cs2c</a>
		</div>
		
		<button class="btn btn-warning" type="submit">搜索</button>
		
	</form>
	<div class="tb">
		<p class="text-info">共找出${pager.recordCount}条数据，${pager.pageCount }页。其中包含${coms }个社区，${pros }个项目，${employers}个公司。
		${developers}名贡献者，代码添加${addeds}行，删除${removeds}行，提交${csets }次。
		</p>
		<table class="table table-hover newstate">
			<tr class="active">
				<th>Community</th>
				<th>Project</th>
				<th>Name</th>
				<th>Email</th>
				<th>Affliation</th>
				<th>Date</th>
				<th class="t-a-r">Added</th>
				<th class="t-a-r">Removed</th>
				<th class="t-a-r">Changesets</th>
			</tr>
			<c:forEach items="${requestScope.dataList }" var="data">
				<tr>
					<td>${data.community }</td>
					<td>${data.project }</td>
					<td>${data.name }</td>
					<td>${data.email }</td>
					<td>${data.affliation }</td>
					<td><fmt:formatDate value="${data.date }" pattern="yyyy-MM-dd"/></td>
					<td class="t-a-r">${data.added }</td>
					<td class="t-a-r">${data.removed }</td>
					<td class="t-a-r">${data.changeset }</td>
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
</div>

<jsp:include page="common/footer.jsp"></jsp:include>