<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Notice"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="article hero-unit span7">
	<c:choose>
	<c:when test="${noticeList[0].noticeTitle=='cs2cState' }">
		<input type="hidden" id="noticeIdhidden" value="${noticeList[1].noticeId }">
		<h4>${noticeList[1].noticeTitle}
			<span class="time"><fmt:formatDate value="${noticeList[1].noticeUpdate}" pattern="yyyy-MM-dd"/>更新 by ${noticeList[0].noticeAuthor }
				<c:if test="${sessionScope.userTruename==noticeList[1].noticeAuthor}">
				<a href="#updateNotice" role="button" data-toggle="modal" title="编辑"><i class="icon-edit"></i></a>
					
				</c:if>
			</span></h4>
		<div>${noticeList[1].noticeBody}
		</div>
		<hr />
		<c:if test="${sessionScope.userTruename==noticeList[1].noticeAuthor}">
			<a class="btn-link  delNote" title="删除">删除此篇</a>
		</c:if>
	</c:when>
	<c:otherwise>
		<input type="hidden" id="noticeIdhidden" value="${noticeList[0].noticeId }">
		<h4>${noticeList[0].noticeTitle}
			<span class="time"><fmt:formatDate value="${noticeList[0].noticeUpdate}" pattern="yyyy-MM-dd"/>更新 by ${noticeList[0].noticeAuthor }
				<c:if test="${sessionScope.userTruename==noticeList[0].noticeAuthor}">
				<a href="#updateNotice" role="button" data-toggle="modal" title="编辑"><i class="icon-edit"></i></a>
					
				</c:if>
			</span></h4>
		<div>${noticeList[0].noticeBody}
		</div>
		<hr />
		<c:if test="${sessionScope.userTruename==noticeList[0].noticeAuthor}">
			<a class="btn-link  delNote" title="删除">删除此篇</a>
		</c:if>
	
	</c:otherwise>
		
	</c:choose>
	
</div>
<div class="note span3">	
	<ul class="hero-unit">
		<h5>最新公告
			<c:if test="${sessionScope.userTruename!=null}">
			<a class="btn-link" id="addNotehref" href="#addNotice" role="button" data-toggle="modal" title="添加公告">
			<i class="icon-plus"></i>新建
			</a>
			</c:if>
		</h5>	
		<c:forEach items="${requestScope.noticeList}" var="notice">
		
		<c:choose>
		<c:when test="${notice.noticeTitle=='cs2cState' }">
			<c:if test="${sessionScope.roleId==1 }">
			<li>
				<input type="hidden" value="${notice.noticeId }" name="noticeId" class="noticeIdhidden">
				<a class="noticeTitle" title="点击查看公告信息">${notice.noticeTitle}</a>
			</li>
			</c:if>
		</c:when>
		<c:otherwise>
			<li>
				<input type="hidden" value="${notice.noticeId }" name="noticeId" class="noticeIdhidden">
				<a class="noticeTitle" title="点击查看公告信息">${notice.noticeTitle}</a>
			</li>
		</c:otherwise>
		</c:choose>	
		</c:forEach>
	</ul>

</div>
<div class="clear"></div>