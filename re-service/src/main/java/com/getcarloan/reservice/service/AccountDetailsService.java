package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.AccountDetails;

public interface AccountDetailsService {

	String saveAccountDetails(AccountDetails accountdetails);

	AccountDetails getAllAccountDetailsById(int accountId);

	String updateAccountDetails(AccountDetails accountDetails);

	String deleteAccountDetails(int accountId);

	List<AccountDetails> getAllAccountDetails();



}
