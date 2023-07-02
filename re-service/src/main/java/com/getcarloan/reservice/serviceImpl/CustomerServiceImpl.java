package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.repository.CustomerRepo;
import com.getcarloan.reservice.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo crepo;
	@Autowired
	private JavaMailSender sender;
	
	@Override
	public Customer getCustomerById(int cId) {
		if(crepo.existsCustomerById(cId)) 
			return crepo.findById(cId).get();
			else return new Customer();
	}
	@Override
	public String saveCustomer(Customer customer) {
		crepo.save(customer);
		return "Save New Customer";
	}
	@Override
	public List<Customer> getAllCustomer() {
		return crepo.findAll();
	}
	@Override
	public String updateCustomer(Customer customer) {
		crepo.save(customer);
		return "Upadate Customer";
		
	}
	@Override
	public String deleteCustomer(int cId) {
		crepo.deleteById(cId);
		return "Customer Deleted By ID";
	}
	}

	
	

