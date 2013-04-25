package com.focustech.cookinglove.tool;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

import com.focustech.validation.util.StringUtil;

/**
 * 网络相关工具类
 * @author xiajinming
 *
 */
public class WebTool {

	/**
	 * 获取请求的实际IP
	 * iisforward这个ISAP过滤器会对request对象进行重新包装，会附加一些WLS头信息
	 * @param request
	 * @return
	 */
	public static String getIp(HttpServletRequest request){
		String unknown="unknown";
		String ipAddress=request.getHeader("x-forwarded-for");
		if(StringUtils.isBlank(ipAddress) || unknown.equalsIgnoreCase(ipAddress)){
			ipAddress=request.getHeader("Proxy-Client-IP");
			if(StringUtils.isBlank(ipAddress) || unknown.equalsIgnoreCase(ipAddress)){
				ipAddress=request.getHeader("WL-Proxy-IP");
				if(StringUtils.isBlank(ipAddress) || unknown.equalsIgnoreCase(ipAddress)){
					ipAddress=request.getRemoteAddr();
					if(ipAddress.equals("127.0.0.1")){
						InetAddress inet=null;
						try {
							inet=InetAddress.getLocalHost();
						} catch (UnknownHostException e) {
						}
						if(inet!=null){
							ipAddress=inet.getHostAddress();
						}
					}
				}
			}
		}
		//对于通过多个代理的情况，第一个IP为客户端的真实IP。多个IP是按逗号分隔的
		if(StringUtils.isNotBlank(ipAddress) && ipAddress.length()>15){
			if(ipAddress.indexOf(',')>0){
				ipAddress=ipAddress.substring(0, ipAddress.indexOf(","));
			}
		}
		return ipAddress;
	}
}
