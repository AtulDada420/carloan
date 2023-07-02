package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.CustomerAddress;

@Repository
public interface CustomerAddressRepo extends JpaRepository<CustomerAddress, Integer> {

}
