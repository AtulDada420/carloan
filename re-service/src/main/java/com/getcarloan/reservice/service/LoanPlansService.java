package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.LoanPlans;

public interface LoanPlansService {

	String saveLoanPlans(LoanPlans loanPlans);

	LoanPlans getLoanPlansByUserId(int userId);

	String updateLoanPlansByUserId(int userId);

	String deleteLoanPlansByUserId(int userId);

	List<LoanPlans> getAllLoanPlans();

}
