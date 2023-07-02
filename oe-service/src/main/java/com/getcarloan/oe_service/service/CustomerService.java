package com.getcarloan.oe_service.service;

import java.util.List;

import com.getcarloan.oe_service.dto.CustomerDto;
import com.getcarloan.oe_service.entites.Customer;

public interface CustomerService {

	List<Customer> viewAllCustomer();

	String viewCustomerById();

}
