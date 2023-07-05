package com.getcarloan.account.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getcarloan.account.service.SanctionService;
import com.getcarloan.accountheader.entity.SanctionLetter;

@RestController
@RequestMapping("/ah-api")
@EntityScan(basePackages = "com.getcarloan.account")
public class AhController {
	
	@Autowired
	private SanctionService service;
	
	
	@PostMapping("/saveSanctionLetter")
	public ResponseEntity<String> saveSanctionLetter(@RequestBody SanctionLetter sanctionLetter) {
		System.out.println(sanctionLetter);
		return new ResponseEntity<String>(service.saveSanctionLetter(sanctionLetter),HttpStatus.CREATED);
		
	}
	

}
