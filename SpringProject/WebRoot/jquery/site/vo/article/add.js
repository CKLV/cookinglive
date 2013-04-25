$(function(){
	$(":radio[name='anonymityFlag']").click(function(){
		if($(this).val()=='2'){
			$(":input[name='author']").removeAttr("disabled");
		}else{
			var jObj=$(":input[name='author']");
			jObj.attr("disabled","disabled");
			jObj.val("");
		}
	});
});