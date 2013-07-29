<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cs2c.dvs.pojo.Data"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="common/header.jsp"></jsp:include>

<div class="hero-unit db">
	<a class="rankTop"  href="<%=request.getContextPath() %>/data/rankData.action?community=openstack">
		<img alt="贡献Top!" src="<%=request.getContextPath() %>/img/ranking.png">
	</a>
	<!--search form-->
	<form class="boardform form-search" action="<%=request.getContextPath() %>/data/queryData.action?submitFlag=yes" method="post">
		<input placeholder="搜索社区/项目" class="input-medium search-query" type="text" name="project" id="project" value="${sessionScope.project }">
		<input placeholder="搜索贡献者" class="input-medium search-query"  type="text" name="name" id="name" value="${sessionScope.name }">
		
		<div class="input-append">
		    <input placeholder="搜索公司" class="input-small search-query"  type="text" name="affliation" id="affliation" value="${sessionScope.affliation }">
		    <a class="btn cs2c">cs2c</a>
		</div>
		<input placeholder="yyyy-mm-dd" class="input-medium search-query"  type="date" name="startDate" id="startDate" value="${sessionScope.startDate }">到
		<input placeholder="yyyy-mm-dd" class="input-medium search-query"  type="date" name="overDate" id="overDate" value="${sessionScope.overDate }">
		<button class="btn btn-warning" type="submit">搜索</button>
		
	</form>
	<div class="tb">
		<div id="sumtables">
		<!-- ajax加载sum数据表 -->
		</div>
		<table class="table table-hover newstate">
		<tr><td colspan="9">搜索结果：总共为您找出${pager.recordCount}条数据，${pager.pageCount }页。其中包含${coms }个社区，${pros }个项目，${employers}个公司。
		${developers}名贡献者，代码添加${addeds}行，删除${removeds}行，提交${csets }次。</td></tr>
			<tr class="active">
				<th>Community</th>
				<th>Project</th>
				<th>Contributor</th>
				<th>Email</th>
				<th>Company</th>
				<th>Date</th>
				<th class="t-a-r">Added</th>
				<th class="t-a-r">Removed</th>
				<th class="t-a-r">Changesets</th>
			</tr>
			<c:forEach items="${requestScope.dataList }" var="data">
				<tr>
					<td>${data.community }</td>
					<td>${data.project }</td>
					<td>${data.name }</td>
					<td>${data.email }</td>
					<td>${data.affliation }</td>
					<td><fmt:formatDate value="${data.date }" pattern="yyyy-MM-dd"/></td>
					<td class="t-a-r">${data.added }</td>
					<td class="t-a-r">${data.removed }</td>
					<td class="t-a-r">${data.changeset }</td>
				</tr>
			</c:forEach>
			
		</table>
		<p class="pageTip">共${pager.recordCount}条记录，${pager.pageCount }页</p>
			<div class="pagination pagination-centered">						
				<ul>
					<li></li>
					<li class="disabled"><a href="?pageNum=1">&laquo;</a></li>
					<li ><a href="?pageNum=${pager.pageNum-1 }">&lt;</a></li>
					<li class="active" ><a>${pager.pageNum }</a></li>
					<li><a href="?pageNum=${pager.pageNum+1 }">&gt;</a></li>
					<li><a href="?pageNum=${pager.pageCount}">&raquo;</a></li>
				</ul>
			</div>
			
			<table class="table table-condensed" id="otherContri">
			<tr><td colspan="6">一些贡献不能通过工具自动搜索到，下表中列出手动搜索到的本公司员工相关贡献：</td></tr>
				
				<tr class="active">
					<th>Community</th>
					<th>Project</th>
					<th>Contributor</th>
					<th>Department</th>
					<th>Date</th>
					<th class="t-a-r">Content</th>
				</tr>
				<tr>
					<td>openstack</td>
					<td>nova</td>
					<td>王志超</td>
					<td>云方案部</td>
					<td>2013-07-24</td>
					<td class="t-a-r"><a href="https://answers.launchpad.net/nova/+question/232942">launchpad上提问</a></td>
				</tr>
				<tr>
					<td>openstack</td>
					<td>nova</td>
					<td>王志超</td>
					<td>云方案部</td>
					<td>2013-07-24</td>
					<td class="t-a-r"><a href="https://launchpad.net/~zhichao-wang">注册launchpad</a></td>
				</tr>
				
				<tr>
					<td>openstack</td>
					<td>nova</td>
					<td>叶钢</td>
					<td>云方案部</td>
					<td>2013-07-22</td>
					<td class="t-a-r"><a href="https://answers.launchpad.net/nova/+question/232838">launchpad上提问</a></td>
				</tr>
				<tr>
					<td>fedora</td>
					<td>I18N Test Day - Input (language-specific)</td>
					<td>谢凌云</td>
					<td>测试中心</td>
					<td>2013-05-30</td>
					<td class="t-a-r"><a href="https://fedoraproject.org/wiki/Test_Day:2013-05-02_Internationalization/Results/Input_lang">测试Intelligent Pinyin是否足够智能</a></td>
					
				</tr>
				<tr>
					<td>fedora</td>
					<td>I18N Test Day - Input (overall)</td>
					<td>谢凌云</td>
					<td>测试中心</td>
					<td>2013-05-30</td>
					<td class="t-a-r"><a href="https://fedoraproject.org/wiki/Test_Day:2013-05-02_Internationalization/Results/Input_overall">测试ibus输入法整体运行情况</a></td>
					
				</tr>
				<tr>
					<td>fedora</td>
					<td>I18N Test Day - Rendering</td>
					<td>谢凌云</td>
					<td>测试中心</td>
					<td>2013-05-30</td>
					<td class="t-a-r"><a href="https://fedoraproject.org/wiki/Test_Day:2013-05-02_Internationalization/Results/Rendering">测试浏览器打开一个网站时是否可以自动选择语言</a></td>
				</tr>
				<tr>
					<td>云联盟</td>
					<td>OADT</td>
					<td>蒋涛</td>
					<td>服务器产品研发部</td>
					<td>2013-04-12</td>
					<td class="t-a-r"><a href="https://lists.launchpad.net/coscl/msg00018.html">回答了一个OADT相关的问题...</a></td>
				</tr>
				<tr>
					<td>glusterfs</td>
					<td>glusterfs</td>
					<td>李俊丽</td>
					<td>服务器产品研发部</td>
					<td>2013-03-21</td>
					<td class="t-a-r"><a href="https://bugzilla.redhat.com/show_bug.cgi?id=924132">提交一个bug</a></td>
				</tr>
				<tr>
					<td>glusterfs</td>
					<td>glusterfs</td>
					<td>李俊丽</td>
					<td>服务器产品研发部</td>
					<td>2013-3-20</td>
					<td class="t-a-r"><a href="http://review.gluster.org/#/c/4700/">为修复bug提交代码2行</a></td>
				</tr>
				<tr>
					<td>openstack</td>
					<td>nova</td>
					<td>叶钢</td>
					<td>云方案部</td>
					<td>2012-08-17</td>
					<td class="t-a-r"><a href="https://launchpad.net/~gang-ye">注册launchpad</a></td>
				</tr>
			</table>
	</div>
</div>

<jsp:include page="common/footer.jsp"></jsp:include>