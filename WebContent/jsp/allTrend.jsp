<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Trend"%>
<%@ page import="com.cs2c.dvs.pojo.Label"%>
<jsp:include page="common/header.jsp"></jsp:include>


<div class="hero-unit db">

	<!--search form-->
	<form class="boardform">
		<label for="fromD">时间：</label> <input type="date" value="月/日/年"
			class="date" id="fromD"> <label for="toD">~</label> <input
			type="date" value="月/日/年" class="date" id="toD"> <label
			for="commun">社区：</label> <select id="commun">
			<option>--Select One--</option>
			<option>OpenStack</option>
			<option>Ubuntu</option>
		</select>
		<input type="submit" class="btn" value="搜索">
		<a href="javascript:history.back()" role="button" class="btn btn-info addact">返回</a>
	</form>

	<div class="tb trendTable">
		<table class="table table-hover trendTable user">
			<tr>
		      <th rowspan="2">Week<br>Num</th>
		      <th colspan="2">Community</th>
		      <th colspan="5">Code-Level Contribution</th>
		      <th colspan="6">Other Contribution</th>
		      <th colspan="2">Contributors</th>
		    </tr>
		    <tr id="allLabelTr">
		      <th><nobr>Name</nobr></th>
		      <th>Type</th>
		      <th>IssueNo.or Project Name</th>
		      <th>Summary</th>
		      <th>COL</th>
		      <th>Status</th>
		      <th>Time</th>
		      <th>Email</th>
		      <th>Translation</th>
		      <th>Tech. Article</th>
		      <th>IRC Meeting</th>
		      <th>Forum Posts</th>
		      <th>Time</th>
		      <th>Name</th>
		      <th>Department</th>
		    </tr>
			<c:forEach items="${requestScope.trendList }" var="utList">
				<tr>
					<td>${utList['TREND_WEEKNUM'] }</td>
					<td>${utList['com_name'] }</td>
					<td> ${utList['type_name'] }</td>
					<td>${utList['INOPN'] }</td>
					<td>${utList['SUMMARY'] }</td>
					<td>${utList['COL'] }</td>
					<td>${utList['STATUS'] }</td>
					<td>${utList['C_TIME'] }</td>
					<td>${utList['EMAIL'] }</td>
					<td>${utList['TRANSLATION'] }</td>
					<td>${utList['TECH_ARTICLE'] }</td>
					<td>${utList['IRC_M'] }</td>
					<td>${utList['FORUM_POSTS'] }</td>
					<td>${utList['O_TIME'] }</td>
					<td>${utList['user_truename'] }</td>
					<td>${utList['depart_name'] }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>