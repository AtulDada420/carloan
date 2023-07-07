package com.getcarloan.account.service;

import java.util.List;

import com.getcarloan.account.entity.Customer;
import com.getcarloan.account.entity.LoanDisbursement;
import com.getcarloan.account.entity.SanctionLetter;

public interface LoanDisbursementService {

	String generateLoanDisbursementFile(LoanDisbursement loanDisbursement);

	List<LoanDisbursement> getAllLoanDisbursement();

	LoanDisbursement getLoanDisbursementByCustId(int cid);

	LoanDisbursement getLoanDisbursementByAgrId(int agreementId);

	Customer getCustomerId(int cid);

	List<Customer> getAllCustomerByFeign();

	

}
