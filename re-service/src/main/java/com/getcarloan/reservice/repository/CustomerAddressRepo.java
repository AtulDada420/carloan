package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getcarloan.reservice.entities.CustomerAddress;

public interface CustomerAddressRepo extends JpaRepository<CustomerAddress, Integer> {

	boolean existsCustomerAddressByUserId(int userId);

	

}
