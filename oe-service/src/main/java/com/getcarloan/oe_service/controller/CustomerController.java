package com.getcarloan.oe_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.getcarloan.oe_service.communication.FiegnClientCommunication;
import com.getcarloan.oe_service.entites.Customer;
import com.getcarloan.oe_service.service.CustomerService;


@RestController
@RequestMapping("/oe-service")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@Autowired
	private RestTemplate resttemplate;
	
	@Autowired
	private FiegnClientCommunication communication;
	

	
	@GetMapping("/")
	public ResponseEntity<String> check() {
		return new ResponseEntity<String>("App Working",HttpStatus.OK);
		
	}
	
	@GetMapping("/viewAllCustomer")
	public ResponseEntity<Customer> viewAllCustomer(){
		
		String url = "http://RESERVICE/ReService/getAllCustomer";
		return resttemplate.getForEntity(url, Customer.class);
		
	}
	
	@GetMapping("/getCustomerByFiegn")
	public ResponseEntity<Customer> getCustomerByFiegn (){
	Customer customer = communication.getAllCustomer();
		return ResponseEntity.status(HttpStatus.OK).body(customer);
	}
	
	
}
