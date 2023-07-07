package com.getcarloan.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.account.entity.Customer;
import com.getcarloan.account.entity.SanctionLetter;
import com.getcarloan.account.proxy.Feigncommunication;
import com.getcarloan.account.repository.SanctionRepository;

@Service
public class SanctionServiceImpl implements SanctionService{

	@Autowired
	private SanctionRepository repo;
	
	@Autowired
	private Feigncommunication communication;
	
	@Override
	public String saveSanctionLetter(SanctionLetter sanctionLetter) {
		repo.save(sanctionLetter);
		return "Sanction Letter Generated...!!!";
	}

	@Override
	public List<SanctionLetter> viewSanctionLetter() {
		
		return repo.findAll();
	}

	@Override
	public SanctionLetter viewSanctionLetterByID(int cid) {
		
		if (repo.existsById(cid))
		
		return repo.findById(cid).get();
		else
			return null;
	}

	@Override
	public Customer getCustomerId(int cid) {
		Customer cust=communication.getCustomerById(cid);
		
		
		return cust;
			
			
	}

	@Override
	public List<Customer> getAllCustomerByFeign() {
	List<Customer> allCustomer=communication.getAllCustomerByFeign();
		return allCustomer;
	}

}
