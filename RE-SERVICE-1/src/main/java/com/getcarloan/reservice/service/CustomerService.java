package com.getcarloan.reservice.service;



import java.util.List;

import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.Customer;

public interface CustomerService {

	Customer getCustomerById(int cid);

	String saveCustomer(CustomerDTO customer);

	List<Customer> getAllCustomer();

	String deleteCustomer(int cid);

	Customer findByCid(int cid);

	Customer updateCustomer(Customer customer);

	Customer saveCustomerDocs(Customer customer);
	
	

}
