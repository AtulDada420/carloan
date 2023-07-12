package com.getcarloan.account.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LoanDisbursement {
	@Id
	private int cid;
	private int agreementId;
	private String applicantName;
	private String email;
	private int loanNo;
	private String agreementDate;
	private String amountPayType;
	private double totalAmount;
	private String bankName;
	private long accountNumber;
	private String IFSCCode;
	private String accountType;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;
	
	
}
