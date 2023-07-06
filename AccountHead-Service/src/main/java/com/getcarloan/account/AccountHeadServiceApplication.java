package com.getcarloan.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.getcarloan.account")
public class AccountHeadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountHeadServiceApplication.class, args);
		
		System.out.println("AccountHead-Service Running...!!!");
	}

}
