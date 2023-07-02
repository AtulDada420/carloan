package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.repository.AccountDetailsRepo;
import com.getcarloan.reservice.service.AccountDetailsService;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService {

	@Autowired
	private  AccountDetailsRepo accrepo;

	@Override
	public String saveAccountDetails(AccountDetails accountdetails) 
	{
		accrepo.save(accountdetails);
		return "Save New AccountDetails";
	}

	@Override
	public AccountDetails getAllAccountDetailsById(int accountId) {
		if(accrepo.existsById(accountId))
			return accrepo.findById(accountId).get();
		else 
			return null;
	}

	@Override
	public String updateAccountDetails(AccountDetails accountDetails) {
		accrepo.save(accountDetails);
		return "update AccountDetails";
	}

	@Override
	public String deleteAccountDetails(int accountId) {
		accrepo.deleteById(accountId);
		return "AccountDetails Deleted";
	}

	@Override
	public List<AccountDetails> getAllAccountDetails() {
	return	accrepo.findAll();
		
	}
	
}
