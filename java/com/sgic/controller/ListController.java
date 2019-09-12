package com.sgic.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sgic.dto.Employee;
import com.sun.tools.javac.util.List;
@Controller
public class ListController {
	
	@RequestMapping("/readList")
public ModelAndView sendList() {
	ModelAndView modelAndView=new ModelAndView();
	
	modelAndView.setViewName("displayList");
	
	
	Employee emp1 = new Employee();
	emp1.setId(1);
	emp1.setName("Sinthu");
	emp1.setSalary(15000);
	
	Employee emp2 = new Employee();
	emp2.setId(1);
	emp2.setName("Sinthu");
	emp2.setSalary(15000);
	
	Employee emp3 = new Employee();
	emp3.setId(1);
	emp3.setName("Sinthu");
	emp3.setSalary(15000);
	
		ArrayList<Employee> employees= new ArrayList<Employee>(); 

	employees.add(emp1);
	employees.add(emp2);
	employees.add(emp3);
	
	modelAndView.addObject("employees", employees);
	return modelAndView;
}
}
