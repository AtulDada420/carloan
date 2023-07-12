package com.getcarloan.account.proxy;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.getcarloan.account.entity.LoanApproval;


@FeignClient("Operations-Executive1")
public interface FeignCommnicationn {

	@GetMapping("/oe-service/sanctionAmt/{cid}")
	public LoanApproval getSanctionAmtByCid(@PathVariable int cid);

}
