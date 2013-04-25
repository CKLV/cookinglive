package com.focustech.cookinglove.defined.domain;

import com.focustech.cookinglove.base.User;
import com.focustech.cookinglove.ibator.domain.Article;
import com.focustech.cookinglove.ibator.domain.ClickNum;

public class ArticleDefinedDomain extends Article{
	/**
	 * 存放文章作者信息
	 */
	private User user;
	/**存放点击量*/
	private ClickNum clickNum;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ClickNum getClickNum() {
		return clickNum;
	}
	public void setClickNum(ClickNum clickNum) {
		this.clickNum = clickNum;
	}
	
}
