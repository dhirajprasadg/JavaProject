package com.tutorialspoint.controller;

import javax.servlet.ServletContext;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	public WebController() {
		System.out.println(" WebController default constructor is invoked ");
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {

		System.out.println(" WebController class redirect method invoked ");
		return "redirect:finalpage";

	}

	@RequestMapping(value = "/finalpage", method = RequestMethod.GET)
	public String finalpage() {
		System.out.println(" WebController class fianlpage method invoked ");
		return "final";

	}


	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String staticpage() {
		
		return "redirect:/pages/finalstaticpage.html";

	}



}
