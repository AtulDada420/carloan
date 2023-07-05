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


	public List<LoanDetails> getAllLoanDetails() {
		return	loanrepo.findAll();
	}

	@Override
	public LoanDetails getLoanDetailsById(int loanId) {
			if(loanrepo.existsById(loanId)) {
				return loanrepo.findById(loanId).get();
				}
				else
					return new LoanDetails();
		}

	@Override
	public String updateLoanDetailsById(int loanId) {
		loanrepo.save(loanId);
		return "Update loan Details";
	}

	@Override
	public String deleteLoanDetailsById(int loanId) {
		loanrepo.deleteById(loanId);
		return "Delete Loan Details";
	}
	
}
	