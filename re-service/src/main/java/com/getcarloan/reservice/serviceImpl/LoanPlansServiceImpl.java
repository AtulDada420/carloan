package com.getcarloan.reservice.serviceImpl;

import java.util.List;

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
<<<<<<< HEAD
	public LoanPlans getAllLoanPlansByUserId(int userId) {
		if(loanplanrepo.existsById(userId)) {
=======
	public LoanPlans getLoanPlansByUserId(int userId) {
		if(loanplanrepo.existsByuserId(userId)) {
>>>>>>> 3d8b7c183aa0c85c3e3db9ce9534c8536e4dbb8b
			return loanplanrepo.findById(userId).get();
		}else
			return null;
		
	}

	@Override
	public String updateLoanPlansByUserId(int userId) {
		loanplanrepo.save(userId);
		return "Update Loan Plans";
	}

	@Override
	public String deleteLoanPlansByUserId(int userId) {
		loanplanrepo.deleteById(userId);
		return "Delete LoanPlans";
	}

	@Override
	public List<LoanPlans> getAllLoanPlans() {
		return loanplanrepo.findAll();
	}

	
	
	

}
