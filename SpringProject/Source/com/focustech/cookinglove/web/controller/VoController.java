package com.focustech.cookinglove.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.focustech.cookinglove.base.SecurityContextHandler;
import com.focustech.cookinglove.base.User;
import com.focustech.cookinglove.ibator.domain.Article;
import com.focustech.cookinglove.tool.CookieTool;
import com.focustech.cookinglove.web.service.ArticleService;

@Controller
@RequestMapping(value="/vo")
public class VoController {
	
	@Autowired
	ArticleService articleService;

	/**
	 * 会员中心首页
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/index")
	public String index(Model model,HttpServletRequest request){
		User user=CookieTool.getUser();
		return "/vo/index";
	}
	
	/**
	 * 文章添加页面
	 * @param model
	 * @param article
	 * @return
	 */
	@RequestMapping(value="/article/add")
	public String addArticle(Model model){
		return "/vo/article/add";
	}
	
	/**
	 * 发布文章
	 * @param model
	 * @param article
	 * @return
	 */
	@RequestMapping(value="/article/post",method=RequestMethod.POST)
	public String addArticle(Model model,Article article,HttpServletRequest request){
		String content=request.getParameter("articleContent");
		article.setArticleContent(content);
		articleService.addArticle(article);
		return "/vo/article/add";
	}
	
	/**
	 * 文章列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/article/list")
	public String listArticle(Model model){
		List<Article> list =articleService.queryArticleList(SecurityContextHandler.getUserId());
		model.addAttribute("articleList", list);
		return "/vo/article/list";
	}
	
	/**
	 * 相册列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/tourism/list")
	public String listTourism(Model model){
		return "/vo/tourism/list";
	}
	
}
