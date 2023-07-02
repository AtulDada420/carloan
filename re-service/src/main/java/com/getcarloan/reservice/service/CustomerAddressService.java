package com.getcarloan.reservice.service;

import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;

public interface CustomerAddressService {

	String saveCustomerAddress(CustomerAddress customerAdress);

	CustomerAddress CustomerAddressByUserId(int userId);

	String updateCustomerAddress(CustomerAddress customerAddress);

	String deleteCustomer(int userId);

	




}
