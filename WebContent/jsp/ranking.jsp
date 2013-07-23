<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Data"%>
<jsp:include page="common/header.jsp"></jsp:include>

<div class="hero-unit db rank">
	<a class="close" href="<%=request.getContextPath() %>/data/queryData.action">&times;</a>
	<div class="description">${param.community }</div>
        <div id="example" class="k-content">
            <div class="chart-wrapper">
                <div id="chart"></div>
            </div>
        </div>
        <div id="rankpie">
        	<div id="data_source" style="display:none;">${dataSource}</div>
        </div>
</div>

<jsp:include page="common/chartFooter.jsp"></jsp:include>