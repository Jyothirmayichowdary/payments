package com.customer.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.sample.entity.Customer;
import com.customer.sample.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	/*@PostMapping("/customer/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomerInfo(customer);
	}*/
	
	@PutMapping("/customer/updateCustomerInfo")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomerInfo(customer);
	}
}
