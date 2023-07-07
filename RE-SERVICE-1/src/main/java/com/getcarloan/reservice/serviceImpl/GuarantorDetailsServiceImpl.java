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
	public String deleteGuarantorDetailsById(int gid) {
		grepo.deleteById(gid);
		return "Delete Guarantor Details";
	}

	@Override
	public List<GuarantorDetails> getAllGuarantorDetails() {
		return grepo.findAll();

	}

	@Override
	public GuarantorDetails getGuarantorDetailsById(int gid) {
		if (grepo.existsById(gid)) {

			return grepo.findById(gid).get();
		} else
			return new GuarantorDetails();
	}


	@Override
	public String updateGuarantorDetailsById(int gid) {
		grepo.save(gid);
		return "Update guarantor";
	}
}