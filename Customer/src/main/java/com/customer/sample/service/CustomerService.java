package com.customer.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.sample.entity.Customer;
import com.customer.sample.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository custRepository;
	
	public Customer saveCustomerInfo(Customer customer) {
		
		return custRepository.save(customer);
	}

}
