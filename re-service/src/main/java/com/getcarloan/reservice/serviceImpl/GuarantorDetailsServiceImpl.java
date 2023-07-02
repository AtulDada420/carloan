package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.repository.GuarantorDetailsRepo;
import com.getcarloan.reservice.service.GuarantorDetailsService;

@Service
public class GuarantorDetailsServiceImpl implements GuarantorDetailsService {

	@Autowired
	private GuarantorDetailsRepo grepo;

	@Override
	public String saveGuarantorDetails(GuarantorDetails guarantorDetails) {
		grepo.save(guarantorDetails);
		return "Guarantor Details saved";
	}

	@Override
	public GuarantorDetails getAllGuarantorDetailsByUserId(int userId) {
		if (grepo.existsById(userId)) {
			return grepo.findById(userId).get();
		} else
			return new GuarantorDetails();

	}

	@Override
	public String updateGuarantorDetails(GuarantorDetails guarantorDetails) {
		grepo.save(guarantorDetails);
		return "Update Guarantor Details";
	}

	@Override
	public String deleteGuarantorDetailsByUserId(int userId) {
		grepo.deleteById(userId);
		return "Delete Guarantor Details";
	}

	@Override
	public List<GuarantorDetails> getAllGuarantorDetails() {
		return grepo.findAll();

	}

}
