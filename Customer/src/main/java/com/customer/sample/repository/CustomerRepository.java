package com.customer.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.sample.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Long>{
	
}
