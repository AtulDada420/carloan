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
public class PreviousLoan
{
@Id	
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "previousloan_generator")
@SequenceGenerator(name = "previousloan_generator", sequenceName = "PREVIOUSLOANS_SEQUENCE",initialValue=99999,allocationSize = 0)
private int pLoanId;
private double ploanAmount;
private int pTenure;
private double paidAmount;
private double remainingAmount;
private int deafulterCount;

@OneToOne(cascade = CascadeType.ALL)
private PreviousLoanBank pbankDetails;
private String status;
private String remark;

}
