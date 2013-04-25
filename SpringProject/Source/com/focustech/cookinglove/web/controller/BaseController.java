package com.focustech.cookinglove.web.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.focustech.validation.core.ValidationService;

public class BaseController {
	
	@Autowired
	ValidationService validationService;
	

	/**
	 * 保存在json中的值
	 */
	Map<String, Object> map=new HashMap<String, Object>();
	
	/**
	 * 将值添加到json中去
	 * @param key
	 * @param obj
	 */
	protected void addJson(String key,Object obj) {
		map.put(key, obj);
	}
	
	/**
	 * 将值从json中移除
	 * @param key
	 */
	protected void removeJson(String key){
		map.remove(key);
	}
	
	/**
	 * controller方法中调用此方法返回json格式的数据
	 * @return
	 */
	protected Map<String,Object> getJson(){
		return map;
	}
	
	/**
	 * 验证控件
	 * @param pojoObject
	 * @param groupName
	 * @param lan
	 * @return
	 */
	protected Map<String, String> validate(Object pojoObject,String groupName) {
		Map<String, String> noticeMap=validationService.validate(pojoObject, "index", Locale.CHINA);
		return noticeMap;
	}
	
}
