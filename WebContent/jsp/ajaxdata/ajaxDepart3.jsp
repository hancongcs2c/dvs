<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Depart"%>
<c:forEach items="${requestScope.departList}" var="depart">
	<a class="departs">${depart['DEPART_NAME']}</a>
</c:forEach>
<c:if test="${sessionScope.roleId==1 }">
<a class="addDepartHref"><i class="icon-plus"></i></a>
</c:if>
