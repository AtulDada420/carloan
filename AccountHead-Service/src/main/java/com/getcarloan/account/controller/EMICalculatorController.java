package com.getcarloan.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.getcarloan.account.service.EMICalculatorService;

@RestController
@RequestMapping("/ah-api/EMICalculator")

public class EMICalculatorController {
	
	@Autowired
	private EMICalculatorService eService;
	
	
	@GetMapping("/calculateEMI")
    public ResponseEntity<Double> calculateEMI(@RequestParam double loanAmount,
                                               @RequestParam int tenure,
                                               @RequestParam double interestRate) {
        // Invoke the EMI calculator service
        return eService.calculateEMI(loanAmount, tenure, interestRate);
    }

}
