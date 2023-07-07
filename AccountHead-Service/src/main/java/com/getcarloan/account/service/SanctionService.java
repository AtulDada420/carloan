package com.getcarloan.account.service;

import java.util.List;

import com.getcarloan.account.entity.Customer;
import com.getcarloan.account.entity.SanctionLetter;

public interface SanctionService {

	String saveSanctionLetter(SanctionLetter sanctionLetter);

	List<SanctionLetter> viewSanctionLetter();

	SanctionLetter viewSanctionLetterByID(int cid);

	Customer getCustomerId(int cid);

	List<Customer> getAllCustomerByFeign();

}
