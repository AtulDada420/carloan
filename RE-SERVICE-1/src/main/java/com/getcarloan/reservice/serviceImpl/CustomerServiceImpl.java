package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.getcarloan.reservice.dto.CustomerDTO;
import com.getcarloan.reservice.entities.AccountDetails;
import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.entities.Customer;
import com.getcarloan.reservice.entities.CustomerAddress;
import com.getcarloan.reservice.entities.GuarantorDetails;
import com.getcarloan.reservice.entities.LoanDetails;
import com.getcarloan.reservice.entities.PreviousLoan;
import com.getcarloan.reservice.entities.PreviousLoanBank;
import com.getcarloan.reservice.exceptionHandler.ResourceNotFoundException;
import com.getcarloan.reservice.repository.CustomerRepo;
import com.getcarloan.reservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo crepo;
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private JavaMailSender sender;


	@Override
	public Customer getCustomerById(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get();
		else
			return new Customer();
	}

	@Override
	public Customer saveCustomer(CustomerDTO customerDto) {
		Customer cust = mapper.map(customerDto, Customer.class);
		
		
		crepo.save(cust);
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sunagujiri22@gmail.com");
		message.setTo(cust.getEmail());
		message.setSubject("Mail From Sunanda");
		message.setText("CustomerId"+" : "+cust.getCid());
		
     	sender.send(message);
		return cust;
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
	public Customer updateCustomer(Customer customer) {
		return crepo.save(customer);
	}
////////////////////////////////////////////////////////////////////
	@Override
	public Customer findByCid(int cid) {
		return crepo.findById(cid).orElseThrow(() -> new ResourceNotFoundException("No Customer with this ID"));
	}

///////////////////////////////////////////////////////////////////////////////	
	@Override
	public Customer saveCustomerDocs(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public void saveDocument(AllPersonalDocs doc) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public AllPersonalDocs getAllDocumentsByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getCAllPersonalDocs();
		else
			return null;
	}

	
/////////////////////////////////////////////////////////////////////////////////
	@Override
	public Customer saveCustomeWithAccountDetails(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public AccountDetails getAllAccountDetailsByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getCAccountDetails();
		else
			return null;
	}
//////////////////////////////////////////////////////////////////////////////
	@Override
	public Customer saveCustomeWithCustomerAddress(Customer customer) {
		return crepo.save(customer);
		}

	@Override
	public CustomerAddress CustomerAddressByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getCAddress();
		else
			return null;
	}
//////////////////////////////////////////////////
	@Override
	public Customer saveGuarantorDetailsByCid(Customer customer) {
		return crepo.save(customer);
	}

	@Override
	public GuarantorDetails getGuarantorDetailsByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getCGuarantorDetails();
		else
			return null;
	}
/////////////////////////////////////////////////
	@Override
	public Customer saveLoanDetailsCid(Customer customer) {
		return crepo.save(customer);	}

	@Override
	public LoanDetails getLoanDetailsByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getCLoanDetails();
		else
			return null;
	}
///////////////////////////////////////////////
	@Override
	public Customer savePreviousLoanByCid(Customer customer) {
		return crepo.save(customer);	}

	@Override
	public PreviousLoan getPreviousLoanByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getCPreviousLoan();
		else
			return null;

	}

	@Override
	public Customer savePreviousLoanBankByCid(Customer customer) {
		return crepo.save(customer);	}

	@Override
	public PreviousLoanBank getPreviousLoanBankByCid(int cid) {
		if (crepo.existsById(cid))
			return crepo.findById(cid).get().getPbankDetails();
		else
			return null;
		}

		

	

}
