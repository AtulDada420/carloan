package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.PreviousLoanBank;


@Repository
public interface PreviousLoanBankRepo extends JpaRepository<PreviousLoanBank, Integer>{

	String save(int branchCode);

}
