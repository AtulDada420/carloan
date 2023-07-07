package com.getcarloan.reservice.entities;


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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_generator")
	@SequenceGenerator(name = "cust_generator", sequenceName = "CUSTOMER_SEQUENCE",initialValue=1000,allocationSize = 0)
	private int cid;
	private int enquireId;
	private String name;
	private String DOB;
	private int age;
	private String gender;
	private String email;
	private long mobileNo;
	private long additionalMobileNo;
	private double downPaymentAmount;
	private double totalLoanRequired;
	

	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocs cAllPersonalDocs;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress cAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails cAccountDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails cLoanDetails;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails cGuarantorDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoan cPreviousLoan;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanBank pbankDetails;

}
