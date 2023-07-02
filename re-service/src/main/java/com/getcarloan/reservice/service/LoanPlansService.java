package com.getcarloan.reservice.service;

import com.getcarloan.reservice.entities.LoanPlans;

public interface LoanPlansService {

	String saveLoanPlans(LoanPlans loanPlans);

	LoanPlans getAllLoanPlansByUserId(int userId);

}
