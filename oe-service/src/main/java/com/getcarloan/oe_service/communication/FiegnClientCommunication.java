package com.getcarloan.oe_service.communication;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.getcarloan.oe_service.entites.Customer;






@FeignClient(name = "RESERVICE")
public interface FiegnClientCommunication {
	
	@GetMapping("/getAllCustomer/ReService")
	public Customer getAllCustomer();
		


}
