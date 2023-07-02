package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getcarloan.reservice.entities.AccountDetails;

public interface AccountDetailsRepo  extends JpaRepository<AccountDetails, Integer>
{

	//boolean existsgetAllAccountDetailsById(int accountId);

	

	
	

}
