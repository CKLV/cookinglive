package com.focustech.cookinglove.base;


/**
 * IP范围对象
 * @author xiajinming
 *
 */
public class IPRange {
	IP startIp;
	IP endIp;
	
	public IPRange() {
	
	}
	
	/**
	 * IP起始值与终止值相同来模拟一个IP
	 * @param ip
	 */
	public IPRange(String ip){
		startIp=endIp=new IP(ip);
	}
	
	public IPRange(String startIpStr,String endIpStr){
		startIp=new IP(startIpStr);
		endIp=new IP(endIpStr);
	}
	
	/**
	 * 判断指定的IP是否在此IP范围内
	 * @param ip
	 * @return
	 */
	public boolean isIn(String ip){
		IP tempIp=new IP(ip);
		return startIp.compareTo(tempIp)<=0 && endIp.compareTo(tempIp)>=0;		
	}
	
	/**
	 * 判断此IP是否不再此IP范围内
	 * @param ip
	 * @return
	 */
	public boolean isNotIn(String ip){
		return !isIn(ip);
	}
	
	public IP getStartIp() {
		return startIp;
	}
	public void setStartIp(IP startIp) {
		this.startIp = startIp;
	}
	public IP getEndIp() {
		return endIp;
	}
	public void setEndIp(IP endIp) {
		this.endIp = endIp;
	}
	
}
