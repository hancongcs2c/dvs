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
            	<strong>跨部门沟通</strong>
                与研发的合作、协调情况。指标1：保证每周就各开源社区各方面的状态与各研发部沟通一次；指标2：汇总沟通结果并结合开源社区参与贡献度统计平台写周报，月报。
            </p>
            </div>
        </div>
        
        <div class="indexpan" id="contact">
        	<h1>Contact Us</h1>
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
                  <button type="submit" class="btn">发送</button><button type="reset" class="btn">重置</button>
                </div>
              </div>
            </form>
        </div>
    <jsp:include page="jsp/common/footer.jsp"></jsp:include>