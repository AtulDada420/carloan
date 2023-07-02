package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.AccountDetails;

public interface AccountDetailsService {

<<<<<<< HEAD
	String saveAccountDetails(AccountDetails accountdetails);

	AccountDetails getAllAccountDetailsById(int accountId);

	String updateAccountDetails(AccountDetails accountDetails);

	String deleteAccountDetails(int accountId);

	List<AccountDetails> getAllAccountDetails();

=======
	String saveAccountDetails(AccountDetails accountDetails);

	String updateAccountDetails(AccountDetails accountDetails);

	String deleteAccountDetails(int userId);

	List<AccountDetails> getAllAccountDetails();

	AccountDetails getAllAccountDetailsByUserId(int userId);



>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666
}
