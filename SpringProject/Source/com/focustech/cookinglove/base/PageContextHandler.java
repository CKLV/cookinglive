package com.focustech.cookinglove.base;

public class PageContextHandler {
	
	private static ThreadLocal<Page> threadLocal=new ThreadLocal<Page>(); 
	
	public static Page getPage(){
		Page page=threadLocal.get();
		if(page==null){
			page=new Page();
			threadLocal.set(page);
		}
		return page;
	}
	
	public void removePage(){
		threadLocal.remove();
	}
}
