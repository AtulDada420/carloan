package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.exceptionHandler.ResourceNotFoundException;
import com.getcarloan.reservice.repository.CustomerRepo;
import com.getcarloan.reservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo crepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public Customer getCustomerById(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get();
		else
			return new Customer();
	}

	@Override
	public String saveCustomer(CustomerDTO customer) {
		Customer cust = mapper.map(customer, Customer.class);
		crepo.save(cust);
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
	public Customer findByCid(int cid) {
		return crepo.findById(cid).orElseThrow(() -> new ResourceNotFoundException("No Customer with this ID"));
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public Customer saveCustomerDocs(Customer customer) {
		return crepo.save(customer);
	}

}
