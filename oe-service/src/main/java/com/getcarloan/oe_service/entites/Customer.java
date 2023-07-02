package com.getcarloan.oe_service.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

	
	
	private int cid;
	private int eid;
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
//
//	@OneToOne(cascade = CascadeType.ALL)
//	private CustomerAddress cAddress;
//
//	@OneToOne(cascade = CascadeType.ALL)
//	private AccountDetails cAccountDetails;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<GuarantorDetails> cGuarantorDetails;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<PreviousLoan> cPreviousLoan;

}
