package com.xl.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class DepController {

	private  final  String  url= "http://SPRINGCLOUD_DEMO_EMP/"; 
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/test")
	public Object getTest() {
	 	ResponseEntity<String> res= restTemplate.getForEntity(url+"provider/test",String.class);
	 	try {
	 		return	new String(res.getBody().getBytes(),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "错误";
		}
	}
	
	
}
