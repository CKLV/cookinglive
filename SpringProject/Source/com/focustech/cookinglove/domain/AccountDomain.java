package com.focustech.cookinglove.domain;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.focustech.cookinglove.ibator.domain.CoreLogonInfo;
import com.focustech.cookinglove.ibator.domain.CoreLogonInfoExample;
import com.focustech.cookinglove.ibator.domain.CoreLogonInfoExample.Criteria;
import com.focustech.cookinglove.ibator.mapper.CoreLogonInfoMapper;

@Component
public class AccountDomain extends BaseDomain {
	
	@Autowired
	CoreLogonInfoMapper coreLogonInfoMapper;
	
	/**
	 * 插入用户信息
	 * @param coreLogonInfo
	 */
	public void insertUser(CoreLogonInfo coreLogonInfo){
		coreLogonInfo.setUserStatus("1");
		coreLogonInfo.setAddTime(new Date());
		coreLogonInfo.setActivityFlag("1");
		coreLogonInfoMapper.insertSelective(coreLogonInfo);
	}
	
	/**
	 * 根据用户ID、用户邮箱或者用户名查询用户账号信息
	 * @param email
	 * @return
	 */
	public CoreLogonInfo selectUser(CoreLogonInfo coreLogonInfo){
		CoreLogonInfoExample example=new CoreLogonInfoExample();
		Criteria criteria = example.createCriteria();
		if(coreLogonInfo.getUserId()!=null){
			criteria.andUserIdEqualTo(coreLogonInfo.getUserId());
		}
		if(StringUtils.isNotBlank(coreLogonInfo.getLogUsername())){
			criteria.andLogUsernameEqualTo(coreLogonInfo.getLogUsername());
		}
		if(StringUtils.isNotBlank(coreLogonInfo.getEmailAddress())){
			criteria.andEmailAddressEqualTo(coreLogonInfo.getEmailAddress());
		}
		if(StringUtils.isNotBlank(coreLogonInfo.getNickName())){
			criteria.andNickNameEqualTo(coreLogonInfo.getNickName());
		}
		List<CoreLogonInfo> list = coreLogonInfoMapper.selectByExample(example);
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 更新用户账号信息
	 * @param coreLogonInfo
	 */
	public void updateCoreLogonInfo(CoreLogonInfo coreLogonInfo){
		CoreLogonInfoExample example=new CoreLogonInfoExample();
		example.createCriteria().andUserIdEqualTo(coreLogonInfo.getUserId());
		coreLogonInfoMapper.updateByExampleSelective(coreLogonInfo, example);
	}
}
