package com.xl.config;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRINGCLOUD-DEMO-EMP")
public interface DepService {

	@GetMapping("/provider/test")
	public String getInfo();
	
	
}
