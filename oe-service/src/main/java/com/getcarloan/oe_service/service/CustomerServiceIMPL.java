package com.getcarloan.oe_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.oe_service.communication.FiegnClientCommunication;
import com.getcarloan.oe_service.dto.CustomerDto;
import com.getcarloan.oe_service.repository.CustomerRepository;

@Service
public class CustomerServiceIMPL implements CustomerService{
	
	@Autowired
	private CustomerRepository repo;
	
	@Autowired
	private FiegnClientCommunication communication;
	
	
	

	


	@Override
	public List<CustomerDto> viewAllCustomer() {
		return repo.findAll();
		
	}

	@Override
	public String viewCustomerById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
