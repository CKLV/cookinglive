package com.focustech.cookinglove.base;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class IPRangeTest {
	
	String startIpStr;
	String endIpStr;
	String ip;
	boolean result;
	
	public IPRangeTest(String startIPStr,String endIpStr,String ip,boolean result){
		this.startIpStr=startIPStr;
		this.endIpStr=endIpStr;
		this.ip=ip;
		this.result=result;
	}
	
	@Parameters
	public static Collection getParams(){
		return Arrays.asList(new Object[][]{
				{"192.168.1.1","192.168.01.01","192.168.1.1",true},
				{"192.168.1.1","192.168.8.255","192.168.2.245",true},
				{"192.168.1.1","192.168.8.255","192.168.9.255",false},
			});
	}
	

	@Test
	public void testIsIn() {
		IPRange ipRange=new IPRange(startIpStr, endIpStr);
		if(result){
			assertTrue("ip not in range but expect in. startIpStr="+startIpStr+" endIpStr="+endIpStr+" ip="+ip,ipRange.isIn(ip));
		}else{
			assertFalse("ip in range bug expect not in. startIpStr="+startIpStr+" endIpStr="+endIpStr+" ip="+ip,ipRange.isIn(ip));
		}
	}

}
