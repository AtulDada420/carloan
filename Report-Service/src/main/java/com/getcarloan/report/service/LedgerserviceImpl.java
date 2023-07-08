package com.getcarloan.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.entity.Ledger;
import com.getcarloan.report.proxy.Feigncommunication;
import com.getcarloan.report.repository.Ledgerrepo;

@Service
public class LedgerserviceImpl implements Ledgerservice{

	@Autowired
	private Ledgerrepo lrepo;
	
	@Autowired
	private Feigncommunication communication;

	
	

	@Override
	public List<Ledger> getAllLedger() {
		return lrepo.findAll();
	}

	

	@Override
	public Ledger getCustomerId(int cid) {
		if(lrepo.existsById(cid))
			 return lrepo.findById(cid).get();
			else return null;
	}

	@Override
	public List<Customer> getAllCustomersbyfeign() {
		List<Customer> allCustomer = communication.getAllCustomer();
		return allCustomer;
	}



	@Override
	public void CreateLedger(Ledger ledger) {
		lrepo.save(ledger);
		
	}

}
