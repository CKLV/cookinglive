$(function(){
	$("img[name='tourism_name']").hover(function(event){
		$(this).closest("div.photo_list").find("div.modify").show();
	},function(event){
		if(event.relatedTarget.name!='modifyPhoto'){
			$(this).closest("div.photo_list").find("div.modify").hide();
		}
	});
	
	$("div.modify").hover(function(){
		$(this).find("imng").show();
	},function(){
		$(this).find("imng").hide().bind("hover");
	});
});