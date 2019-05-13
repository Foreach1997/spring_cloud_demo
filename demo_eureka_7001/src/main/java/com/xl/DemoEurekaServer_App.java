package com.xl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEurekaServer_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DemoEurekaServer_App.class, args);
		
	}
	
	
}
