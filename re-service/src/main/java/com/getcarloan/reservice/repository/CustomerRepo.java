package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getcarloan.reservice.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	boolean existsCustomerByUserId(int userId);

	
}
