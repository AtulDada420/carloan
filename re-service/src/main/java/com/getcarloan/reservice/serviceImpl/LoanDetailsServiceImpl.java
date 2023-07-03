package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.repository.LoanDetailsRepo;
import com.getcarloan.reservice.service.LoanDetailsService;

@Service
public class LoanDetailsServiceImpl implements LoanDetailsService{

	@Autowired
	private LoanDetailsRepo loanrepo;

	@Override
	public String saveLoanDetails(LoanDetails loanDetails) {
		loanrepo.save(loanDetails);
		return "Save Loan Details";
	}

	@Override
<<<<<<< HEAD
	public LoanDetails getAllLoanDetailsByUserId(int userId) {
	if(loanrepo.existsById(userId)) {
	return loanrepo.findById(userId).get();
	}
	else
		return new LoanDetails();
	}

	@Override
=======
>>>>>>> 3d8b7c183aa0c85c3e3db9ce9534c8536e4dbb8b
	public List<LoanDetails> getAllLoanDetails() {
		return	loanrepo.findAll();
	}

	@Override
	public String deleteLoanDeatailsByUserId(int userId) {
		loanrepo.deleteById(userId);
		return "Delete Loan Details";
	}

	@Override
	public LoanDetails getLoanDetailsByUserId(int userId) {
		if(loanrepo.existsByUserId(userId)) {
			return loanrepo.findById(userId).get();
			}
			else
				return new LoanDetails();
	}

	@Override
	public String updateLoanDetailsByUserId(int userId) {
		loanrepo.save(userId);
		return "Update loan Details";
	}
}
	