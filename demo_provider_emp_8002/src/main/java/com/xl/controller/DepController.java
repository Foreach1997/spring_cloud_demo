package com.xl.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class DepController {

	@GetMapping("/test")
	@Transactional()
	public String getTest() {
		return "8002";
	}
}
