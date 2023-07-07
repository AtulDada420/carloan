package com.getcarloan.reservice.service;



import java.util.List;

import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.entities.PreviousLoan;
import com.getcarloan.reservice.entities.PreviousLoanBank;

public interface CustomerService {

	Customer getCustomerById(int cid);

	Customer saveCustomer(CustomerDTO customerDto);

	List<Customer> getAllCustomer();

	String deleteCustomer(int cid);

	Customer findByCid(int cid);

	Customer updateCustomer(Customer customer);

	Customer saveCustomerDocs(Customer customer);

	void saveDocument(AllPersonalDocs doc);

	Customer saveCustomeWithAccountDetails(Customer customer);

	AccountDetails getAllAccountDetailsByCid(int cid);

	Customer saveCustomeWithCustomerAddress(Customer customer);

	CustomerAddress CustomerAddressByCid(int cid);

	Customer saveGuarantorDetailsByCid(Customer customer);

	GuarantorDetails getGuarantorDetailsByCid(int cid);

	Customer saveLoanDetailsCid(Customer customer);

	LoanDetails getLoanDetailsByCid(int cid);

	Customer savePreviousLoanByCid(Customer customer);

	PreviousLoan getPreviousLoanByCid(int cid);

	Customer savePreviousLoanBankByCid(Customer customer);

	PreviousLoanBank getPreviousLoanBankByCid(int cid);

	AllPersonalDocs getAllDocumentsByCid(int cid);


	

	

}
