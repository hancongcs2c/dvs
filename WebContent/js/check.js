// JavaScript Document
$(function(){
	
	var pwd;
	var email;
	
	$('#userEmail').blur(function(e) {
		
		var userEmail = document.getElementById("userEmail").value;
		email=userEmail;
		var data = {
			"userEmail" : userEmail
		};
		
				$.get("/dvs/user/checkEmail.action",data,function(resp) {
					if (resp != "true") {
						$('#ue').html('用户已存在！');
						$('#ue').parent('.controls').parent('.control-group').addClass('warning');
						$('#ue').parent('.controls').parent('.control-group').removeClass('info');
						$('#ue').fadeIn(500);
						//$('#userEmail').select();
						 
					}else if(userEmail==null || userEmail==""){
						$('#ue').html('请填写邮箱！');
						$('#ue').parent('.controls').parent('.control-group').addClass('warning');
						$('#ue').parent('.controls').parent('.control-group').removeClass('info');
						$('#ue').fadeIn(500);
						//$('#userEmail').select();
					} else {
						$('#ue').html('√');
						$('#ue').parent('.controls').parent('.control-group').addClass('info');
						$('#ue').parent('.controls').parent('.control-group').removeClass('warning');
						$('#ue').fadeOut(500);
					}
					
				});
	    });
	
$('#userEmail').blur(function(e) {
		
		var userEmail = document.getElementById("userEmail").value;
		email=userEmail;
		var data = {
			"userEmail" : userEmail
		};
		
				$.get("/dvs/user/checkEmail.action",data,function(resp) {
					if (resp != "true") {
						$('#ue').html('用户已存在！');
						$('#ue').parent('.controls').parent('.control-group').addClass('warning');
						$('#ue').parent('.controls').parent('.control-group').removeClass('info');
						$('#ue').fadeIn(500);
						//$('#userEmail').select();
						 
					}else if(userEmail==null || userEmail==""){
						$('#ue').html('请填写邮箱！');
						$('#ue').parent('.controls').parent('.control-group').addClass('warning');
						$('#ue').parent('.controls').parent('.control-group').removeClass('info');
						$('#ue').fadeIn(500);
						//$('#userEmail').select();
					} else {
						$('#ue').html('√');
						$('#ue').parent('.controls').parent('.control-group').addClass('info');
						$('#ue').parent('.controls').parent('.control-group').removeClass('warning');
						$('#ue').fadeOut(500);
					}
					
				});
	    });
	$('#inputTruename').blur(function(e){
		var truename = document.getElementById("inputTruename").value;
		
		if(truename==null || truename==""){
			$('#tn').html('请填写姓名！');
			$('#tn').parent('.controls').parent('.control-group').removeClass('info');
			$('#tn').parent('.controls').parent('.control-group').addClass('warning');
			
			$('#tn').fadeIn(500);
			//$('#inputTruename').select();
		}else{
			$('#tn').html('√');
			$('#tn').parent('.controls').parent('.control-group').addClass('info');
			$('#tn').parent('.controls').parent('.control-group').removeClass('warning');
			$('#tn').fadeOut(500);
		}
	});
	$('#inputPassword').blur(function(e){
		var pw = document.getElementById("inputPassword").value;
		pwd=pw;
		if(pw==null || pw==""){
			$('#pw').html('请填写密码！');
			$('#pw').parent('.controls').parent('.control-group').removeClass('info');
			$('#pw').parent('.controls').parent('.control-group').addClass('warning');
			
			$('#pw').fadeIn(500);
			//$('#inputPassword').select();
		}else{
			$('#pw').html('√');
			$('#pw').parent('.controls').parent('.control-group').addClass('info');
			$('#pw').parent('.controls').parent('.control-group').removeClass('warning');
			$('#pw').fadeOut(500);
		}
	});
	$('#reinputPassword').blur(function(e){
		var reinputPassword = document.getElementById("reinputPassword").value;
		if(reinputPassword==null || reinputPassword==""){
			$('#rpw').html('请确认密码！');
			$('#rpw').parent('.controls').parent('.control-group').removeClass('info');
			$('#rpw').parent('.controls').parent('.control-group').addClass('warning');
			$('#rpw').fadeIn(500);
			//$('#reinputPassword').select();
		}else if(rpw!=pwd){
			$('#rpw').html('两次密码不相同！');
			$('#rpw').parent('.controls').parent('.control-group').removeClass('info');
			$('#rpw').parent('.controls').parent('.control-group').addClass('warning');
			$('#rpw').fadeIn(500);
			//$('#reinputPassword').select();
		}else{
			$('#rpw').html('√');
			$('#rpw').parent('.controls').parent('.control-group').addClass('info');
			$('#rpw').parent('.controls').parent('.control-group').removeClass('warning');
			$('#rpw').fadeOut(500);
		}
	});
	//登录check
	$('#loginEmail').blur(function(e) {
			
			var userEmail = document.getElementById("loginEmail").value;
			var data = {
				"userEmail" : userEmail
			};
			
					$.get("/dvs/user/checkEmail.action",data,function(resp) {
						if (resp != "true") {
							$('#loginue').html('√');
							$('#loginue').parent('.controls').parent('.control-group').addClass('info');
							$('#loginue').parent('.controls').parent('.control-group').removeClass('warning');
							$('#loginue').fadeOut(500);
							 
						}else if(userEmail==null || userEmail==""){
							$('#loginue').html('请填写邮箱！');
							$('#loginue').parent('.controls').parent('.control-group').addClass('warning');
							$('#loginue').parent('.controls').parent('.control-group').removeClass('info');
							$('#loginue').fadeIn(500);
							//$('#userEmail').select();
						} else {
							$('#loginue').html('用户不存在！');
							$('#loginue').parent('.controls').parent('.control-group').addClass('warning');
							$('#loginue').parent('.controls').parent('.control-group').removeClass('info');
							$('#loginue').fadeIn(500);
						}
						
					});
		    });
	
	//admin登录check
	$('#adLoginEmail').blur(function(e) {
			var userEmail = document.getElementById("adLoginEmail").value;
			var data = {
				"userEmail" : userEmail
			};
			
					$.get("/dvs/user/checkEmail.action",data,function(resp) {
						if (resp != "true") {
							$('#adLoginue').html('√');
							$('#adLoginue').parent('.controls').parent('.control-group').addClass('info');
							$('#adLoginue').parent('.controls').parent('.control-group').removeClass('warning');
							$('#adLoginue').fadeOut(500);
							 
						}else if(userEmail==null || userEmail==""){
							$('#adLoginue').html('请填写邮箱！');
							$('#adLoginue').parent('.controls').parent('.control-group').addClass('warning');
							$('#adLoginue').parent('.controls').parent('.control-group').removeClass('info');
							$('#adLoginue').fadeIn(500);
							//$('#userEmail').select();
						} else {
							$('#adLoginue').html('用户不存在！');
							$('#adLoginue').parent('.controls').parent('.control-group').addClass('warning');
							$('#adLoginue').parent('.controls').parent('.control-group').removeClass('info');
							$('#adLoginue').fadeIn(500);
						}
						
					});
		    });




});

