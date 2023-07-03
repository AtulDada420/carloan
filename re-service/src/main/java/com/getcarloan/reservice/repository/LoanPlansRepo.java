package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.LoanPlans;
@Repository
public interface LoanPlansRepo extends JpaRepository<LoanPlans, Integer> {

	boolean existsByuserId(int userId);

	String save(int userId);


}
