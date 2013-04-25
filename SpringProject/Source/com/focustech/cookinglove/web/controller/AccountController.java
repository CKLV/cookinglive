package com.focustech.cookinglove.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.focustech.cookinglove.ibator.domain.CoreLogonInfo;
import com.focustech.cookinglove.tool.CookieTool;
import com.focustech.cookinglove.web.service.AccountService;

@Controller
@RequestMapping(value="/account")
public class AccountController extends BaseController{
	
	@Autowired
	AccountService accountService;
	
	/**
	 * 处理注册ajax请求
	 * @param model
	 * @param coreLogonInfo
	 * @param response
	 */
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public void regUser(Model model,CoreLogonInfo coreLogonInfo,HttpServletResponse response){
		coreLogonInfo.setUserStatus("1");
		coreLogonInfo.setUserType("1");
		accountService.addUser(coreLogonInfo);
		CookieTool.writeUser(coreLogonInfo);
	}
	
	/**
	 * 处理登录ajax
	 * @param model
	 * @param coreLogonInfo
	 * @param response
	 */
	@RequestMapping(value="/log")
	public Map<String,Object> loginUser(Model model,CoreLogonInfo coreLogonInfo,HttpServletResponse response){
		CoreLogonInfo logonInfo=accountService.selectUser(coreLogonInfo);
		model.addAttribute("coreLogonInfo",null);
		boolean result=logonInfo!=null && logonInfo.getLogPassword().equals(coreLogonInfo.getLogPassword());
		if(result){
			CookieTool.writeUser(logonInfo);
		}
		addJson("result", result);
		return getJson();
	}
	
	
	/**
	 * 返回无权限说明页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/nopermit")
	public String nopermit(Model model){
		return "/account/nopermit";
	}
	
	/**
	 * 登录页面-普通请求
	 * @param model
	 * @param coreLogonInfo
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(Model model,CoreLogonInfo coreLogonInfo,HttpServletResponse response){
		return "/account/login";
	}
	
	@RequestMapping(value="/logout")
	public String logout(Model model,HttpServletResponse response) throws IOException{
		CookieTool.clearUser();
		response.sendRedirect("/index.html");
		return null;
	}
	
}
