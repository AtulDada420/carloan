package com.getcarloan.reservice.service;

import java.util.List;


import com.getcarloan.reservice.entities.EnquiryDetails;

public interface EnquiryService {

	EnquiryDetails getEnquiryByUserId(int userId);

	List<EnquiryDetails>  getAllEnquiry();

	String createEnquiry(EnquiryDetails enquiryDetails);



	

}
