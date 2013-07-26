<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"  language="java" import="java.sql.*" errorPage="" %>
    <jsp:include page="jsp/common/header.jsp"></jsp:include>
    
        <div class="indexpan" id="notice">
        	<h1>Notice</h1>
        	<div class="indexpannotice">
        		<!-- 此处内容ajax加载 -->
        	</div>
        	
            <!-- 添加公告 -->
            <div id="addNotice" class="modal hide fade commu addComModal" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 id="myModalLabel">添加公告</h4>
			</div>
			<div class="modal-body">
				<div class="narrowpanel">
					<form class="form-horizontal" action="<%=request.getContextPath() %>/notice/addNotice.action" method="post">
					
					<div class="control-group">
							<input class="span8" type="text" id="noticeTitle" name="noticeTitle"
								placeholder="请在这里填写标题">
							<span class="help help-inline" id="cn"></span>
						
					</div>

					<div class="control-group">
							<textarea class="span8" name="noticeBody" id="noticeBody" placeholder="正文开始..."></textarea>
							<span class="help help-inline" id="cn"></span>
					</div>


					<div class="control-group">
							<button type="submit" class="btn btn-success">添加</button>
					</div>
				</form>
				</div>
			</div>
		</div><!-- 添加公告over -->
		<!-- 修改公告 -->
            <div id="updateNotice" class="modal hide fade commu addComModal" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h4 id="myModalLabel">修改公告</h4>
			</div>
			<div class="modal-body">
				<div class="narrowpanel">
					<form class="form-horizontal" action="<%=request.getContextPath() %>/notice/updateNotice.action" method="post">
					
					<!-- 此处ajax加载 -->
				</form>
				</div>
			</div>
		</div><!-- 修改公告over -->
        </div>
        <div class="indexpan" id="about">
        	<h1>About</h1>
            <div class="span9">
                <p>
                开源社区贡献统计平台是中标软件开源社区部门为统计公司研发人员在各开源社区所做的贡献而开发的，本平台基于J2EE，
                集成了Java三大开源框架（Struts2+Spring+iBatis），采用mysql数据库，使用Bootstrap作为前端框架，自2013年
                3月开始开发。
                </p>
                <p>
                本平台现处于功能完善和数据补充维护阶段，<a href="http://localhost:8080/dvs/data/queryData.action">
                近期数据</a>展示了中标软件研发人员在各开源社区的贡献情形，
                <a href="http://localhost:8080/dvs/news/queryNews.action">开源新闻</a>抓取了一些开源社区的动态新闻。
                公司开源社区相关的信息将及时在
                <a href="http://localhost:8080/dvs/index.jsp#notice">公告</a>中贴出。
                </p>
                <p>
                	如有对本平台任何建议，可发送邮件给开源社区部<a href="mailto:cong.han@cs2c.com.cn">韩聪</a>。
                </p>
                <hr />
                <div>
            		<p><strong>开源社区贡献统计平台开发进程：</strong></p>
                	<p><a href="https://github.com/hancongcs2c/dvs">github.com/hancongcs2c/dvs</a></p>
            	</div>            
            </div>
        </div>
        
        <div class="indexpan" id="contact">
       
        	<h1>Contact Us</h1>
        	 <div class="span9">
        	<form class="form-horizontal" action="MAILTO:cong.han@cs2c.com.cn" method="post" enctype="text/plain">
            
              <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>
                <div class="controls">
                  <input type="text" name="mail" id="inputEmail" placeholder="Email">
                </div>
              </div>
              
              <div class="control-group">
                <label class="control-label" for="inputname">Name</label>
                <div class="controls">
                  <input type="text" name="name" id="inputname" placeholder="Name">
                </div>
              </div>
              
              <div class="control-group">
                <label class="control-label" for="inputcontent">Content</label>
                <div class="controls">
                  <textarea type="text" name="mailcontent" id="inputcontent" placeholder="Content"></textarea>
                </div>
              </div>
              
              <div class="control-group">
                <div class="controls">
                  <button type="submit" class="btn btn-warning">发送</button><button type="reset" class="btn">重置</button>
                </div>
              </div>
            </form>
            </div>
        </div>
    <jsp:include page="jsp/common/footer.jsp"></jsp:include>