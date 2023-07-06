package com.getcarloan.account.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

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
