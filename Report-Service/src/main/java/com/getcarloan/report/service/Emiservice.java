package com.getcarloan.report.service;

import java.util.List;

import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.entity.EMI;

public interface Emiservice {

	void CreateEmiDetails(EMI emi);

	List<EMI> getEmiDetails();

	EMI getEmiDeatilsByID(int cid);

	Customer getCustomerId(int cid);

	EMI updateEmiDetailsByEid(EMI emi);

}
