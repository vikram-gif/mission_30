package com.mission_30.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission_30.dao.EmployeeDAO;
import com.mission_30.model.Employee;

@Service
public class EmpServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO empDAO;
	
	@Override
	public Employee createEmployee(Employee employee) {
		System.out.println(employee.getEmpAddress());
		System.out.println(employee.getEmpName());
		return empDAO.save(employee);
	}

}
