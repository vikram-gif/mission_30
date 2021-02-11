package com.mission_30.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mission_30.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

	Employee findByEmpEmail(String empEmail);

	void deleteByEmpEmail(String empEmail);

}
