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
import com.getcarloan.report.entity.Ledger;
import com.getcarloan.report.service.Ledgerservice;

@RestController
@RequestMapping("/Ledger-api")
public class LedgerController {
	
	@Autowired
	private Ledgerservice lservice;
	
	@PostMapping("/createledger")
	public ResponseEntity<Ledger> CreateLedger(@RequestBody Ledger ledger)
	{
		lservice.CreateLedger(ledger);
		return ResponseEntity.status(HttpStatus.OK).body(ledger);
	}

	@GetMapping("/getLedger")
	public ResponseEntity<List<Ledger>> getAllLedger()
	{
		List<Ledger> list=lservice.getAllLedger();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	
	
	
	
	@GetMapping("/getAllCustomerbyfeign")
	public ResponseEntity<List<Customer>> getAllCustomersbyfeign()
	{
		List<Customer> customer=lservice.getAllCustomersbyfeign();
		return ResponseEntity.status(HttpStatus.OK).body(customer);
	}

	@GetMapping("/getCustomerId/{cid}")
	public ResponseEntity<Ledger>getCustomerId(@PathVariable int cid)
	{
		Ledger cust1=lservice.getCustomerId(cid);
		return ResponseEntity.status(HttpStatus.OK).body(cust1);
	}

}
