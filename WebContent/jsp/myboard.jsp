<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Trend"%>
<%@ page import="com.cs2c.dvs.pojo.Label"%>
<jsp:include page="common/header.jsp"></jsp:include>


<div class="hero-unit db usertrtable">

	<!--search form-->
	<form class="boardform">
		<label for="fromD">时间：</label> <input type="date" value="月/日/年"
			class="date" id="fromD"> <label for="toD">~</label> <input
			type="date" value="月/日/年" class="date" id="toD"> <label
			for="commun">社区：</label> <select id="commun">
			<option>--Select One--</option>
			<option>OpenStack</option>
			<option>Ubuntu</option>
		</select><a href="<%=request.getContextPath() %>/trend/queryAllTrend.action"	class="btn btn-info allTrend">所有贡献</a> 
		<c:if test="${sessionScope.roleId==1 }">
			<a  role="button" data-toggle="modal" class="btn btn-warning addact trend">添加贡献</a>
		</c:if>
	</form>

	<!--社区信息-->
	<div id="addTrendModal" class="modal hide fade commu " tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h4 id="myModalLabel">添加痕迹</h4>
		</div>
		<div class="modal-body">
			<div class="narrowpanel">
				<form class="form-horizontal comform addtrend" action="<%=request.getContextPath() %>/trend/addTrend.action" method="post">
					<input type="hidden" name="userId" value="${param.userId }">
					<div class="control-group fl">
					
						<label for="inputWeekNum">周数</label>
						<div>
							<input type="text" id="inputWeekNum" name="trendWeeknum"
								placeholder="1">
						</div>
					</div>
					<div class="control-group fl">
						<label class="" for="comName">相关社区</label>
						<div class="trend_comSelect">
							<!-- ajax加载ajaxcom4.jsp -->
						</div>
					</div>
					
					<div class="clear"></div>
					
					<div class="control-group alabels">
						
							<label class="level">Code-Level贡献：</label>
							<div>
							<label for="inopn"> IssueNo.or Project Name</label>
							<input type="text" name="inopn" placeholder="" id="inopn"></div><div>
							<label for="summary"> Summary</label>
							<input type="text" name="summary" placeholder="" id="summary"></div><div>
							<label for="col"> COL</label>
							<input type="text" name="col" placeholder="代码量" id="col"></div><div>
							<label for="status"> Status</label>
							<input type="text" name="status" placeholder="代码提交后状态" id="status"></div><div>
							<label for="c_time"> Time</label>
							<input type="date" name="c_time" placeholder="" id="c_time">
						</div>
					</div>
					
					<div class="control-group alabels">
							<label class="level">其它贡献：</label>
							<div>
							<label for="emailNum"> Email</label>
							<input type="text" name="emailNum" placeholder="往来邮件的数量" id="emailNum"></div><div>
							<label for="trans"> Translation</label>
							<input type="text" name="translation" placeholder="翻译文档/资料的量" id="trans"></div><div>
							<label for="tech"> Tech. Article</label>
							<input type="text" name="techArticle" placeholder="撰写技术文档的量" id="tech"></div><div>
							<label for="irc"> IRC Meeting</label>
							<input type="text" name="ircMeeting" placeholder="参加会议的次数" id="irc"></div><div>
							<label for="forum"> Forum Posts</label>
							<input type="text" name="forumPosts" placeholder="论坛留痕的数量" id="forum"></div><div>
							<label for="o_time"> Time</label>
							<input type="date" name="o_time" placeholder="" id="o_time">
						</div>
					</div>
					
					<div class="clear"></div>
					<div class="control-group form-actions">
						<div class="controls">
							<button type="submit" class="btn btn-success">添加</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!--社区信息over-->


	<div class="tb">
		<table class="table table-hover trendTable user">
			<tr>
				<th rowspan="2">Week Num</th>
				<th colspan="2">Community</th>
				<th colspan="5">Code-Level Contribution</th>
				<th colspan="6">Other Contribution</th>
			</tr>
			<tr id="allLabelTr">
				<th>Name</th>
				<th>Type</th>
				<th>IssueNo.or Project Name</th><th>Summary</th>
				<th>COL</th>
				<th>Status</th><th>Time</th>
				<th>Email</th><th>Translation</th><th>Tech. Article</th>
				<th>IRC Meeting</th><th>Forum Posts</th><th>Time</th>
			</tr>
			<c:forEach items="${requestScope.userTrendList }" var="utList">
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
				</tr>
			</c:forEach>
		</table>
		
	</div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>