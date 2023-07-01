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
public class AccountDetails {
@Id
private int	accountId;
private String	accounType;
private	double accountBalance;
private String	accountHolderName;
private	String accountStatus;
private	long accountNO;
private	int branchPincode;
private	 String IFSCcode; 
private	 String MICRcode;

}
