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

import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.entities.PreviousLoan;
import com.getcarloan.reservice.entities.PreviousLoanBank;
import com.getcarloan.reservice.entities.User;
import com.getcarloan.reservice.service.CustomerService;
import com.getcarloan.reservice.service.EnquiryService;
import com.getcarloan.reservice.service.UserService;

@RestController
@RequestMapping("/ReService")
public class ReserviceController {

	@Autowired
	private EnquiryService reservice;
	@Autowired
	private UserService usrservice;
	
	@Autowired
	private CustomerService customerservice;
	

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
			@RequestPart MultipartFile F6, @RequestPart MultipartFile F7, @RequestPart MultipartFile F8 , @PathVariable int cid) {

		AllPersonalDocs doc = new AllPersonalDocs();
		Customer customer=null;
		try {
			doc.setAddressProof(F1.getBytes());
			doc.setPanCard(F2.getBytes());
			doc.setItr(F3.getBytes());
			doc.setAdharCard(F4.getBytes());
			doc.setPhoto(F5.getBytes());
			doc.setSign(F6.getBytes());
			doc.setBankCheque(F7.getBytes());
			doc.setSalarySlips(F8.getBytes());
			customer = customerservice.findByCid(cid);
			customer.setCAllPersonalDocs(doc);
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(customerservice.saveCustomerDocs(customer));
	}

	@ExceptionHandler(IOException.class)
	public ResponseEntity<String> ioException() {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File not uploaded correctly");
	}
	

	@GetMapping("/getAllDocumentsByCid/{cid}")
	public ResponseEntity<AllPersonalDocs> getAllDocumentsByCid(@PathVariable int cid) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getAllDocumentsByCid(cid));
	}


///////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveCustomer")
	public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customerDto) {
		customerservice.saveCustomer(customerDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(customerDto);
	}
	
	@GetMapping("/getCustomerById/{cid}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int cid) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getCustomerById(cid));
	}

	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getAllCustomer());
	}

	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(customerservice.updateCustomer(customer),HttpStatus.OK);
	}

	@DeleteMapping("deleteCustomer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int cid) {
		return new ResponseEntity<String>(customerservice.deleteCustomer(cid),HttpStatus.OK);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveAccountDetails/{cid}")
	public ResponseEntity<Customer> saveAccountDetails(@RequestBody AccountDetails accountDetails,@PathVariable int cid) {
		
		Customer  customer = customerservice.findByCid(cid);
          customer.setCAccountDetails(accountDetails);
          customerservice.saveCustomeWithAccountDetails(customer);

		return  ResponseEntity.status(HttpStatus.CREATED).body(customer);

	}

	@GetMapping("/getAllAccountDetailsByCid/{cid}")
	public ResponseEntity<AccountDetails> getAllAccountDetailsByCid(@PathVariable int cid) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.getAllAccountDetailsByCid(cid));
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveCustomerAddress/{cid}")
	public ResponseEntity<Customer> saveCustomerAddress(@RequestBody CustomerAddress customerAddress,@PathVariable int cid) {


		Customer  customer = customerservice.findByCid(cid);
          customer.setCAddress(customerAddress);
		return new ResponseEntity<Customer>(customerservice.saveCustomeWithCustomerAddress(customer), HttpStatus.CREATED);

	}

	  @GetMapping("/CustomerAddressByCid/{cid}")
	  public ResponseEntity<CustomerAddress> CustomerAddressByCid(@PathVariable int cid) {
		  return new ResponseEntity<CustomerAddress>(customerservice.CustomerAddressByCid(cid), HttpStatus.OK);
    	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveGuarantorDetailsByCid/{cid}")
	public ResponseEntity<Customer> saveGuarantorDetailsByCid(@RequestBody GuarantorDetails guarantorDetails,@PathVariable int cid) {
		Customer  customer = customerservice.findByCid(cid);
        customer.setCGuarantorDetails(guarantorDetails);
		return new ResponseEntity<Customer>(customerservice.saveGuarantorDetailsByCid(customer), HttpStatus.CREATED);
	}

	@GetMapping("/getGuarantorDetailsByCid/{cid}")
	public ResponseEntity<GuarantorDetails> getGuarantorDetailsByCid(@PathVariable int cid) {
		return new ResponseEntity<GuarantorDetails>(customerservice.getGuarantorDetailsByCid(cid), HttpStatus.OK);

	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/saveLoanDetailsByCid/{cid}")
	public ResponseEntity<Customer> saveLoanDetailsByCid(@RequestBody LoanDetails loanDetails,@PathVariable int cid) {
		
		Customer  customer = customerservice.findByCid(cid);
        customer.setCLoanDetails(loanDetails);
		return new ResponseEntity<Customer>(customerservice.saveLoanDetailsCid(customer), HttpStatus.CREATED);
	}

	@GetMapping("/getLoanDetailsByCid/{cid}")
	public ResponseEntity<LoanDetails> getLoanDetailsByCid(@PathVariable int cid) {
		return new ResponseEntity<LoanDetails>(customerservice.getLoanDetailsByCid(cid), HttpStatus.OK);
	}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@PostMapping("/savePreviousLoanByCid/{cid}")
	public ResponseEntity<Customer> savePreviousLoanByCid(@RequestBody PreviousLoan previousLoan,@PathVariable int cid) {
		
		Customer  customer = customerservice.findByCid(cid);
        customer.setCPreviousLoan(previousLoan);

		return new ResponseEntity<Customer>(customerservice.savePreviousLoanByCid(customer), HttpStatus.CREATED);
	}

	@GetMapping("/getPreviousLoanByCid/{cid}")
	public ResponseEntity<PreviousLoan> getPreviousLoanByCid(@PathVariable int cid) {
		return new ResponseEntity<PreviousLoan>(customerservice.getPreviousLoanByCid(cid), HttpStatus.OK);
	}

////////////////////////

	@PostMapping("/savePreviousLoanBankByCid/{cid}")
	public ResponseEntity<Customer> savePreviousLoanBankByCid(@RequestBody PreviousLoanBank previousLoanBank,@PathVariable int cid) {
		
		Customer  customer = customerservice.findByCid(cid);
        customer.setPbankDetails(previousLoanBank);

		return new ResponseEntity<Customer>(customerservice.savePreviousLoanBankByCid(customer),HttpStatus.CREATED);
				
	}

	@GetMapping("/getPreviousLoanBankByCid/{cid}")
	public ResponseEntity<PreviousLoanBank> getPreviousLoanBankByCid(@PathVariable int cid) {
		
		return new ResponseEntity<PreviousLoanBank>(customerservice.getPreviousLoanBankByCid(cid),
				HttpStatus.OK);
	}

}
