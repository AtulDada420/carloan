package com.getcarloan.report.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.getcarloan.report.entity.Customer;

@FeignClient("Relational-Executive")
public interface Feigncommunication {
	@GetMapping("/ReService/getAllCustomer")
	public  List<Customer> getAllCustomer();

	
	@GetMapping("/ReService/getCustomerById/{cid}")
	public Customer getCustomerById(@PathVariable int cid);
	
	

}
