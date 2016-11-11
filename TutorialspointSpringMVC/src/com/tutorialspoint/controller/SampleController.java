package com.tutorialspoint.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

// http://docs.spring.io/spring-framework/docs/2.0.x/reference/mvc.html
public class SampleController extends AbstractController {
	public SampleController() {
		System.out
				.println(" SampleController Class default consturctor is invoked and default object is created ");
	}
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("message", "Hello World message !");
		return mav;
	}
}