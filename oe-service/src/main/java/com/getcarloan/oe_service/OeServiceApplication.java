package com.getcarloan.oe_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OeServiceApplication.class, args);
		System.out.println("OE Service Worked........");
	}

}
