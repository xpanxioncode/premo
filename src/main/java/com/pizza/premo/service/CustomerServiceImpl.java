package com.pizza.premo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.premo.model.Customer;
import com.pizza.premo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	@Override 
	public void saveCustomer(Customer customer) {
		this.customerRepository.save(customer);
	}
	
	@Override
	public void deleteCustomerById(long id) {
		this.customerRepository.deleteById(id);
	}
}
