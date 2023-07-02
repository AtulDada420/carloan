package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.AccountDetails;

public interface AccountDetailsService {

	String saveAccountDetails(AccountDetails accountDetails);

	String updateAccountDetails(AccountDetails accountDetails);

	String deleteAccountDetails(int userId);

	List<AccountDetails> getAllAccountDetails();

	AccountDetails getAllAccountDetailsByUserId(int userId);



}
