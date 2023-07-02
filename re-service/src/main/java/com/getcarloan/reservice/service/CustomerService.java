package com.getcarloan.reservice.service;



import java.util.List;
import com.getcarloan.reservice.entities.Customer;

public interface CustomerService {

	Customer getCustomerByUserId(int userId);

	String saveCustomer(Customer customer);

	List<Customer> getAllCustomer();

	String updateCustomer(Customer customer);

	String deleteCustomer(int userId);

	
	

}
