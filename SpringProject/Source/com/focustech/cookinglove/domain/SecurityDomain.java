package com.focustech.cookinglove.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.focustech.cookinglove.base.AuthModel;
import com.focustech.cookinglove.ibator.domain.AuthUrl;
import com.focustech.cookinglove.ibator.domain.AuthUrlExample;
import com.focustech.cookinglove.ibator.mapper.AuthUrlMapper;

@Component
public class SecurityDomain {

	@Autowired
	AuthUrlMapper authUrlMapper;
	
	/**
	 * 返回需要验证的url list
	 * @return
	 */
	public List<AuthModel> getUrlList(){
		List<AuthModel> list=null;
		AuthUrlExample example=new AuthUrlExample();
		example.setOrderByClause("url_type desc");
		List<AuthUrl> urlList=authUrlMapper.selectByExample(example);
		if(urlList!=null){
			list=new ArrayList<AuthModel>();
			for(AuthUrl authUrl:urlList){
				AuthModel authModel=new AuthModel();
				authModel.setRegex(authUrl.getUrl());
				authModel.setStatus(authUrl.getUserStatus());
				authModel.setUserType(authUrl.getUserType());
				list.add(authModel);
			}
		}
		return list;
	}
}
