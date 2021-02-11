package com.mission_30.service;

import java.util.List;

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

	@Override
	public List<Employee> getEmployees() {
		List<Employee> findAll = empDAO.findAll();
		if(findAll.size() != 0) {
			return findAll;
		} else {
			return findAll;
		}
		
	}

	@Override
	public Employee getEmployeeDetails(String empEmail) {
		
		return empDAO.findByEmpEmail(empEmail);
	}

	@Override
	public void terminateEmployee(String empEmail) {
		Employee employee = empDAO.findByEmpEmail(empEmail);
		empDAO.deleteById(employee.getEmpID());
		
	}
	


}
