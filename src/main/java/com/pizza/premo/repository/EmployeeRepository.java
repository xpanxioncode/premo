package com.pizza.premo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizza.premo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
