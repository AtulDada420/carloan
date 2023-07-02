package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.repository.CustomerRepo;
import com.getcarloan.reservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo crepo;

	@Override
	public Customer getCustomerByUserId(int userId) {
		if (crepo.existsById(userId))
			return crepo.findById(userId).get();
		else
			return new Customer();
	}

	@Override
	public String saveCustomer(Customer customer) {
		crepo.save(customer);
		return "Save New Customer";
	}

	@Override
	public List<Customer> getAllCustomer() {
		return crepo.findAll();
	}

	@Override
	public String updateCustomer(Customer customer) {
		crepo.save(customer);
		return "Upadate Customer";

	}

	@Override
	public String deleteCustomer(int userId) {
		crepo.deleteById(userId);
		return "Customer Deleted By ID";
	}
}
