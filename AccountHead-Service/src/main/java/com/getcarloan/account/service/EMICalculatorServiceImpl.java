package com.getcarloan.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.getcarloan.account.entity.EmiCalculator;
import com.getcarloan.account.repository.EMICalculatorRepository;

@Service
public class EMICalculatorServiceImpl implements EMICalculatorService {
	
	@Autowired
	private EMICalculatorRepository erepo;

	@Override
	public ResponseEntity<Double> calculateEMI(double loanAmount, int tenure, double interestRate) {
		// Convert the annual interest rate to monthly interest rate
        double monthlyInterestRate = interestRate / 12 / 100;

        // Calculate EMI using the formula
        double emi = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, tenure)
                / (Math.pow(1 + monthlyInterestRate, tenure) - 1);

        
        EmiCalculator emiCalc = new EmiCalculator();
        emiCalc.setLoanAmount(loanAmount);
        emiCalc.setTenure(tenure);
        emiCalc.setInterestRate(interestRate);
        emiCalc.setEmi(emi);
        
        erepo.save(emiCalc);
        return ResponseEntity.ok(emi);
	}

}
