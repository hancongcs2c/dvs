<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Com"%>
					

<select name="comId" id="comId">
	<option value="1">--请选择--</option>
	<c:forEach items="${requestScope.comList }" var="com">
			<option value=${com['COM_ID']}>${com['COM_NAME']}</option>
	</c:forEach>
</select>
	<span class="help help-inline" id="cd"></span>
	

