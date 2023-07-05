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
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "loan_generator")
	@SequenceGenerator(name = "loan_generator", sequenceName = "LOAN_SEQUENCE",initialValue=99999,allocationSize = 0)
	private int loanId;
	private int loanNo;
	@OneToOne(cascade = CascadeType.ALL)
	private EMIDetails emidetails;
	private double loanAmount;
	private int rateOfInterest;
	private int tenure;
	private double totalAmounttobepaid;
	private int processingFees;
}
