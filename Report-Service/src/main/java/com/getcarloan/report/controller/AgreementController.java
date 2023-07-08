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

import com.getcarloan.report.entity.Agreement;
import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.service.Agreementservice;

@RestController
@RequestMapping("/agreement-api")
public class AgreementController {
	
	@Autowired
	private Agreementservice aservice;
	
	@PostMapping("/Agreementcreate")
	public ResponseEntity<Agreement> Agreementcreate(@RequestBody Agreement agremment)
	{
		aservice.Agreementcreate(agremment);
		return ResponseEntity.status(HttpStatus.OK).body(agremment);
		
	}
	@GetMapping("/getAllAgreement")
	public ResponseEntity<List<Agreement>> getAllAgreement()
	{
		List<Agreement> a=aservice.getAllAgreement();
		return ResponseEntity.status(HttpStatus.OK).body(a);
	}
	
	@GetMapping("/getCustomerByCust/{cid}")
	public ResponseEntity<Customer> getCustomerByCust(@PathVariable int cid)
	{
		Customer cust=aservice.getCustomerByCust(cid);
		return ResponseEntity.status(HttpStatus.OK).body(cust);
	}
	
@GetMapping("/getAgreementBycid/{cid}")
public ResponseEntity<Agreement> getAgreementBycid(@PathVariable int cid)
{
	
	return new ResponseEntity<Agreement>(aservice.getAgreementBycid(cid),HttpStatus.OK);
	
}

}
