package com.getcarloan.reservice.service;



import java.util.List;

import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;

public interface CustomerService {

	Customer getCustomerById(int cid);

	Customer saveCustomer(CustomerDTO customerDto);

	List<Customer> getAllCustomer();


	String deleteCustomer(int cid);

	String updateCustomerById(int cid);

	void saveDocument(AllPersonalDocs doc);

	Customer findByEID(int cid);

	Customer SaveCustomerwithDocument(Customer customer);

	void saveAccountDetails(AccountDetails accountDetails);

	Customer SaveCustomerwithAccountDetails(Customer customer);

	Customer getAllAccountDetailsByCustomerId(int cid);

	String updateAccountDetailsByCustomerId(int cid);

	String deleteAccountDetailsByCustomerId(int cid);

	void saveCustomerAddressByCid(CustomerAddress customerAddress);

	Customer SaveCustomerwithCustomerAddress(Customer customer);

	Customer CustomerAddressBycId(int cid);

	String updateCustomerAddressByCid(int cid);

	String deleteCustomerAddressByCid(int cid);

	void saveGuarantorDetailsByCid(GuarantorDetails guarantorDetails);

	Customer SaveCustomerwithGuarantorDetails(Customer customer);

	Customer getGuarantorDetailsByCid(int cid);

	String updateGuarantorDetailsById(int cid);

	String deleteGuarantorDetailsById(int cid);

	   


	

}
