package com.getcarloan.oe_service.service;

import java.util.List;

import com.getcarloan.oe_service.dto.CustomerDto;

public interface CustomerService {

	List<CustomerDto> viewAllCustomer();

	String viewCustomerById();

}
