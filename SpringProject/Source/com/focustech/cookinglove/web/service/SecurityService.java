package com.focustech.cookinglove.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focustech.cookinglove.base.AuthModel;
import com.focustech.cookinglove.domain.SecurityDomain;

@Service
@Transactional
public class SecurityService{
	
	@Autowired
	SecurityDomain securityDomain;
	
	public List<AuthModel> getUrlList(){
		return securityDomain.getUrlList();
	}
}
