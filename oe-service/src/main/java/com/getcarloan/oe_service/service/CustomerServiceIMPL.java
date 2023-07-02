package com.getcarloan.oe_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.oe_service.communication.FiegnClientCommunication;
import com.getcarloan.oe_service.dto.CustomerDto;
import com.getcarloan.oe_service.entites.Customer;


@Service
public class CustomerServiceIMPL implements CustomerService{
	
	
	@Autowired
	private FiegnClientCommunication communication;

	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewCustomerById() {
		// TODO Auto-generated method stub
		return null;
	}
	


	

}
