package com.getcarloan.report.entity;

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
@Entity
public class Agreement {
	
	@Id
	private int agreementId ;
	private int cId;
	private String agreementDate ;
	private String agreementEndDate ;
	private String customerName ;
    private  String carModel;
	private String carVIN;
	private double loanAmount;
	private double interestRate;
	private String repaymentPeriod;
	private String agreementSignature;

}
