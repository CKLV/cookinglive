package com.focustech.cookinglove.base;


/**
 * IP对象
 * @author xiajinming
 *
 */
public class IP{
	private String ip;
	
	public IP() {
	}
	
	public IP(String ip){
		this.ip=ip;
	}
	
	/**
	 * 比较两个IP大小
	 * @param anotherIp
	 * @return
	 */
	public long compareTo(IP anotherIp){
		return getNum()-anotherIp.getNum();
	}

	/**
	 * 将IP转换为长整型
	 * @return
	 */
	protected long getNum(){
		long num=0L;
		String[] ips=ip.split("\\.");
		if(ips==null || ips.length<4){
			return num;
		}
		for(int i=0;i<ips.length;i++){
			num+=Integer.valueOf(ips[i])*(1<<((3-i)*8));
		}
		return num;
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
