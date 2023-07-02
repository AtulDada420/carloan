package com.getcarloan.reservice.service;

import java.util.List;




import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;

public interface GuarantorDetailsService {

	String saveGuarantorDetails(GuarantorDetails guarantorDetails);

	GuarantorDetails getAllGuarantorDetailsByUserId(int userId);

	String updateGuarantorDetails(GuarantorDetails guarantorDetails);

	String deleteGuarantorDetailsByUserId(int userId);

	List<GuarantorDetails> getAllGuarantorDetails();



	


}
