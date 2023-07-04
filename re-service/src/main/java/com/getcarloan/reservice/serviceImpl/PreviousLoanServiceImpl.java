package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.PreviousLoan;
import com.getcarloan.reservice.repository.PreviousLoanRepo;
import com.getcarloan.reservice.service.PreviousLoanService;

@Service
public class PreviousLoanServiceImpl implements PreviousLoanService {
    
	@Autowired
	private PreviousLoanRepo preloanrepo;
	
	@Override
	public String savePreviousLoan(PreviousLoan previousLoan) {
		preloanrepo.save(previousLoan);
		return "Save Previous Loan";
	}

	@Override
	public PreviousLoan getPreviousLoanById(int pLoanId) {
		 if(preloanrepo.existsById(pLoanId)) {
			   return preloanrepo.findById(pLoanId).get();
			  }else
			   return null;
			  
			 }

	@Override
	public List<PreviousLoan> getAllPreviousLoan() {
		 return preloanrepo.findAll();
	}

	@Override
	public String updatePreviousLoanById(int pLoanId) {
		 preloanrepo.save(pLoanId);
		  return "Update Previous Loan";
		 
	}

	@Override
	public String deletePreviousLoanById(int pLoanId) {
		 preloanrepo.deleteById(pLoanId);
		  return "Delete Previous Loan";
	}

	
	

}
