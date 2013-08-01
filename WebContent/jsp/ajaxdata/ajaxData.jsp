<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Data"%>
<table class="table table-condensed" id="sumDataTable">
<tr><td colspan="7"><p class="ttext-info">当前<strong>中标软件</strong>对开源社区贡献代码数据概览：</p></td></tr>
<tr class="active">
	<th>Community</th>
	<th>Project</th>
	<th>Contributors</th>
	<th>Company</th>
	<th class="t-a-r">Added</th>
	<th class="t-a-r">Removed</th>
	<th class="t-a-r">Changesets</th>
</tr>
<c:forEach items="${requestScope.sumDataList }" var="sumData">
	<tr>
		<td>${sumData.community }</td>
		<td>${sumData.project }</td>
		<td>${sumData.contributors }</td>	
		<td>${sumData.affliation }</td>
		<td class="t-a-r">${sumData.addeds }</td>
		<td class="t-a-r">${sumData.removeds }</td>
		<td class="t-a-r">${sumData.changesets }</td>
	</tr>
</c:forEach>
</table>
