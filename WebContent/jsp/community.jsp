<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.News"%>
<jsp:include page="common/header.jsp"></jsp:include>

<div class="hero-unit db comm">
	<div class="newsListUl">
		<h4><span class="badge badge-important">Canonical</span></h4>
		<ul>
			<c:forEach items="${newsList }" var="news">
			<c:if test="${news.catgory=='Canonical'}">
				<li><a href="${news.link }" target="_blank" title="发布时间：${news.pubDate }">${news.title}</a></li>
			</c:if>
			</c:forEach>
		</ul>
		<h4><span class="badge badge-warning">OpenNebula</span></h4>
		<ul>
			<c:forEach items="${newsList }" var="news">
			<c:if test="${news.catgory=='OpenNebula'}">
				<li><a href="${news.link }" target="_blank" title="发布时间：${news.pubDate }">${news.title}</a></li>
			</c:if>
			</c:forEach>
		</ul>
		<h4><span class="badge badge-info">Eucalyptus</span></h4>
		<ul>
			<c:forEach items="${newsList }" var="news">
			<c:if test="${news.catgory=='Eucalyptus'}">
				<li><a href="${news.link }" target="_blank" title="发布时间：${news.pubDate }">${news.title}</a></li>
			</c:if>
			</c:forEach>
		</ul>
		<h4><span class="badge badge-warning">OpenStack</span></h4>
		<ul>
			<c:forEach items="${newsList }" var="news">
			<c:if test="${news.catgory=='OpenStack'}">
				<li><a href="${news.link }" target="_blank" title="发布时间：${news.pubDate }">${news.title}</a></li>
			</c:if>
			</c:forEach>
		</ul>
		<h4><span class="badge badge-success">Mono</span></h4>
		<ul>
			<c:forEach items="${newsList }" var="news">
			<c:if test="${news.catgory=='Mono'}">
				<li><a href="${news.link }" target="_blank" title="发布时间：${news.pubDate }">${news.title}</a></li>
			</c:if>
			</c:forEach>
		</ul>
		
	</div>
	<div id="upToTop"><a rel="#wrap" href="#wrap">Top</a></div>
</div>
<jsp:include page="common/footer.jsp"></jsp:include>