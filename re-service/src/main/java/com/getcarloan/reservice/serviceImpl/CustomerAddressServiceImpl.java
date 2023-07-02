package com.getcarloan.reservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.repository.CustomerAddressRepo;
import com.getcarloan.reservice.service.CustomerAddressService;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {

	@Autowired
	private CustomerAddressRepo caddrepo;

	@Override
	public String saveCustomerAddress(CustomerAddress customerAddress) {
		caddrepo.save(customerAddress);
		return "Save CustomerAddress";
	}

	@Override
	public CustomerAddress CustomerAddressByUserId(int userId) {
		if (caddrepo.existsCustomerAddressByUserId(userId))
			return caddrepo.findById(userId).get();
		else
			return new CustomerAddress();
	}

	@Override
	public String updateCustomerAddressByUserId(int userId) {
		caddrepo.save(userId);
		return "Update customer Address";
	}

	@Override
	public String deleteCustomerAddressByUserId(int userId) {
		caddrepo.deleteById(userId);
	return "Delete Customer Address ";
	}

	


	

}
