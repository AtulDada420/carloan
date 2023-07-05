package com.getcarloan.account.service;

import org.springframework.stereotype.Service;

import com.getcarloan.accountheader.entity.SanctionLetter;


public interface SanctionService {

	String saveSanctionLetter(SanctionLetter sanctionLetter);

	

}
