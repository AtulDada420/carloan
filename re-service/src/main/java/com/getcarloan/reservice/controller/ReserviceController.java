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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.entities.LoanPlans;
import com.getcarloan.reservice.entities.User;
import com.getcarloan.reservice.service.CustomerService;
import com.getcarloan.reservice.service.GuarantorDetailsService;
import com.getcarloan.reservice.service.LoanDetailsService;
import com.getcarloan.reservice.service.LoanPlansService;
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
	private CustomerService customerservice;
	@Autowired
	private LoanDetailsService loanservice;
    @Autowired
	private LoanPlansService loanPlanservice;

////////////////////////////////////////////////////////////////////////////////////////////////////
 
   @GetMapping("/")
   public ResponseEntity<String> checkApi() {
		return ResponseEntity.status(HttpStatus.OK).body("app working fine-------------------");
	}
    
    
////////////////////////////////////////////////////////////////////////////////////////////////////

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

////////////////////////////////////////////////////////////////////////////////////////////////////////

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

//////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveDocument/{cid}")
	public ResponseEntity<Customer> saveDocument(@RequestPart MultipartFile F1, @RequestPart MultipartFile F2,
			@RequestPart MultipartFile F3, @RequestPart MultipartFile F4, @RequestPart MultipartFile F5,
			@RequestPart MultipartFile F6, @RequestPart MultipartFile F7, @RequestPart MultipartFile F8, @PathVariable int cid) {
		Customer customer=null;

		AllPersonalDocs doc = new AllPersonalDocs();
		
		try {
			doc.setAddressProof(F1.getBytes());
			doc.setPanCard(F2.getBytes());
			doc.setItr(F3.getBytes());
			doc.setAdharCard(F4.getBytes());
			doc.setPhoto(F5.getBytes());
			doc.setSign(F6.getBytes());
			doc.setBankCheque(F7.getBytes());
			doc.setSalarySlips(F8.getBytes());
		      
		      customer = customerservice.findByEID(cid);
		      //customer.setCAllPersonalDocs(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		customerservice.saveDocument(doc);
	    return ResponseEntity.status(HttpStatus.CREATED).body(customerservice.SaveCustomerwithDocument(customer));
	}

	@ExceptionHandler(IOException.class)
	public ResponseEntity<String> ioException() {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File not uploaded correctly");
	}
	

///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@GetMapping("/getCustomerById/{cid}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int cid) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getCustomerById(cid));
	}

	@PostMapping("/saveCustomer")
	public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customerDto) {
			customerservice.saveCustomer(customerDto);
			return ResponseEntity.status(HttpStatus.CREATED).body(customerDto);
	}

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getAllCustomer());
	}

	@PutMapping("/updateCustomer/{cid}")
	public ResponseEntity<String> updateCustomerById(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.updateCustomerById(cid), HttpStatus.OK);
	}

	@DeleteMapping("deleteCustomer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.deleteCustomer(cid), HttpStatus.OK);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveAccountDetails/{cid}")
	public ResponseEntity<Customer> saveAccountDetails(@RequestBody AccountDetails accountDetails,@PathVariable int cid) {
		
		Customer customer = customerservice.findByEID(cid);
	     // customer.setCAccountDetails(accountDetails);
	      customerservice.saveAccountDetails(accountDetails);
	      return ResponseEntity.status(HttpStatus.CREATED).body(customerservice.SaveCustomerwithAccountDetails(customer));
	}

	@GetMapping("/getAllAccountDetailsById/{cid}")
	public ResponseEntity<Customer> getAllAccountDetailsByCustomerId(@PathVariable int cid) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getAllAccountDetailsByCustomerId(cid));
	}

	@PutMapping("/updateAccountDetails/{cid}")
	public ResponseEntity<String> updateAccountDetailsByCustomerId(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.updateAccountDetailsByCustomerId(cid), HttpStatus.OK);
	}

	@DeleteMapping("deleteAccountDetails/{cid}")
	public ResponseEntity<String> deleteAccountDetailsByCustomerId(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.deleteAccountDetailsByCustomerId(cid), HttpStatus.OK);
	}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveCustomerAddress/{cid}")
	public ResponseEntity<Customer> saveCustomerAddressByCustomerId(@RequestBody CustomerAddress customerAddress,@PathVariable int cid) {
		
		Customer customer = customerservice.findByEID(cid);
	     // customer.setCAddress(customerAddress);
	      customerservice.saveCustomerAddressByCid(customerAddress);
	      return ResponseEntity.status(HttpStatus.CREATED).body(customerservice.SaveCustomerwithCustomerAddress(customer));
	       
	}

	@GetMapping("/CustomerAddressByCid/{cid}")
	public ResponseEntity<Customer> CustomerAddressBycId(@PathVariable int cid) {
		return new ResponseEntity<Customer>(customerservice.CustomerAddressBycId(cid), HttpStatus.OK);
	}

	@PutMapping("/updateCustomerAddressCid/{cid}")
	public ResponseEntity<String> updateCustomerAddressByCid(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.updateCustomerAddressByCid(cid), HttpStatus.OK);
	}

	@DeleteMapping("deleteCustomerAddressCid/{cid}")
	public ResponseEntity<String> deleteCustomerAddressByCid(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.deleteCustomerAddressByCid(cid), HttpStatus.OK);

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveGuarantorDetails/{cid}")
	public ResponseEntity<Customer> saveGuarantorDetails(@RequestBody GuarantorDetails guarantorDetails,@PathVariable int cid) {
		
		Customer customer = customerservice.findByEID(cid);
	    //  customer.setCGuarantorDetails(guarantorDetails);
	      customerservice.saveGuarantorDetailsByCid(guarantorDetails);
	      return ResponseEntity.status(HttpStatus.CREATED).body(customerservice.SaveCustomerwithGuarantorDetails(customer));
		
		
	}

	@GetMapping("/getGuarantorDetailsByCid/{cid}")
	public ResponseEntity<Customer> getGuarantorDetailsByCid(@PathVariable int cid) {
		return new ResponseEntity<Customer>(customerservice.getGuarantorDetailsByCid(cid), HttpStatus.OK);

	}

	@PutMapping("/updateGuarantorDetails/{cid}")
	public ResponseEntity<String> updateGuarantorDetailsById(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.updateGuarantorDetailsById(cid), HttpStatus.OK);
	}

	@DeleteMapping("/deleteGuarantorDetailsByCid/{cid}")
	public ResponseEntity<String> deleteGuarantorDetailsByCid(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.deleteGuarantorDetailsById(cid), HttpStatus.OK);
	}

	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveLoanDetails")
	public ResponseEntity<String> saveLoanDetails(@RequestBody LoanDetails loanDetails) {
		return new ResponseEntity<String>(loanservice.saveLoanDetails(loanDetails), HttpStatus.CREATED);
	}

	@GetMapping("/getLoanDetailsByUserId/{loanId}")
	public ResponseEntity<LoanDetails> getLoanDetailsById(@PathVariable int loanId) {
		return new ResponseEntity<LoanDetails>(loanservice.getLoanDetailsById(loanId), HttpStatus.OK);
	}

	@GetMapping("/getAllLoanDetails")
	public ResponseEntity<List<LoanDetails>> getAllLoanDetails() {
		return new ResponseEntity<List<LoanDetails>>(loanservice.getAllLoanDetails(), HttpStatus.OK);
	}

	@PutMapping("/updateLoanDetails/{loanId}")
	public ResponseEntity<String> updateLoanDetailsById(@PathVariable int loanId) {
		return new ResponseEntity<String>(loanservice.updateLoanDetailsById(loanId), HttpStatus.OK);

	}

	@DeleteMapping("/deleteLoanDetails/{loanId}")
	public ResponseEntity<String> deleteLoanDetailsById(@PathVariable int loanId) {
		return new ResponseEntity<String>(loanservice.deleteLoanDetailsById(loanId), HttpStatus.OK);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@PostMapping("/saveLoanPlans")
	public ResponseEntity<String> saveLoanPlans(@RequestBody LoanPlans loanPlans) {
		return new ResponseEntity<String>(loanPlanservice.saveLoanPlans(loanPlans), HttpStatus.CREATED);
	}

	@GetMapping("/getLoanPlansById/{planID}")
	public ResponseEntity<LoanPlans> getLoanPlansById(@PathVariable int planID) {
		return new ResponseEntity<LoanPlans>(loanPlanservice.getLoanPlansById(planID), HttpStatus.OK);
	}

	@GetMapping("/getAllLoanPlans")
	public ResponseEntity<List<LoanPlans>> getAllLoanPlans() {
		return new ResponseEntity<List<LoanPlans>>(loanPlanservice.getAllLoanPlans(), HttpStatus.OK);

	}

	@PutMapping("/updateLoanPlans/planID")
	public ResponseEntity<String> updateLoanPlansById(@RequestBody int planID) {
		return new ResponseEntity<String>(loanPlanservice.updateLoanPlansById(planID), HttpStatus.OK);
	}

	@DeleteMapping("/deleteLoanPlans/{planID}")
	public ResponseEntity<String> deleteLoanPlansById(@PathVariable int planID) {
		return new ResponseEntity<String>(loanPlanservice.deleteLoanPlansById(planID), HttpStatus.OK);

	}
}
