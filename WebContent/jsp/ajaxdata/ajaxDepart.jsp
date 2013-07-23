<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Depart"%>
<select name="departId">
	<c:forEach items="${requestScope.departList}" var="depart">
		<option value="${depart['DEPART_ID'] }">${depart['DEPART_NAME']}</option>
	</c:forEach>
</select>