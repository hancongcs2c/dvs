<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Notice"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="article hero-unit span7">
	<input type="hidden" id="noticeIdhidden" value="${noticeList[0].noticeId }">
	<h4>${noticeList[0].noticeTitle}
		<span class="time">最近更新：<fmt:formatDate value="${notice.noticeCredate}" pattern="yyyy-MM-dd"/>
			<c:if test="${sessionScope.roleId==1}">
			<a href="#updateNotice" role="button" data-toggle="modal" title="编辑"><i class="icon-edit"></i></a>
				
			</c:if>
		</span></h4>
	<div>${noticeList[0].noticeBody}
	</div>
	<hr />
	<c:if test="${sessionScope.roleId==1}">
		<a class="btn-link  delNote" title="删除">删除此篇</a>
	</c:if>
</div>
<div class="note span3">	
	<ul class="hero-unit">
		<h5>最新公告
			<c:if test="${sessionScope.roleId==1}">
			<a class="btn-link" id="addNotehref" href="#addNotice" role="button" data-toggle="modal" title="添加社区">
			<i class="icon-plus"></i>新建
			</a>
			</c:if>
		</h5>	
		<c:forEach items="${requestScope.noticeList}" var="notice">
		<li>
			<input type="hidden" value="${notice.noticeId }" name="noticeId" class="noticeIdhidden">
			<a class="noticeTitle" title="点击查看公告信息">${notice.noticeTitle}</a>
		</li>
		</c:forEach>
	</ul>

</div>
<div class="clear"></div>