package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	boolean existsCustomerByUserId(int userId);

}
