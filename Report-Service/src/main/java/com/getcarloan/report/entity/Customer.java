package com.getcarloan.report.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	private int cid;
	private String name;
	private String DOB;
	private int age;
	private String gender;
	private String email;
	private long mobileNo;
	private long additionalMobileNo;
	private double downPaymentAmount;
	private double totalLoanRequired;
}
