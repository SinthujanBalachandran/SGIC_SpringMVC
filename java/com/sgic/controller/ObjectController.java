package com.sgic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.dto.Employee;
@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
public ModelAndView sendObject() {
	ModelAndView modelAndView=new ModelAndView();
	
	modelAndView.setViewName("displayEmployee");
	Employee emp = new Employee();
	emp.setId(1);
	emp.setName("Sinthu");
	emp.setSalary(15000);
	
	modelAndView.addObject("employee", emp);
	return modelAndView;
}
}
