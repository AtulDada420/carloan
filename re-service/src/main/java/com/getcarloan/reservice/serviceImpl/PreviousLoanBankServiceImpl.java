package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.PreviousLoan;
import com.getcarloan.reservice.entities.PreviousLoanBank;
import com.getcarloan.reservice.repository.PreviousLoanBankRepo;
import com.getcarloan.reservice.service.PreviousLoanBankService;

@Service
public class PreviousLoanBankServiceImpl implements PreviousLoanBankService {

	@Autowired
	private PreviousLoanBankRepo preloanbankrepo;

	@Override
	public String savePreviousLoanBank(PreviousLoanBank previousLoanBank) {
		preloanbankrepo.save(previousLoanBank);
		return "Save Previous Loan Bank";
	}

	@Override
	public PreviousLoanBank getPreviousLoanBankById(int branchCode) {
		if (preloanbankrepo.existsById(branchCode)) {
			return preloanbankrepo.findById(branchCode).get();
		} else
			return null;

	}

	@Override
	public List<PreviousLoanBank> getAllPreviousLoanBank() {
		return preloanbankrepo.findAll();
	}

	@Override
	public String updatePreviousLoanbankById(int branchCode) {
		preloanbankrepo.save(branchCode);
		return "Update Previous Loan Bank";

	}

	@Override
	public String deletePreviousLoanBankById(int branchCode) {
		preloanbankrepo.deleteById(branchCode);
		return "Delete Previous Loan Bank";
	}

}