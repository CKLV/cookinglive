package com.focustech.cookinglove.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/access-forbid")
public class AccessForbidController {

	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="403",method = RequestMethod.GET)
	public String goto403(HttpServletRequest request,HttpServletResponse response){
//		try {
//			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/access-forbid/error");
//			reqDispatcher.forward(request, response);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/**
		try {
			response.sendRedirect("/access-forbid/error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return ("redirect:/access-forbid/error");
	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="404",method = RequestMethod.GET)
	public String goto404(HttpServletRequest request,HttpServletResponse response){
		return ("redirect:/access-forbid/error");
	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="error",method = RequestMethod.GET)
	public String gotoError(HttpServletRequest request,HttpServletResponse response){
		return "/error";
	}
	
	public String goto500(HttpServletRequest request,HttpServletResponse response){
		return "/error";
	}
}
