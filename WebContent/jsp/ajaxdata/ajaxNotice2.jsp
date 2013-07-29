<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Notice"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="article hero-unit span7">
<input type="hidden" id="noticeIdhidden" value="${notice.noticeId }">

<h4>${notice.noticeTitle}
	<span class="time"><fmt:formatDate value="${notice.noticeCredate}" pattern="yyyy-MM-dd"/>
	<c:if test="${sessionScope.roleId==1}">
	<a href="#updateNotice" role="button" data-toggle="modal" title="编辑"><i class="icon-edit"></i></a>
		
	</c:if>
	</span>
</h4>
<div id="notice_now">${notice.noticeBody}
</div><hr />
<c:if test="${sessionScope.roleId==1}">
<a class="btn-link delNote" title="删除">删除此篇</a>
</c:if>
</div>
