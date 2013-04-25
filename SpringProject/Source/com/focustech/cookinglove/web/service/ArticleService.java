package com.focustech.cookinglove.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focustech.cookinglove.domain.ArticleDomain;
import com.focustech.cookinglove.ibator.domain.Article;

@Service
@Transactional
public class ArticleService {

	@Autowired
	ArticleDomain articleDomain;
	
	/**
	 * 发布文章
	 * @param article
	 */
	public void addArticle(Article article){
		articleDomain.addArticle(article);
	}
	
	/**
	 * 更新文章
	 * @param article
	 */
	public void updateArticle(Article article){
		articleDomain.updateArticle(article);
	}
	
	/**
	 * 删除文章
	 * @param articleId
	 */
	public void deleteArticle(long articleId){
		articleDomain.delArticle(articleId);
	}
	
	/**
	 * 根据用户ID获取文章列表
	 * @param userId
	 * @return
	 */
	public List<Article> queryArticleList(long userId){
		return articleDomain.getArticleList(userId);
	}
	
	public Article queryArticle(long articleId){
		return articleDomain.getArticle(articleId);
	}
}
