package com.getcarloan.oe_service.communication;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://localhost:8081/re-service",name = "Relational-Executive")
public interface FiegnClientCommunication {

}
