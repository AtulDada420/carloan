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
	 public LoanPlans getLoanPlansById(int planID) {
	  if(loanplanrepo.existsById(planID)) {
	   return loanplanrepo.findById(planID).get();
	  }else
	   return null;
	  
	 }


	 @Override
	 public String updateLoanPlansById(int planID) {
	  loanplanrepo.save(planID);
	  return "Update Loan Plans";
	 
	 }

	 @Override
	 public String deleteLoanPlansById(int planID) {
	  loanplanrepo.deleteById(planID);
	  return "Delete LoanPlans";
	 }
	 @Override
	 public List<LoanPlans> getAllLoanPlans() {
	  return loanplanrepo.findAll();
	 }






	 
	

}
