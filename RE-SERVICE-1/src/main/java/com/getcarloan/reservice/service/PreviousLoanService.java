package com.getcarloan.reservice.service;


import java.util.List;

import com.getcarloan.reservice.entities.LoanPlans;
import com.getcarloan.reservice.entities.PreviousLoan;

public interface PreviousLoanService {

	String savePreviousLoan(PreviousLoan previousLoan);

	PreviousLoan getPreviousLoanById(int pLoanId);

	List<PreviousLoan> getAllPreviousLoan();

	String updatePreviousLoanById(int pLoanId);

	String deletePreviousLoanById(int pLoanId);



}
