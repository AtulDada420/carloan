package com.getcarloan.oe_service.entites;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

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

}