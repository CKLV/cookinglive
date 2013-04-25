package com.focustech.cookinglove.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focustech.cookinglove.ibator.domain.Article;
import com.focustech.cookinglove.web.service.ArticleService;
import com.focustech.log4j.Log4jUtil;

@Controller
@RequestMapping(value="/article")
public class ArticleController {
	
	public static final String logName = "error-logger";
	@Autowired
	ArticleService articleService;
	
//	private static Logger logger = Logger.getLogger(logName);
	
	@RequestMapping(value="/detail/{recId}")
	public String detail(Model model,@PathVariable long recId){
		Article article=articleService.queryArticle(recId);
		model.addAttribute("article",article);
//		logger.debug("detail test");
//		logger.error("error log test");
		
		Log4jUtil.getBusinessLogger().info("message!");
		return "/article/detail";
	}
	
	@RequestMapping(value="/list/{page}")
	public String list(Model model,@PathVariable long page){
		return "/article/list";
	}
}
