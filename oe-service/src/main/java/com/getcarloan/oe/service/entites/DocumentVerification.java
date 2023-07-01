package com.getcarloan.oe.service.entites;

import lombok.Data;

@Data
public class DocumentVerification {
	
	
	private int documentId;
	private byte[] pancard;
	private byte[] itr;
	private byte[] adharcard;
	private byte[] photo;
	private byte[] sign;
	private byte[] salaryslips;
	
	
	
	

}
