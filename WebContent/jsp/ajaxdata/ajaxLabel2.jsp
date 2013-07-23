<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Label"%>

<div id="allLabel">
<div class="span3">
	<p class="text-warning"><strong>Code-Level:</strong></p>
	<input type="hidden" class="labelLevelhidden" name="labelLevel" value="Code-Level">
	<c:forEach items="${requestScope.labelList}" var="label">
		<c:if test="${label.labelLevel=='Code-Level' }">
		<div class="control-group acts">
			<input type="hidden" class="labelIdHidden" name="labelId" value="${label.labelId }">
			<input type="text" class="inputLabelName" name="labelName" value="${label.labelName }"><a class="delLabel">删除</a>
		</div>
		</c:if>
	</c:forEach>
	<div class="control-group">
		<a  class="btn-link addLabelbtn"><i class="icon-plus"></i>添加痕迹</a>
		<div class="control-group">
			<input type="text" class="addact" name="labelName">
		</div>
	</div>
</div>
<div class="span3">
	<p class="text-warning"><strong>Other:</strong></p>
	<input type="hidden" class="labelLevelhidden" name="labelLevel" value="Other">
	<c:forEach items="${requestScope.labelList}" var="label">
		<c:if test="${label.labelLevel=='Other' }">
			<div class="control-group acts">
				<input type="hidden" class="labelIdHidden" name="labelId" value="${label.labelId }">
				<input type="text" class="inputLabelName" name="labelName" value="${label.labelName }"><a class="delLabel">删除</a>
			</div>
		</c:if>
	</c:forEach>
	<div class="control-group">
		<a  class="btn-link addLabelbtn"><i class="icon-plus"></i>添加痕迹</a>
		<div class="control-group">
			<input type="text" class="addact" name="labelName">
		</div>
	</div>
</div>
<div class="clear"></div>
</div>
