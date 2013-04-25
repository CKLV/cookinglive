$(function(){
	$("#reg").click(function(){
		TINY.box.show("#reg_pop",0,0,0,0,0);
		bindRegFormValidate();
		bindOtherEvent();
	});
	
	function bindOtherEvent(){
		//绑定
		$("#cancel").click(function(){
			$("#tinymask").click();
		});
		$("#reg_form").ajaxForm();
		$("#reg_form").submit(function(){
			if($("#reg_form").valid()){
				$("#reg_form input:submit").attr("disabled","disabled");
				$("#reg_form").ajaxSubmit({success:function(){
					$("#cancel").click();
					$.get("/sub/member-info.html",{},function(data){
						$("#memberInfo").html(data);
					});
				},dataType:"json"});		
			}
			return false;
		})
	}
	
	$("#loginForm").submit(function(){
		if($("#loginForm input[name='logUsername']").val()=='' || $("#loginForm input[name='logPassword']").val()==''){
			var obj=$("div.error_border");
			obj.html("您忘了输入用户名或密码啦！");
			obj.show();
		}else{
			$("#loginForm").ajaxSubmit({success:function(data){
				if(data["result"]){	
					$.get("/sub/member-info.html",{},function(data){
						$("#memberInfo").html(data);
					});
				}else{
					var obj=$("div.error_border");
					obj.html("用户名或密码错误，请重新输入！");
					obj.show();
				}
			},dataType:"json"});	
		}
		return false;
	});
	
	$("#loginForm input").keyup(function(){
		var obj=$("div.error_border").hide();
		obj.html("");
	});
});