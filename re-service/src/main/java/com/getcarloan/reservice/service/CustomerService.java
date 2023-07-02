package com.getcarloan.reservice.service;



import java.util.List;
<<<<<<< HEAD

import com.getcarloan.reservice.entities.AccountDetails;
=======
>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666
import com.getcarloan.reservice.entities.Customer;

public interface CustomerService {

	Customer getCustomerByUserId(int userId);

	String saveCustomer(Customer customer);

	List<Customer> getAllCustomer();

	String updateCustomer(Customer customer);

	String deleteCustomer(int userId);

	
	

	
	

}
