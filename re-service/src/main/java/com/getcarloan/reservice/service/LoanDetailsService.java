package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.LoanDetails;

public interface LoanDetailsService {

	String saveLoanDetails(LoanDetails loanDetails);

	LoanDetails getAllLoanDetailsByUserId(int userId);

	List<LoanDetails> getAllLoanDetails();

	String updateLoanDetails(LoanDetails loanDetails);

	String deleteLoanDeatailsByUserId(int userId);

}
