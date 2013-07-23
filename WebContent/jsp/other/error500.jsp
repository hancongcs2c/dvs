<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../common/header.jsp"></jsp:include>

<div class="hero-unit db comm">
	<div class="problempage">
		<h4>帮助我成长...</h4>
		<div>
			<p class="text-warning">对不起，出错了，程序媛不够不严谨，...π_π，或许您可以：</p>
			<p class="text-success">1、直接<a href="javascript:history.back()">戳这里返回&gt;&gt;</a></p>
			<p class="text-success">2、希望能占用您一点儿时间，帮助我成长，<a href="<%=request.getContextPath() %>/index.jsp#contact">猛戳这里</a>发送错误报告:P</p>
			<p class="errormsg">:)</p>
		</div>
	</div>
</div>
<jsp:include page="../common/footer.jsp"></jsp:include>