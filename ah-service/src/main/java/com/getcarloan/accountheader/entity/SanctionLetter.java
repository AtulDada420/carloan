package com.getcarloan.accountheader.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
	public class SanctionLetter {

	    @Id
		private int sid;
		private int cId;
		private String sanctionDate;
		//private int prospectNo;
		//private String applicantName;
		
		//private double loanAmtSanctioned;
		//private double interestType;
		
		//private double rateOfInterest;
		//private int loanTenure;
		//private double monthlyEmiAmount;
		private String modeOfPayment;
		private String remarks;
		private String termsandCondition;
		
		//oneToone
		//private String status;
		//oneToone
		//private Customer customer ;
		//oneToone
		//private LoanDetails loandetails;
		
		//private EMI emi;
		
		//private Loneplan loanplan;
		
}


