package com.getcarloan.reservice.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.exception.ResourceNotFoundException;
import com.getcarloan.reservice.repository.CustomerRepo;
import com.getcarloan.reservice.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo crepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public Customer getCustomerById(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get();
		else
			return new Customer();
	}

	@Override
	public List<Customer> getAllCustomer() {
		return crepo.findAll();
	}

	@Override
	public String deleteCustomer(int cid) {
		crepo.deleteById(cid);
		return "Customer Deleted By ID";
	}

	@Override
	public String updateCustomerById(int cid) {
		crepo.save(cid);
		return "Upadate Customer";
	}

	@Override
	public Customer saveCustomer(CustomerDTO customerDto) {
		Customer customer = new Customer();
		customer.setEnquiry(customerDto.getEnquiry());
		customer.setAge(customerDto.getAge());
		customer.setDOB(customerDto.getDOB());
		customer.setAdditionalMobileNo(customerDto.getAdditionalMobileNo());
		customer.setEmail(customerDto.getEmail());
		customer.setName(customerDto.getName());
		customer.setGender(customerDto.getGender());
		customer.setMobileNo(customerDto.getMobileNo());
		customer.setTotalLoanRequired(customerDto.getTotalLoanRequired());
		customer.setDownPaymentAmount(customerDto.getDownPaymentAmount());
		//Customer customer = mapper.map(customerDto,Customer.class);
		
		return crepo.save(customer);
		

	}
////////////////////////////////////////////////////////////////
	@Override
	public Customer findByEID(int cid) {
		return crepo.findById(cid).orElseThrow(()->new ResourceNotFoundException("No Customer with this ID"));
	}

	////////////////////////////////////////////////////////
	
	@Override
	public void saveDocument(AllPersonalDocs doc) {
		 String id=UUID.randomUUID().toString().toUpperCase();
       	 crepo.save(doc);
		
	}

	@Override
	public Customer SaveCustomerwithDocument(Customer customer) {
		
		return crepo.save(customer);
	}
//////////////////////////////////////////////////////////////////
	@Override
	public void saveAccountDetails(AccountDetails accountDetails) {
		crepo.save(accountDetails);
	}

	@Override
	public Customer SaveCustomerwithAccountDetails(Customer customer) {
		return crepo.save(customer);	}

	@Override
	public Customer getAllAccountDetailsByCustomerId(int cid) {
		if (crepo.existsById(cid))
		return crepo.findById(cid).get();
      	else
      	return null;
		}

	@Override
	public String updateAccountDetailsByCustomerId(int cid) {
		crepo.save(cid);
    	return "AccountDetails updated";	
    	}

	@Override
	public String deleteAccountDetailsByCustomerId(int cid) {
		crepo.deleteById(cid);
     	return "AccountDetails Deleted";
	}

	////////////////////////////////////
	@Override
	public Customer SaveCustomerwithCustomerAddress(Customer customer) {
		return crepo.save(customer);	}

	@Override
	public void saveCustomerAddressByCid(CustomerAddress customerAddress) {
		crepo.save(customerAddress);
		
	}

	@Override
	public Customer CustomerAddressBycId(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get();
	      	else
	      	return null;
	}

	@Override
	public String updateCustomerAddressByCid(int cid) {
		crepo.save(cid);
    	return "Customer Address updated";	
	}

	@Override
	public String deleteCustomerAddressByCid(int cid) {
		crepo.deleteById(cid);
     	return "Customer Address Deleted";	}

	@Override
	public void saveGuarantorDetailsByCid(GuarantorDetails guarantorDetails) {
		crepo.save(guarantorDetails);
		
	}

	@Override
	public Customer SaveCustomerwithGuarantorDetails(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public Customer getGuarantorDetailsByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get();
	      	else
	      	return null;	}

	@Override
	public String updateGuarantorDetailsById(int cid) {
		crepo.save(cid);
    	return "Customer Address updated";	
	}

	@Override
	public String deleteGuarantorDetailsById(int cid) {
		crepo.deleteById(cid);
     	return "Customer Address Deleted";	}

	

	
}
