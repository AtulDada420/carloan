package com.getcarloan.account.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.getcarloan.account.repository.SanctionRepository;
import com.getcarloan.accountheader.entity.SanctionLetter;

@Service
public class SanctionServiceImpl implements SanctionService{
	

	@Autowired
	private SanctionRepository repo;
	


	@Override
	public String saveSanctionLetter(SanctionLetter sanctionLetter) {
		repo.save(sanctionLetter);
		return "Sanction Letter Generated...!!!";
	}
	

	

}
