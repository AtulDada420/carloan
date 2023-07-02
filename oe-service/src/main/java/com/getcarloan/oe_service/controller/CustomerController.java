package com.getcarloan.oe_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class CustomerController {
	
     @GetMapping("/")
	public ResponseEntity<String>check()
	{
		return new ResponseEntity<String>("App Working",HttpStatus.OK);
	}
	
}
