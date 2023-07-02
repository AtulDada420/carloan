package com.getcarloan.reservice.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.repository.CustomerRepo;
import com.getcarloan.reservice.repository.GuarantorDetailsRepo;
import com.getcarloan.reservice.service.GuarantorDetailsService;

public class GuarantorDetailsServiceImpl implements GuarantorDetailsService{

	@Autowired
	private GuarantorDetailsRepo grepo;

	@Override
	public String saveGuarantorDetails(GuarantorDetails guarantorDetails) {
		grepo.save(guarantorDetails);
		return "Guarantor Details saved";
	}

	@Override
	public GuarantorDetails getAllGuarantorDetailsByUserId(int userId) {
	if(grepo.existsById(userId)) {
		return grepo.findById(userId).get();
	} else 
		return new GuarantorDetails();
	
	}
	
	
	
	
}
