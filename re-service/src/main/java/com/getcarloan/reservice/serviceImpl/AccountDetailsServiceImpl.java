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
	private AccountDetailsRepo accrepo;

	@Override
	public String saveAccountDetails(AccountDetails accountDetails) {
		accrepo.save(accountDetails);
		return "Save New AccountDetails";
	}
	@Override
	public List<AccountDetails> getAllAccountDetails() {
		return accrepo.findAll();

	}

	@Override
	public AccountDetails getAllAccountDetailsById(int accountId) {
		if (accrepo.existsById(accountId))
			return accrepo.findById(accountId).get();
		else
			return null;
	}

	@Override
	public String deleteAccountDetailsById(int accountId) {
		accrepo.deleteById(accountId);
		return "AccountDetails Deleted";
	}

	@Override
	public String updateAccountDetailsById(int accountId) {
		accrepo.save(accountId);
		return "AccountDetails updated";
	}

}
