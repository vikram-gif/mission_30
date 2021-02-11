package com.mission_30.service;

import java.util.List;

import com.mission_30.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getEmployees();
	
	Employee getEmployeeDetails(String empEmail);

	void terminateEmployee(String empEmail);

}
