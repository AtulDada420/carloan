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
	public Customer getCustomerById(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get();
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
	public String deleteCustomer(int cid) {
		crepo.deleteById(cid);
		return "Customer Deleted By ID";
	}

	@Override
	public String updateCustomerById(int cid) {
		crepo.save(cid);
		return "Upadate Customer";
	}
}
