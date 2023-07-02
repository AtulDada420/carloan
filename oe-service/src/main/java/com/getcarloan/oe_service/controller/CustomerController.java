package com.getcarloan.oe_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.getcarloan.oe_service.communication.FiegnClientCommunication;
import com.getcarloan.oe_service.dto.CustomerDto;
import com.getcarloan.oe_service.service.CustomerService;


@RestController
@RequestMapping("/oe-service")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	


	
	
	
	
	@GetMapping("/")
	public ResponseEntity<String> check() {
		return new ResponseEntity<String>("App Working",HttpStatus.OK);
		
	}
	
	@GetMapping("/viewAllCustomer")
	public ResponseEntity<List<CustomerDto>> viewAllCustomer() {
		return new ResponseEntity<List<CustomerDto>>(service.viewAllCustomer(), HttpStatus.OK);
	}
	
	@GetMapping("/viewCustomerById/{customerId}")
	public ResponseEntity<String> viewCustomerById (@PathVariable int customerId){
		return new ResponseEntity<String>(service.viewCustomerById(),HttpStatus.OK);
		
	}
	
}
