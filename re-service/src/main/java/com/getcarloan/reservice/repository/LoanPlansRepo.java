package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getcarloan.reservice.entities.LoanPlans;

public interface LoanPlansRepo extends JpaRepository<LoanPlans, Integer> {

	boolean existsByuserId(int userId);

}
