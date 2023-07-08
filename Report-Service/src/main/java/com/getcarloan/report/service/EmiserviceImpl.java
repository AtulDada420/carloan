package com.getcarloan.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.entity.EMI;
import com.getcarloan.report.proxy.Feigncommunication;
import com.getcarloan.report.repository.Emirepo;

@Service
public class EmiserviceImpl implements Emiservice {

	@Autowired
	private Feigncommunication communication;
	
	@Autowired
	private Emirepo erepo;
	
	@Override
	public void CreateEmiDetails(EMI emi) {
		erepo.save(emi);
		
	}

	@Override
	public List<EMI> getEmiDetails() {
		return erepo.findAll();
	}

	@Override
	public EMI getEmiDeatilsByID(int cid) {
		if (erepo.existsById(cid))
			return erepo.findById(cid).get();
			else
			return null;
	}

	@Override
	public Customer getCustomerId(int cid) {
		Customer cust1=communication.getCustomerById(cid);
		return cust1;
	}

}
