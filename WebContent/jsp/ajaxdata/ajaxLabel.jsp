<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Label"%>

<h4>
<c:if test="${sessionScope.roleId==1 }">
<a id="henji"  data-toggle="modal" data-target="#activity" class="btn-link" title="点击查看所有可用痕迹">贡献云</a>
</c:if>
<c:if test="${sessionScope.roleId!=1 }">

<span>贡献云</span>
</c:if>
</h4>
<p><c:forEach items="${requestScope.labelList}" var="label">
		<a>${label.labelName }</a>
</c:forEach>
</p>