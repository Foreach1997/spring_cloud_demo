package com.xl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class OutPutController {
	@Autowired
	private Source source;
	
	//@RabbitListener(queues = "hello.new")
	@GetMapping("testOutPut")
	public String loggerSink() {
		
				source.output().send(MessageBuilder.withPayload("123").build());
				return "123";
	}
}
