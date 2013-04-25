package com.focustech.cookinglove.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.focustech.cookinglove.domain.AccountDomain;
import com.focustech.cookinglove.ibator.domain.CoreLogonInfo;

@Service
@Transactional
public class AccountService{
	@Autowired
	AccountDomain accountDomain;
	
	/**
	 * 插入用户账号信息
	 * @author sweed0
	 * @param coreLogonInfo
	 */
	public void addUser(CoreLogonInfo coreLogonInfo){
		accountDomain.insertUser(coreLogonInfo);
	}
	
	/**
	 * 查询用户信息
	 * @param coreLogonInfo
	 * @return
	 */
	public CoreLogonInfo selectUser(CoreLogonInfo coreLogonInfo){
		return accountDomain.selectUser(coreLogonInfo);
	}
}
