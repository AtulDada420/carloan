package com.getcarloan.reservice.service;

import java.util.List;




import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;

public interface GuarantorDetailsService {

	String saveGuarantorDetails(GuarantorDetails guarantorDetails);


	GuarantorDetails getGuarantorDetailsByUserId(int userId);

	String deleteGuarantorDetailsByUserId(int userId);

	List<GuarantorDetails> getAllGuarantorDetails();

	String updateGuarantorDetailsByUserId(int userId);


	




	


}
