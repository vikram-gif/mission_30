package com.mission_30.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mission_30.model.Employee;
import com.mission_30.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	EmployeeService empService; 
	
	
	@RequestMapping("/")
	public String employee() {
		return "index";
	}
	
	
	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST )
	public Employee createEmployee(@RequestBody Employee employee) {
		return empService.createEmployee(employee);
	}
			
}
