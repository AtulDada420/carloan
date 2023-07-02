package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoanBank {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "previousloanbank_generator")
@SequenceGenerator(name = "previousloanbank_generator", sequenceName = "PREVIOUSLOANSBANK_SEQUENCE",initialValue=101010,allocationSize = 0)
private	 String branchName;
private int	branchCode;
private String BranchType;
private String	IFSCcode;
private String	MICRcode;
private	 int ConatctNO;
private String	BranchAddress;
private	String Email;
private	String status;

}
