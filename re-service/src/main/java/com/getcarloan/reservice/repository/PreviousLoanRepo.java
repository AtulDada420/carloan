package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.PreviousLoan;


@Repository
public interface PreviousLoanRepo extends JpaRepository<PreviousLoan, Integer> {

	String save(int pLoanId);

}
