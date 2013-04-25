package com.focustech.cookinglove.tool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.focustech.cookinglove.base.ErrorInfo;

/**
 * ErrorInfo的辅助工具类
 * @author xiajinming
 *
 */
public class ErrorInfos {
	private static Map<String, String> errorInfos;
	
	
	/**
	 * 从数据库中初始化错误码及相关信息
	 */
	public void init(){
		if(errorInfos==null){
			errorInfos=new HashMap<String, String>();
		}
		
		
	}
	
}
