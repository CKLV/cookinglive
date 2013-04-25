$(function(){
	$("#form").submit(function(){
		$("#form").ajaxSubmit({dataType:"json",success:function(){

		}});
		return false;
	});
});

