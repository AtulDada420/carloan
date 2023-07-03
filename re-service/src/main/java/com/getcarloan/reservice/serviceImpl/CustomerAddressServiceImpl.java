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
	public CustomerAddress CustomerAddressById(int addId) {
		if (caddrepo.existsById(addId))
			return caddrepo.findById(addId).get();
		else
			return new CustomerAddress();
	}

	@Override
	public String updateCustomerAddressById(int addId) {
		caddrepo.save(addId);
		return "Update customer Address";
		}


	@Override
	public String deleteCustomerAddressById(int addId) {
		caddrepo.deleteById(addId);
		return "Delete Customer Address ";
	}
	


	

}
