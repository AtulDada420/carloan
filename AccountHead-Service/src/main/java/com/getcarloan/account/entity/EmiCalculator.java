package com.getcarloan.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmiCalculator {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiId;
	private double loanAmount;
    private int tenure;
    private double interestRate;
    private double emi;
    

}
