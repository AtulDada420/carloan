package com.getcarloan.oe_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.oe_service.dto.CustomerDto;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDto, Integer>{

}
