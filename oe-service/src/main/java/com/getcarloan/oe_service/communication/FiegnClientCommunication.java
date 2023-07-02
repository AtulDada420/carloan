package com.getcarloan.oe_service.communication;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Relational-Executive")
public interface FiegnClientCommunication {

}
