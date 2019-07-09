package com.xl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoProviderEmpApp {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoProviderEmpApp.class, args);
		
	}
}
