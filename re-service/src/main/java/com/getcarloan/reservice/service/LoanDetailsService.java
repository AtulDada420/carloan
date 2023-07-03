package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.entities.LoanPlans;

public interface LoanDetailsService {

	String saveLoanDetails(LoanDetails loanDetails);

	List<LoanDetails> getAllLoanDetails();

	String deleteLoanDeatailsByUserId(int userId);

	LoanDetails getLoanDetailsByUserId(int userId);

	String updateLoanDetailsByUserId(int userId);

	

	

}
