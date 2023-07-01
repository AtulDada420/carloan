package com.getcarloan.reservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.service.ReserviceService;


@RestController
@RequestMapping("/ReService")
public class ReserviceController {


	@Autowired
	private ReserviceService reservice;
	
	@GetMapping("/getEnquiryByUserId/{userId}")
	public ResponseEntity<EnquiryDetails> getEnquiryByUserId(@PathVariable int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(reservice.getEnquiryByUserId(userId));
	}
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<EnquiryDetails>> getAllEnquiry() {
		return ResponseEntity.status(HttpStatus.OK).body(reservice.getAllEnquiry());
	}
	
		
	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<EnquiryDetails>> getAllEnquiry1() {
		return ResponseEntity.status(HttpStatus.OK).body(reservice.getAllEnquiry());
	}
	
	
	
}
