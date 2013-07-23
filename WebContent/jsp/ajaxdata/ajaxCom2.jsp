<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Com"%>

<input type="hidden" id="comIdhid" value="${param.comId }">

<div class="control-group">
		<input type="text" id="upcomName" name="comName" value="${comMap['COM_NAME'] }">
		<span class="help help-inline" id="upcn"></span>
</div>

<div class="control-group">
		<select name="typeId">
			<c:forEach items="${requestScope.typeList }" var="type">
				<c:if test="${comMap['TYPE_ID']!=type['TYPE_ID'] }">
					<option value=${type['TYPE_ID']}>${type['TYPE_NAME']}</option>
				</c:if>
				<c:if test="${comMap['TYPE_ID']==type['TYPE_ID']}">
					<option value=${type['TYPE_ID']} selected="selected">${type['TYPE_NAME']}</option>
				</c:if>
			</c:forEach>
		</select>
		<span class="help help-inline" id="upcu"></span>
</div>
<c:if test="${sessionScope.roleId==1 }">
<a class="updateComHref">更新</a>
</c:if>
