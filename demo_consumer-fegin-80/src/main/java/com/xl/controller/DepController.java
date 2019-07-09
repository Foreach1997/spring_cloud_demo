package com.xl.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xl.config.DepService;

@RestController
@RequestMapping("/consumer")
public class DepController {

	//private  final  String  url= "http://SPRINGCLOUD-DEMO-EMP/"; 
	//private  final  String  url= "http://localhost:8001/"; 
	
	@Autowired
	private DepService depService;
	
	@GetMapping("/test")
	public Object getTest() {
		return depService.getInfo();
	}
	
	
}
