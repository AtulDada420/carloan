package com.getcarloan.report.service;

import java.util.List;

import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.entity.Ledger;

public interface Ledgerservice {

	void CreateLedger(Ledger ledger);

	List<Ledger> getAllLedger();

	Ledger getCustomerId(int cid);

	List<Customer> getAllCustomersbyfeign();

}
