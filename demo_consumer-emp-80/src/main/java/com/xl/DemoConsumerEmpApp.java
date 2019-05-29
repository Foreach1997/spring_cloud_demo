package com.xl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-DEMO-EMP")
public class DemoConsumerEmpApp {

	//12321312 
	public static void main(String[] args) {
		System.out.println(121233 +"23213");
		SpringApplication.run(DemoConsumerEmpApp.class, args);
		
	}
	
	
	
}
