  package com.getcarloan;

import org.modelmapper.ModelMapper;
//import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients
public class ReServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReServiceApplication.class, args);
	    System.out.println("\nCar Loan App Initiated \r");
	}
	
    @Bean
	 public ModelMapper getMapper() {
		 return new ModelMapper();
	}
	
}
