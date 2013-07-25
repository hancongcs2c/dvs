<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Data"%>
<tr><td colspan="7">当前中标软件对开源社区贡献代码数据概览：</td></tr>
<tr class="active">
	<th>Community</th>
	<th>Project</th>
	<th>Contributors</th>
	<th>Employers</th>
	<th class="t-a-r">Added</th>
	<th class="t-a-r">Removed</th>
	<th class="t-a-r">Changesets</th>
</tr>
<c:forEach items="${requestScope.sumDataList }" var="sumData">
	<tr>
		<td>${sumData.community }</td>
		<td>${sumData.project }</td>
		<td>${sumData.contributors }</td>	
		<td>${sumData.employers }</td>
		<td class="t-a-r">${sumData.addeds }</td>
		<td class="t-a-r">${sumData.removeds }</td>
		<td class="t-a-r">${sumData.changesets }</td>
	</tr>
</c:forEach>