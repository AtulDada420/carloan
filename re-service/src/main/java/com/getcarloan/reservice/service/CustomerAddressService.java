package com.getcarloan.reservice.service;

import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;

public interface CustomerAddressService {

	String saveCustomerAddress(CustomerAddress customerAdress);
	CustomerAddress CustomerAddressById(int addId);
	String updateCustomerAddressById(int addId);
	String deleteCustomerAddressById(int addId);




}
