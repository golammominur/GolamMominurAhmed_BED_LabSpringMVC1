package com.greatlearning.lab.session.Employee.Management.System.service;

import java.util.List;

import com.greatlearning.lab.session.Employee.Management.System.entity.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}
