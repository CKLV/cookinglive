package com.focustech.cookinglove.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ueditor.Uploader;

@Controller
public class UEditorController {

	@RequestMapping(value="/uploadimage.json")	
	public String uploadImage(Model model,HttpServletRequest request,HttpServletResponse response){
		Uploader uploader=new Uploader(request);
		uploader.setAllowFiles(new String[]{"gif","jpg","jpeg"});
		uploader.setMaxSize(2000);
		uploader.setSavePath("/upload");
		try {
			uploader.upload();
			StringBuffer buffer=new StringBuffer();
			buffer.append("{url:'").append(uploader.getUrl()).append("',title:'").append(uploader.getTitle()).append("',status:'").append(uploader.getState()).append("'}");
			response.getWriter().write(buffer.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
