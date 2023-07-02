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
<<<<<<< HEAD
	private  AccountDetailsRepo accrepo;

	@Override
	public String saveAccountDetails(AccountDetails accountdetails) 
	{
		accrepo.save(accountdetails);
=======
	private AccountDetailsRepo accrepo;

	@Override
	public String saveAccountDetails(AccountDetails accountDetails) {
		accrepo.save(accountDetails);
>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666
		return "Save New AccountDetails";
	}

	@Override
<<<<<<< HEAD
	public AccountDetails getAllAccountDetailsById(int accountId) {
		if(accrepo.existsById(accountId))
			return accrepo.findById(accountId).get();
		else 
=======
	public AccountDetails getAllAccountDetailsByUserId(int userId) {
		if (accrepo.existsgetAllAccountDetailsByUserId(userId))
			return accrepo.findById(userId).get();
		else
>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666
			return null;
	}

	@Override
	public String updateAccountDetails(AccountDetails accountDetails) {
		accrepo.save(accountDetails);
		return "update AccountDetails";
	}

	@Override
<<<<<<< HEAD
	public String deleteAccountDetails(int accountId) {
		accrepo.deleteById(accountId);
=======
	public String deleteAccountDetails(int userId) {
		accrepo.deleteById(userId);
>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666
		return "AccountDetails Deleted";
	}

	@Override
	public List<AccountDetails> getAllAccountDetails() {
<<<<<<< HEAD
	return	accrepo.findAll();
		
	}
	
=======
		return accrepo.findAll();

	}

>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666
}
