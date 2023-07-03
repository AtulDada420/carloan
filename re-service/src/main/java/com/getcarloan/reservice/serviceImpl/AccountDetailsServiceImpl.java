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
	public AccountDetails getAllAccountDetailsByUserId(int userId) {
		if (accrepo.existsById(userId))
			return accrepo.findById(userId).get();
		else
			return null;
	}

	@Override
	public String updateAccountDetailsByUserId(int userId) {
		accrepo.save(userId);
		return "AccountDetails updated";
	}

	@Override
	public String deleteAccountDetails(int userId) {
		accrepo.deleteById(userId);
		return "AccountDetails Deleted";
	}

	@Override
	public List<AccountDetails> getAllAccountDetails() {
		return accrepo.findAll();

	}

}
