<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Com"%>
					

<select name="typeId" id="typeId">
	<option value="1">--请选择--</option>
	<c:forEach items="${requestScope.typeList }" var="type">
			<option value=${type['TYPE_ID']}>${type['TYPE_NAME']}</option>
	</c:forEach>
</select>
	<span class="help help-inline" id="cd"></span>
	

