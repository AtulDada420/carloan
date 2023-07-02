package com.getcarloan.reservice.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.User;

import com.getcarloan.reservice.service.AllPersonalDocsService;
import com.getcarloan.reservice.service.CustomerService;
import com.getcarloan.reservice.service.ReserviceService;
import com.getcarloan.reservice.service.UserService;

@RestController
@RequestMapping("/ReService")
public class ReserviceController {

	@Autowired
	private ReserviceService reservice;
	@Autowired
	private UserService usrservice;
	@Autowired
	private AllPersonalDocsService docservice;
	@Autowired
	private CustomerService customerservice;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@PostMapping("/createEnquiry")
	public ResponseEntity<String> createEnquiry(@RequestBody EnquiryDetails enquiryDetails) {
		return new ResponseEntity<String>(reservice.createEnquiry(enquiryDetails), HttpStatus.CREATED);
	}

	@GetMapping("/getEnquiryByUserId/{userId}")
	public ResponseEntity<EnquiryDetails> getEnquiryByUserId(@PathVariable int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(reservice.getEnquiryByUserId(userId));
	}

	@GetMapping("/getAllEnquiry")
	public ResponseEntity<List<EnquiryDetails>> getAllEnquiry() {
		return ResponseEntity.status(HttpStatus.OK).body(reservice.getAllEnquiry());
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@PostMapping("/saveUser")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		return new ResponseEntity<String>(usrservice.saveUser(user), HttpStatus.CREATED);
	}

	@PutMapping("/updateUser")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		return new ResponseEntity<String>(usrservice.saveUser(user), HttpStatus.OK);
	}

	@GetMapping("/getUserByUserId/{userId}")
	public ResponseEntity<User> getUserByUserId(@PathVariable int userId) {
		return ResponseEntity.status(HttpStatus.OK).body(usrservice.getUserByUserId(userId));
	}

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.status(HttpStatus.OK).body(usrservice.getAllUsers());
	}

	@DeleteMapping("deleteUser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable int userId) {
		return new ResponseEntity<String>(usrservice.deleteUser(userId), HttpStatus.OK);
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@PostMapping("/saveDocument")
	public ResponseEntity<String> saveDocument(@RequestPart MultipartFile F1, @RequestPart MultipartFile F2,
			@RequestPart MultipartFile F3, @RequestPart MultipartFile F4, @RequestPart MultipartFile F5,
			@RequestPart MultipartFile F6, @RequestPart MultipartFile F7, @RequestPart MultipartFile F8) {

		AllPersonalDocs doc = new AllPersonalDocs();
		try {
			doc.setAddressProof(F1.getBytes());
			doc.setPanCard(F2.getBytes());
			doc.setItr(F3.getBytes());
			doc.setAdharCard(F4.getBytes());
			doc.setPhoto(F5.getBytes());
			doc.setSign(F6.getBytes());
			doc.setBankCheck(F7.getBytes());
			doc.setSalarySlips(F8.getBytes());
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		docservice.saveDocument(doc);
		return ResponseEntity.status(HttpStatus.CREATED).body("Document uploaded");
	}

	@ExceptionHandler(IOException.class)
	public ResponseEntity<String> ioException() {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File not uploaded correctly");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/getCustomerById/{cId}")
	public ResponseEntity<Customer> getCustomerId(@PathVariable int cId) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getCustomerById(cId));
	}

	@PostMapping("/saveCustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<String>(customerservice.saveCustomer(customer), HttpStatus.CREATED);

	}

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getAllCustomer());
	}

	@PutMapping("/updateCustomer")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<String>(customerservice.updateCustomer(customer), HttpStatus.OK);
	}

	@DeleteMapping("deleteCustomer/{cId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int cId) {
		return new ResponseEntity<String>(customerservice.deleteCustomer(cId), HttpStatus.OK);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
