package com.getcarloan.reservice.service;

import com.getcarloan.reservice.entities.CustomerAddress;

public interface CustomerAddressService {

	String saveCustomerAddress(CustomerAddress customerAdress);

	CustomerAddress CustomerAddressByUserId(int userId);

	String updateCustomerAddress(CustomerAddress customerAddress);

	String deleteCustomer(int userId);




}
