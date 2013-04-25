package com.focustech.cookinglove.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.focustech.cookinglove.base.SecurityContextHandler;
import com.focustech.cookinglove.base.User;
import com.focustech.cookinglove.defined.domain.ArticleDefinedDomain;
import com.focustech.cookinglove.ibator.domain.Article;
import com.focustech.cookinglove.ibator.domain.ArticleExample;
import com.focustech.cookinglove.ibator.mapper.ArticleMapper;

@Component
public class ArticleDomain extends BaseDomain {
	
	@Autowired
	ArticleMapper articleMapper;
	
	/**
	 * 添加文章 
	 * @param article
	 */
	public void addArticle(Article article){
		finishArticle(article);
		articleMapper.insert(article);
	}
	
	/**
	 * 更新文章
	 * @param article
	 */
	public void updateArticle(Article article){
		finishArticle(article);
		articleMapper.updateByPrimaryKey(article);
	}
	
	/**
	 * 删除文章
	 * @param articleId
	 */
	public void delArticle(long articleId){
		articleMapper.deleteByPrimaryKey(articleId);
	}
	
	/**
	 * 根据用户ID获取文章列表
	 * @param userId
	 * @return
	 */
	public List<Article> getArticleList(long userId){
		ArticleExample example=new ArticleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("recordStart", 3);
		map.put("pageSize", 4);
		List<ArticleDefinedDomain> list=articleMapper.selectArticleList(map);
		return articleMapper.selectByExampleWithBLOBs(example);
	}
	
	public Article getArticle(long articleId){
		return articleMapper.selectByPrimaryKey(articleId);
	}
	
	/**
	 * 完成article的其余值设置
	 * @param article
	 */
	private void finishArticle(Article article){
		User user=SecurityContextHandler.getUser();
		article.setUserId(user.getUserId());
		article.setCheckStatus(1);
		article.setAdderName(String.valueOf(user.getUserId()));
		article.setUpdaterName(String.valueOf(user.getUserId()));
		article.setUpdateTime(new Date());
		article.setPublishTime(new Date());
	}
}
