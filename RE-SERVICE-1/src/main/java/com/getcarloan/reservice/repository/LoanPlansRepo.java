package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.LoanPlans;
@Repository
public interface LoanPlansRepo extends JpaRepository<LoanPlans, Integer> {


	String save(int planID); 
}
