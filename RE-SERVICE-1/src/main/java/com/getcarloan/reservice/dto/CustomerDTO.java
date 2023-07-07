package com.getcarloan.reservice.dto;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.entities.PreviousLoan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

	
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
	
//	private AllPersonalDocs cAllPersonalDocs;
//	private CustomerAddress cAddress;
//	private AccountDetails cAccountDetails;
//	private LoanDetails cLoanDetails;
//	private EMIDetails cEmiDetails;
//	private GuarantorDetails cGuarantorDetails;
//	private PreviousLoan cPreviousLoan;

}
