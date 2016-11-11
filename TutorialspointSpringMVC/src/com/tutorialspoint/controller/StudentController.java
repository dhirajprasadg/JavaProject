package com.tutorialspoint.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorialspoint.entitybean.Student;
import com.tutorialspoint.springexception.SpringCustomException;

@Controller
public class StudentController {
	public StudentController() {
		System.out
				.println(" StudentController Class default constructor is invoked ie object is created ");
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		System.out.println(" print Hello mehtod is invoked in controller class");
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "hello";
	}

	// Spring contains form-specific controllers, command-based controllers, and
	// controllers that execute wizard-style logic .
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView studentmethod() {
		System.out.println(" Student method is invoked");

		return new ModelAndView("studentss", "command", new Student());

	}

	@RequestMapping(value = "addStudent", method = RequestMethod.POST)
	@ExceptionHandler({ SpringCustomException.class })
	public String addStudent(@ModelAttribute("HelloWe") Student studentobj,
			ModelMap model) {
		System.out.println(" Student object detail : " + studentobj.getName());
		System.out.println(" add student method is invoked ");
		if (studentobj.getName().length() < 5) {
			throw new SpringCustomException("Student Name is too short");
		} else {
			model.addAttribute("name", studentobj.getName());
		}
		if (studentobj.getAge() < 10) {
			throw new SpringCustomException(" Student Age is below 10");
		} else {
			model.addAttribute("age", studentobj.getAge());
		}
		model.addAttribute("id", studentobj.getId());
		model.addAttribute("countryiee", studentobj.getCountry());
		return "result";
	}

}
