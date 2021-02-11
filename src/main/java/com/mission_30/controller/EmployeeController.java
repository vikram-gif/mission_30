package com.mission_30.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mission_30.model.Employee;
import com.mission_30.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	EmployeeService empService; 
	
	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST )
	public Employee createEmployee(@RequestBody Employee employee) {
		return empService.createEmployee(employee);
	}
	
	@RequestMapping(value="/getEmployees",method = RequestMethod.GET)
	public List<Employee> employees()
	{
		List<Employee> employees = empService.getEmployees();
		System.out.println(employees);
		return employees;
	}
	
	
	
	@RequestMapping(value="/employeeDetails/{empEmail}",method=RequestMethod.GET)
	public Employee employeeDetails(@PathVariable String empEmail) {
		return empService.getEmployeeDetails(empEmail);
	}
	
	//terminating specific employee
	@RequestMapping(value="/terminateEmployees/{empEmail}",method=RequestMethod.DELETE)
	public void terminateEmployee(@PathVariable String empEmail) {
		empService.terminateEmployee(empEmail);
	}
	
	
	
	
	
	
			
}
