package com.getcarloan.reservice.service;

import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.GuarantorDetails;

public interface GuarantorDetailsService {

	String saveGuarantorDetails(GuarantorDetails guarantorDetails);

	GuarantorDetails getAllGuarantorDetailsByUserId(int userId);



}
