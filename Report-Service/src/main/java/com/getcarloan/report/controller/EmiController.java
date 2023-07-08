package com.getcarloan.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.entity.EMI;
import com.getcarloan.report.service.Emiservice;

@RestController
@RequestMapping("/emi-api")
public class EmiController {
	@Autowired
	private Emiservice eservice;
	
	
	@PostMapping("/CreateEmiDetails")
	public ResponseEntity<EMI> CreateEmiDetails(@RequestBody EMI emi)
	{
		eservice.CreateEmiDetails(emi);
		return ResponseEntity.status(HttpStatus.OK).body(emi);
	}
	
	@GetMapping("/getEmiDetails")
	public ResponseEntity<List<EMI>> getEmiDetails()
	{
		List<EMI> list=eservice.getEmiDetails();
		return ResponseEntity.status(HttpStatus.OK).body(list);
		
	}
	@GetMapping("/getEmiDeatilsByID/{cid}")
	public ResponseEntity<EMI> getEmiDeatilsByID(@PathVariable int cid)
	{
		EMI emi=eservice.getEmiDeatilsByID(cid);
		return ResponseEntity.status(HttpStatus.OK).body(emi);
		
	}
	
	@GetMapping("/getCustomerId/{cid}")
	public ResponseEntity<Customer>getCustomerId(@PathVariable int cid)
	{
		Customer cust=eservice.getCustomerId(cid);
		return ResponseEntity.status(HttpStatus.OK).body(cust);
	}

}
