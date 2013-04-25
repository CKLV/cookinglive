package com.focustech.cookinglove.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.focustech.cookinglove.ibator.mapper.AlbumMapper;

@Component
public class AlbumDomain extends BaseDomain{
	
	@Autowired
	AlbumMapper albumMapper;
	
	public void test(){
		System.out.println("aaaa");
	}
}
