<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Trend"%>
<%@ page import="com.cs2c.dvs.pojo.Label"%>
<jsp:include page="common/header.jsp"></jsp:include>


<div class="hero-unit db">

	<!--add form-->
	<form class="form-horizontal"  action="<%=request.getContextPath()%>/trend/addTrend.action" method="post">
		<div class="control-group">
			<label class="control-label" for="inputWeekNum">周数</label>
			<div class="controls ">
				<input type="text" id="inputWeekNum" name="trendWeeknum"
					placeholder="1">
			</div>
		</div>
		<div class="control-group">
			<label class="control-label" for="comName">社区</label>
			<div class="controls ">
				<select id="comName">
					<option></option>
				</select>
			</div>
		</div>
		
		
		
		<div class="control-group">
			<label class="control-label" for="userName">贡献者</label>
			<div class="controls ">
				<input type="text" id="inputWeekNum" name="trendWeeknum"
					placeholder="张杨">
			</div>
		</div>
	</form>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>