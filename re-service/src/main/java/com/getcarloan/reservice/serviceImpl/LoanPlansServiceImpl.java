package com.getcarloan.reservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.LoanPlans;
import com.getcarloan.reservice.repository.LoanPlansRepo;
import com.getcarloan.reservice.service.LoanPlansService;
@Service
public class LoanPlansServiceImpl implements LoanPlansService {

	@Autowired
	private LoanPlansRepo loanplanrepo;

	@Override
	public String saveLoanPlans(LoanPlans loanPlans) {
		loanplanrepo.save(loanPlans);
		return "Save Loan Plans";
	}

	@Override
	public LoanPlans getAllLoanPlansByUserId(int userId) {
		if(loanplanrepo.existsById(userId)) {
			return loanplanrepo.findById(userId).get();
		}else
			return null;
		
	}
	
	
	

}
