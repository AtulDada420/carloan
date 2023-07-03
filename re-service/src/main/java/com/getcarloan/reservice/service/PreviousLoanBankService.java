package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.PreviousLoanBank;

public interface PreviousLoanBankService {

	String savePreviousLoanBank(PreviousLoanBank previousLoanBank);

	PreviousLoanBank getPreviousLoanBankById(int branchCode);

	List<PreviousLoanBank> getAllPreviousLoanBank();

	String updatePreviousLoanbankById(int branchCode);

	String deletePreviousLoanBankById(int branchCode);

	

}
