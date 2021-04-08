package com.pizza.premo.service;


import java.util.List;

import com.pizza.premo.model.Employee;

public interface EmployeeService {
	List <Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
