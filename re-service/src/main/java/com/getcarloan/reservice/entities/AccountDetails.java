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
public class AccountDetails {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountdetails_generator")
@SequenceGenerator(name = "accountdetails_generator", sequenceName = "ACCOUNTDETAILS_SEQUENCE",initialValue=5555,allocationSize = 0)
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
