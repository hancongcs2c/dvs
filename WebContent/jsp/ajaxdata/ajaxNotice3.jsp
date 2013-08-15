<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Notice"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach items="${requestScope.noticeList}" var="notice">
<c:if test="${notice.noticeTitle=='cs2cState' }">
	${notice.noticeBody}
</c:if>
</c:forEach>