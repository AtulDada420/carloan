package com.getcarloan.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.report.entity.Agreement;
import com.getcarloan.report.entity.Customer;
import com.getcarloan.report.proxy.Feigncommunication;
import com.getcarloan.report.repository.Agreementrepo;

@Service
public class AgreemnetserviceImpl implements Agreementservice{

	@Autowired
	private Agreementrepo arepo;
	
	@Autowired
	private Feigncommunication com;

	
	@Override
	public void Agreementcreate(Agreement agremment) {
		arepo.save(agremment);
		
	}

	@Override
	public List<Agreement> getAllAgreement() {
		return arepo.findAll();
	}

	@Override
	public Agreement getAgreementBycid(int cid) {
		if(arepo.existsById(cid))
			return arepo.findById(cid).get();
			else
			return null;
	}

	@Override
	public Customer getCustomerByCust(int cid) {
		Customer id = com.getCustomerById(cid);
		return id;
	}

	@Override
	public Agreement updateAgreement(Agreement agreement) {
		return arepo.save(agreement);
	}

}
