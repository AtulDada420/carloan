package com.getcarloan.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.account.entity.LoanDisbursement;

@Repository
public interface LoanDisbursementRepository extends JpaRepository<LoanDisbursement, Integer>{

}
