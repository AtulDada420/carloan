package com.getcarloan.account.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SanctionLetter {
	@Id
	private int sid;
	private int cId;
	private String sanctionDate;
	private String applicantName;
	private long contactNo;
	private String product;
	private double loanAmtSanctioned;
	private String interestType;
	private double rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsandCondition;
	private String status;
    private String email;
	

}
