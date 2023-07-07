package com.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	public RouteLocator getLocater(RouteLocatorBuilder builder) {
		return builder.routes().route(p->p.path("ReService").uri("lb://RELATIONAL-EXECUTIVE"))
				.build();
		
	}
}
