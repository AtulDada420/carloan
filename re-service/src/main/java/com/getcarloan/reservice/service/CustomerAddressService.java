package com.getcarloan.reservice.service;

import com.getcarloan.reservice.entities.CustomerAddress;

public interface CustomerAddressService {

	String saveCustomerAddress(CustomerAddress customerAdress);

	CustomerAddress CustomerAddressById(int addId);

	String updateCustomerAddress(CustomerAddress customerAddress);

	String deleteCustomer(int addId);


}
