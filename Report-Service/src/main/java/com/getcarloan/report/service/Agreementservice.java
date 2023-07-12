package com.getcarloan.report.service;

import java.util.List;

import com.getcarloan.report.entity.Agreement;
import com.getcarloan.report.entity.Customer;

public interface Agreementservice {

	void Agreementcreate(Agreement agremment);

	List<Agreement> getAllAgreement();

	Agreement getAgreementBycid(int cid);

	Customer getCustomerByCust(int cid);

	Agreement updateAgreement(Agreement agreement);

}
