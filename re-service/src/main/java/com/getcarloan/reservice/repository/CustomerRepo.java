package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

<<<<<<< HEAD
	//boolean existsCustomerById(int cId);
=======
	boolean existsCustomerByUserId(int userId);
>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666

}
