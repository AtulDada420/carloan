package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.AccountDetails;

@Repository
public interface AccountDetailsRepo extends JpaRepository<AccountDetails, Integer> {

	boolean existsgetAllAccountDetailsByUserId(int userId);

}
