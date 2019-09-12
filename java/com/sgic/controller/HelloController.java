package com.sgic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 1);
		modelAndView.addObject("name", "Sinthu");
		modelAndView.addObject("Salary", 150000);
		return modelAndView;
	}
	
	@RequestMapping("/second")
	public ModelAndView second() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("second");
		return modelAndView;
}
}
