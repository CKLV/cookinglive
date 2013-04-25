function bindRegFormValidate() {
	$("#reg_form").validate({
		rules : {
			logUsername : {
				required : true,
				rangelength:[8,20],
				remote:"/validate/account.json"
			},
			logPassword : {
				required : true,
				rangelength:[8,20]
			},
			nickName : {
				required : true,
				remote:"/validate/account.json"
			},
			emailAddress : {
				required : true,
				email:true,
				remote:"/validate/account.json"
			}
		},
		messages : {
			logUsername : {
				required : "请填写用户名！",
				rangelength:"用户名为{0}-{1}位",
				remote:"用户名已被注册！"
			},
			logPassword : {
				required : "请填写密码！",
				rangelength:"密码为{0}-{1}位！"
			},
			nickName : {
				required : "请填写昵称！",
				remote:"昵称已经被注册！"
			},
			emailAddress : {
				required : "请填写邮箱！",
				email:"请填写正确的邮箱！",
				remote:"邮箱重复，请重新填写邮箱或找回密码！"
			}
		},
		debug:true
	});
}