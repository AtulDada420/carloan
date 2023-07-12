package com.getcarloan.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoanApproval {
	
	
	private int cid;
	private String sanctionDate;
	private String applicantName;
	private String contactDetails;
	private String carName;
	private double loanAmtSanctioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	

}
