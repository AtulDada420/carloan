package com.getcarloan.reservice.service;



import java.util.List;
import com.getcarloan.reservice.entities.Customer;

public interface CustomerService {

	Customer getCustomerById(int cid);

	String saveCustomer(Customer customer);

	List<Customer> getAllCustomer();


	String deleteCustomer(int cid);

	String updateCustomerById(int cid);

	

	
	

}
