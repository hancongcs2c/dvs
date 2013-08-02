<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page import="com.cs2c.dvs.pojo.Notice"%>
<input type="hidden" id="noticeIdhidden" name="noticeId" value="${notice.noticeId }">
<input type="hidden" id="noticeAuhidden" name="noticeAuthor" value="${sessionScope.userTruename}">
<div class="control-group">
		<input class="span8" type="text" id="inputnoticeTitle" name="noticeTitle"
			value="${notice.noticeTitle }">
		<span class="help help-inline" id="cn"></span>
</div>

<div class="control-group">
	<textarea class="span8" name="noticeBody" id="noticeBody">${notice.noticeBody}</textarea>
	<span class="help help-block" id="cn">提示：支持p、hr、div等xhtml标签。</span>
</div>


<div class="control-group">
		<button type="submit" class="btn btn-success">修改</button>
</div>