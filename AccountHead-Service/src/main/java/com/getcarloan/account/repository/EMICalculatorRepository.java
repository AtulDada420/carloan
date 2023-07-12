package com.getcarloan.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.account.entity.EmiCalculator;

@Repository
public interface EMICalculatorRepository extends JpaRepository<EmiCalculator, Integer> {

}
