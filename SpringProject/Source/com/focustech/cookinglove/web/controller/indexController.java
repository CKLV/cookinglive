package com.focustech.cookinglove.web.controller;


import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focustech.cookinglove.base.SecurityContextHandler;


@Controller
public class indexController extends BaseController{
	
	@RequestMapping("/index.html")
	public String index(Model model){
		return "/index";
	}
	
	@RequestMapping(value="/sub/member-info")
	public String ajaxMemberInfo(Model modle){
		return "/common/ajax/_index_member_info";
	}
}
