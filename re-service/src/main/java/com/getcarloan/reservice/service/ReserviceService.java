package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.EnquiryDetails;

import com.getcarloan.reservice.entities.User;


public interface ReserviceService {

	EnquiryDetails getEnquiryByUserId(int userId);

	List<EnquiryDetails>  getAllEnquiry();


	String createEnquiry(EnquiryDetails enquiryDetails);

	Customer getCustomerById(int cId);

	

}
