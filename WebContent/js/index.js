// JavaScript Document
$(function() {	

	//加载统计数据表头
	$('#sumtables').load('/dvs/data/querySumData.action');
	
	$('.cs2c').click(function(e){
		$(this).prev('input').val('cs2c');
	});
	//加载排行html
	$('#ranklog').load('/dvs/html/cinder-result-20.html');
	$('#ranklog table').addClass('span3');
	//trend模块
	$('.queryUserTrHref').click(function(e){
		var userId = $(this).parent('td').prev('td').find('.userIdHidden').val();
		location.href="/dvs/trend/queryTrByUser.action?userId="+userId;
	});
	$('#addTrendModal').modal({
		show:false
	});
	$('a.trend').click(function(e){
		$('.trend_comSelect').load('/dvs/com/queryAllCom2.action',function(e){
			$('#addTrendModal').modal('show');
		});
		
	});
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	$('#deleteSth').modal({
		show:false
	});
	$('#addUserModal').modal({
		show:false
	});
	$('a.adduser').click(function(e){
		$('#departSelectDiv').load('/dvs/depart/queryAllDepart.action',function(e){
			$('#addUserModal').modal('show');
		});
		//alert(111)
	});
	$('.deleteUserHref').click(function(e){
		var userId = $(this).parent('td').parent('tr').find('.userIdHidden').val();
		location.href="/dvs/user/deleteUser.action?userId="+userId;
	});
	$('.recoverUserHref').click(function(e){
		var userId = $(this).parent('td').parent('tr').find('.userIdHidden').val();
		location.href="/dvs/user/recoverUser.action?userId="+userId;
	});
	$('#updateUserModal').modal({show:false});
	$('.updateUserHref').click(function(e){
		var userId = $(this).parent('td').parent('tr').find('.userIdHidden').val();
		$('#updateUserModal form').load('dvs/user/queryUserById.action?userId='+userId,function(e){
			$("#updateUserModal").modal('show');
		});
	});
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	//公告
	
	$('.indexpannotice').load("/dvs/notice/queryAllNotice.action",function(e){noticenimei();});
	$('#updateNotice').modal({
		show : false
	});
	function noticenimei(){
		//查看每条
		$('.noticeTitle').click(function(e){
			var noticeId=$(this).prev('.noticeIdhidden').val();
			$('.article').load("/dvs/notice/queryNoticeById.action?noticeId="+noticeId,function(e){
				noticenimei2();
			});
		});
		
		//删除
		$('.delNote').click(function(e){
			
			var noticeId = $('.article #noticeIdhidden').val();
			location.href="/dvs/notice/deleteNotice.action?noticeId="+noticeId;
			
			noticenimei();
		});
		
		//更新
		$('.article .icon-edit').click(function(e){
			var noticeId = $('.article #noticeIdhidden').val();
			$('#updateNotice form').load("/dvs/notice/queryNoticeById2.action?noticeId="+noticeId, function(e){
				$("#updateNotice").modal('show');
				noticenimei();
			});
		});
		
	}

	function noticenimei2(){
		//删除
		$('.article h3 span a').click(function(e){
			if(window.confirm('您确定要删除此文章吗？')){
				var noticeId = $('.article #noticeIdhidden').val();
				location.href="/dvs/notice/deleteNotice.action?noticeId="+noticeId;		
                return true;
             }else{
                return false;
            }
			noticenimei2();
			noticenimei();
		});
		
		//更新
		$('.article .icon-edit').click(function(e){
			var noticeId = $('.article #noticeIdhidden').val();
			$('#updateNotice form').load("/dvs/notice/queryNoticeById2.action?noticeId="+noticeId, function(e){
				$("#updateNotice").modal('show');
				noticenimei2();
				noticenimei();
			});
		});
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	//查询所有社区并加载至页面
	$('#coms').load("/dvs/com/queryAllCom.action",function(e){comnimei();});

	$('#updateCom').modal({
		show : false
	});
	$('#addCom').modal({
		show : false
	});
	
	function comnimei(){
		//添加com
		$('#coms .icon-plus').click(function(e){
			$('#addCom').toggle(100);
			$('#addCom form .comselect').load("/dvs/com/toAdd.action", function(e){
				//添加社区
				$('.addComHref').click(function(e){
						var comName = $(this).prev('.control-group').prev('.control-group').find('#comName').val();
						var typeId = $(this).prev('.control-group').find('#typeId').val();
						var data = {
								"comName" : comName,
								"typeId" : typeId
						};
					$('#coms').load("/dvs/com/addCom.action",data, function(e){
						$('#addCom').fadeOut(100);
						comnimei();
					} );
				});
			});
			
		});
		
		$('.comms .icon-remove').css('display','none');
		//显示删除
		$('.comn').mouseover(function(e){
			$(this).next('a').find('.icon-remove').css('display','inline-block');
		});
		$('.comms').mouseover(function(e){
			$(this).css('display','inline-block');
		});
		//隐藏删除
		$('.comn').mouseout(function(e){
			$(this).next('a').find('.icon-remove').css('display','none');
		});
		//删除社区
		$('.icon-remove.comms').click(function(e){
				var comId = $(this).parent('a').prev('a').prev('.comIdhidden').val();
				var data = {
						"comId" : comId,
				};
				$('#coms').load("/dvs/com/deleteCom.action",data, function(e){
				comnimei();});
		});

		//修改社区信息
		$('.comn').click(function(e){
			$('#updateCom').toggle(100);
			var comId = $(this).prev('.comIdhidden').val();
			var data = {
					"comId" : comId
			};
			$('#updateCom form').load("/dvs/com/queryComById.action",data, function(e){
				$('.updateComHref').click(function(e){
					var comId = $(this).parent('form').find('#comIdhid').val();
					var comName = $(this).prev('.control-group').prev('.control-group').find('#comName').val();
					var typeId = $(this).prev('.control-group').find('#typeId').val();
					var data = {
							"comId" : comId,
							"comName" : comName,
							"typeId" : typeId
					};
				$('#coms').load("/dvs/com/addCom.action",data, function(e){
					$('#updateCom').fadeOut(100);
					comnimei();
				} );
			});
			});
		});
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	$('#navusername').tooltip();

	// 导航栏判断是否为当前导航
	$('.nav ul li a').each(
			function(index) {
				var strs = new Array();
				strs = window.location.href.split('/');
				var http = strs[(strs.length) - 1];// 获取最后一个“/”的地址
				var liValue = $('.nav ul li a').eq(index).children().attr(
						'href').substr(0, 4);// 获取菜单项链接的前4个字符

				if (http.indexOf(liValue) >= 0) {// 用包含比较是否相同
					$('.nav ul li a').removeClass('active');
					$('.nav ul li a').eq(index).addClass('active');
				}
				$(this).click(function() {
					$('.nav ul li a').removeClass('active');
					$('.nav ul li a').eq(index).addClass('active');
				});

			});

	// 平滑滚动
	$(".nav li a").click(function() {
		var rel = $(this).attr("rel");
		var pos = $(rel).offset().top;
		$("html, body").animate({
			scrollTop : pos
		}, 1000);
	});
	$("#upToTop a").click(function() {
		var rel = $(this).attr("rel");
		var pos = $(rel).offset().top;
		$("html, body").animate({
			scrollTop : pos
		}, 1000);
	});
	//滚动到最上部
	$('.newsListUl').mouseover(function(e){
		 $("#upToTop").animate({
			 left:'85%',
			 opacity:'0.9',
		},"fast");
	});

////////////////////////////////////////////////////////////////////////////////////////////
	function usernimei(){
		
		// 用户添加每日痕迹时选择类型
		$('#elsecheckbox').click(function() {
			if ($('#elsecheckbox').is(':checked')) {
				$('#elseact').fadeIn(300);

			} else {
				$('#elseact').fadeOut(300);
			}
		});

		
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	$('#activity').modal({
		show : false
	});
	//显示label
	
	$('.reguser2').load('/dvs/label/queryAllLabel.action',function(e){
		$('#henji').click(function(e) {
			$('#activity form').load("/dvs/label/queryAllLabel2.action", function(e){
				$("#activity").modal('show');
				labelnimei();
			});
		});		
	});
	function labelnimei(){
		//添加label
		$('.addLabelbtn').click(function(e){
			$(this).next('.control-group').find('.addact').toggle(300);
			$('.addact').blur(function(e){
				var labelName = $(this).val();
				var labelLevel = $(this).parent('.control-group').parent('.control-group').parent('.span3').find('.labelLevelhidden').val();
				var data = {
						"labelName" : labelName,
						"labelLevel" : labelLevel
				};
				$('#activity form').load("/dvs/label/addLabel.action",data, function(e){labelnimei();} );
			});
		});
		
		//显示删除
		$('.acts').mouseover(function(e){
			$(this).find('.delLabel').fadeIn(100);
		});
		
		//删除label
		$('.delLabel').click(function(e){
			//刪除再查詢的action
				var labelId = $(this).parent('.acts').find('.labelIdHidden').attr('value');
				$('#activity form').load("/dvs/label/deleteLabel.action?labelId="+labelId, function(e){labelnimei();});
		});//刪除的actionover
		
		//隐藏删除
		$('.acts').mouseout(function(e){
			$(this).find('.delLabel').fadeOut(0);
		});
		
		//修改label
		$('.inputLabelName').blur(function(e){
			var labelId = $(this).parent('.acts').find('.labelIdHidden').val();
			var labelName = $(this).val();
			var labelLevel = $(this).parent('.control-group').parent('.span3').find('.labelLevelhidden').val();
			var data = {
					"labelId" : labelId,
					"labelName" : labelName,
					"labelLevel" : labelLevel
			};
			$('#activity form').load("/dvs/label/updateLabel.action",data, function(e){labelnimei();} );
		});
		
	}
///////////////////////////////////////////////////////////////////////////////
	$('.reguser3').load("/dvs/depart/queryAllDepart2.action",function(e){departnimei();});
	function departnimei(){
		//添加depart
		$('.addDepartHref .icon-plus').click(function(e){
			$('#addDepart').toggle(100);
			$('.addDepartName').click(function(e){
				var departName = $(this).prev('input').val();
				var data = {
						"departName" : departName
				};
				$('.reguser3').load("/dvs/depart/addDepart.action",data,function(e){
					$('#addDepart').fadeOut(100);
					departnimei();
				});
			});
		});
	}
	

});
