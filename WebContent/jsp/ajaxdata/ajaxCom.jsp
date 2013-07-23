<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Com"%>

<c:forEach items="${requestScope.comList}" var="com">
	<input type="hidden" name="comId" value="${com['COM_ID'] }" class="comIdhidden">
	<c:if test="${sessionScope.roleId==1 }">
		<a title="点击修改社区信息" class="comn">${com['COM_NAME']}</a>
		<a><i class="icon-remove comms"  data-toggle="modal" title="删除" href="#deleteSth"></i></a>
	</c:if>
	<c:if test="${sessionScope.roleId!=1 }">
		<span class="usercom">${com['COM_NAME']}</span>
	</c:if>
</c:forEach>
<c:if test="${sessionScope.roleId==1 }">
<a id="addComHref" title="添加社区"><i class="icon-plus"></i></a>
</c:if>