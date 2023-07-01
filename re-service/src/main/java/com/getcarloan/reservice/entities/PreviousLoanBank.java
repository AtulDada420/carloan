package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoanBank {
@Id
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
