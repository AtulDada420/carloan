package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

import com.getcarloan.reservice.entities.AccountDetails;

public interface AccountDetailsRepo  extends JpaRepository<AccountDetails, Integer>
{

	//boolean existsgetAllAccountDetailsById(int accountId);

	

	
	
=======
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.AccountDetails;

@Repository
public interface AccountDetailsRepo extends JpaRepository<AccountDetails, Integer> {

	boolean existsgetAllAccountDetailsByUserId(int userId);
>>>>>>> 24294482e9755fe4ce7e1226f48e864a66cc5666

}
