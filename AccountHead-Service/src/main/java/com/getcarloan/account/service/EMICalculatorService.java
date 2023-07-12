package com.getcarloan.account.service;

import org.springframework.http.ResponseEntity;

import com.getcarloan.account.entity.EmiCalculator;

public interface EMICalculatorService {

	ResponseEntity<Double> calculateEMI(double loanAmount, int tenure, double interestRate);

	

}
