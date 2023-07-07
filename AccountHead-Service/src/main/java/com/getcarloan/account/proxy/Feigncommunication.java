package com.getcarloan.account.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.getcarloan.account.entity.Customer;

@FeignClient("Relational-Executive")
public interface Feigncommunication {
	
	@GetMapping("/ReService/getCustomerById/{cid}")
	public Customer getCustomerById(@PathVariable int cid);
	
	@GetMapping("/ReService/getAllCustomer")
	public List<Customer> getAllCustomerByFeign();

}
