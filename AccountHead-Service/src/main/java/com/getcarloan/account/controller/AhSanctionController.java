package com.getcarloan.account.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getcarloan.account.entity.Customer;

import com.getcarloan.account.entity.SanctionLetter;

import com.getcarloan.account.service.SanctionService;





@RestController
@RequestMapping("/ah-api/Sanction")
public class AhSanctionController {
	
	@Autowired
	private SanctionService service ;
	
	
	
	@PostMapping("/saveSanctionLetter")
	public ResponseEntity<String> saveSanctionLetter(@RequestBody SanctionLetter sanctionLetter) {
		System.out.println(sanctionLetter);
		return new ResponseEntity<String>(service.saveSanctionLetter(sanctionLetter),HttpStatus.CREATED);
		
	}

	@GetMapping("/viewSanctionLetter")
	public ResponseEntity<List<SanctionLetter>> viewSanctionLetter(){
		return new ResponseEntity<List<SanctionLetter>>(service.viewSanctionLetter(),HttpStatus.OK);
		
	}
	@GetMapping("/viewSanctionLetterById/{cid}")
	public ResponseEntity<SanctionLetter> viewSanctionLetterById(@PathVariable int cid ){
		return new ResponseEntity<SanctionLetter>(service.viewSanctionLetterByID(cid),HttpStatus.OK);
	}
	
	
	@GetMapping("/getCustomerId/{cid}")
	public ResponseEntity<Customer> getCustomerId(@PathVariable int cid) {
		return new ResponseEntity<Customer>(service.getCustomerId(cid),HttpStatus.OK);
		
	
	}
	@GetMapping("/getAllCustomerByFeign")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return new ResponseEntity<List<Customer>>(service.getAllCustomerByFeign(),HttpStatus.OK);
		
	
	}
	

	
	
}
