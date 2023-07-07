package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {



	String save(int cid);

	void save(AllPersonalDocs doc);

	void save(AccountDetails accountDetails);

	void save(CustomerAddress customerAddress);

	void save(GuarantorDetails guarantorDetails);
}
