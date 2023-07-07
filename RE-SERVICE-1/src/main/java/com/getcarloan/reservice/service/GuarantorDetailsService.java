package com.getcarloan.reservice.service;

import java.util.List;




import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;

public interface GuarantorDetailsService {

	String saveGuarantorDetails(GuarantorDetails guarantorDetails);

	String deleteGuarantorDetailsById(int gid);

	List<GuarantorDetails> getAllGuarantorDetails();
	GuarantorDetails getGuarantorDetailsById(int gid);

	String updateGuarantorDetailsById(int gid);


	




	


}
