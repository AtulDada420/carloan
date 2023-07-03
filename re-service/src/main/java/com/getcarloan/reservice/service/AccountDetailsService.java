package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.AccountDetails;

public interface AccountDetailsService {

	String saveAccountDetails(AccountDetails accountDetails);

	List<AccountDetails> getAllAccountDetails();

	AccountDetails getAllAccountDetailsById(int accountId);

	String deleteAccountDetailsById(int accountId);

	String updateAccountDetailsById(int accountId);



}
