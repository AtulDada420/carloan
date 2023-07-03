package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.LoanPlans;

public interface LoanPlansService {

	 String saveLoanPlans(LoanPlans loanPlans);

	 List<LoanPlans> getAllLoanPlans();

	 LoanPlans getLoanPlansById(int planID);


	 String updateLoanPlansById(int planID);

	 String deleteLoanPlansById(int planID);

}
