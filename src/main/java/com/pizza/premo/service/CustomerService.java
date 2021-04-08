package com.pizza.premo.service;

import java.util.List;

import com.pizza.premo.model.Customer;

public interface CustomerService {
	List <Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	void deleteCustomerById(long id);
}
