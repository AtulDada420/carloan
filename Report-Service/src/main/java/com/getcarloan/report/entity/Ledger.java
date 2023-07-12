package com.getcarloan.report.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
@Entity
public class Ledger {

	@Id
	private int ledgerId;
	private int cid;
	private String ledgerCreatedDate;
	private double totalLoanAmount;
	private double payableAmountwithInterest;
	private int tenure;
	private double monthlyEmi;
	private String amountPaidtillDate;
	private double remainingAmount;
	private String nextEmiStartDate;
	private String nextEmiEnddate;
	private int defaulterCount;
	private String previousEmitStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;
}
