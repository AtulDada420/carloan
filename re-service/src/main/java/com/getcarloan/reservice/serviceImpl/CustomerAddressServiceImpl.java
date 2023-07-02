package com.getcarloan.reservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.repository.CustomerAddressRepo;
import com.getcarloan.reservice.service.CustomerAddressService;


public class CustomerAddressServiceImpl implements CustomerAddressService{

	@Autowired
	private CustomerAddressRepo caddrepo;

	@Override
	public String saveCustomerAddress(CustomerAddress customerAddress) {
		 caddrepo.save(customerAddress);
		 return "Save CustomerAddress";
	}

	@Override
	public CustomerAddress CustomerAddressByUserId(int userId) {
		if(caddrepo.existsCustomerAddressByUserId(userId)) 
			return caddrepo.findById(userId).get();
			else return new CustomerAddress();
	}
@Override
	public String updateCustomerAddress(CustomerAddress customerAddress) {
		caddrepo.save(customerAddress);
		return "Upadate CustomerAddress";
	}

@Override
public String deleteCustomer(int userId) {
	caddrepo.deleteById(userId);
	return "Customer Deleted By ID";
}

	
	

	





}
