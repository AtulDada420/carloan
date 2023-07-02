package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuarantorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private int gid;						
	 private String gName; 						
	 private String gDateOfBirth;					
	 private String gRelationshipWithCustomer;			
	 private long gMobNo;						
	 private int gAdharCardNo;												
	 private String gLocalAddress;					
	 private String gPermanentAddress;				


}
