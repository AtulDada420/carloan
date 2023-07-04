  package com.getcarloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReServiceApplication.class, args);
	    System.out.println("\nCar Loan App Initiated \r");
	    
	}

}
