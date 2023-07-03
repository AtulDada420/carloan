package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.CustomerAddress;

@Repository
public interface CustomerAddressRepo extends JpaRepository<CustomerAddress, Integer> {

<<<<<<< HEAD
=======
	boolean existsCustomerAddressByUserId(int userId);

	String save(int userId);

>>>>>>> 3d8b7c183aa0c85c3e3db9ce9534c8536e4dbb8b
}
