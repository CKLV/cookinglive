package com.focustech.cookinglove.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focustech.cookinglove.ibator.domain.CoreLogonInfo;
import com.focustech.cookinglove.web.service.AccountService;

/**
 * 此controller专门处理异步验证类
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/validate")
public class ValidateController extends BaseController {
	
	@Autowired
	AccountService accountService;
	
	/**
	 * 验证账号的唯一性
	 * 
	 * @param model
	 * @param email
	 */
	@RequestMapping(value="/account")
	public void validateEmail(Model model,String emailAddress,String logUsername,String nickName){
		CoreLogonInfo coreLogonInfo=new CoreLogonInfo();
		coreLogonInfo.setEmailAddress(emailAddress);
		coreLogonInfo.setLogUsername(logUsername);
		coreLogonInfo.setNickName(nickName);
		CoreLogonInfo logonInfo=accountService.selectUser(coreLogonInfo);
		model.addAttribute(logonInfo==null);
	}
}
