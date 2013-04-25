package com.focustech.cookinglove.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focustech.cookinglove.domain.AlbumDomain;

@Controller
@RequestMapping(value="/tourism")
public class AlbumController extends BaseController{
	
	@RequestMapping(value="/list")
	public String list(Model model){
		return "/tourism/list";
	}
	
	@RequestMapping(value="/detail/{recId}")
	public String detail(Model model,@PathVariable long recId){
		return "/tourism/detail";
	}
}
