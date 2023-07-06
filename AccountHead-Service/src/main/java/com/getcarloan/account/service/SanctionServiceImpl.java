package com.getcarloan.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.account.entity.SanctionLetter;
import com.getcarloan.account.repository.SanctionRepository;

@Service
public class SanctionServiceImpl implements SanctionService{

	@Autowired
	private SanctionRepository repo;
	
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

}
