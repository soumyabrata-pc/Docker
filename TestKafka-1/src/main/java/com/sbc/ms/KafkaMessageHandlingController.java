package com.sbc.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbc.consumer.MessageStore;
import com.sbc.producer.MessageProducer;

@RestController
public class KafkaMessageHandlingController {

	@Autowired
	private MessageStore msgStore;
	@Autowired
	private MessageProducer msgPro;
	
	@GetMapping("/send")
	public String SendMessage(@RequestParam("message")String message) {
		String status=msgPro.sendMessage(message);
		return "<h1>"+status+"</h1>";
//		Write Style singleLine
//		return "<h1>"+msgPro.sendMessage(Message)+"</h1>";
	}
	
	@GetMapping("/readAll")
	public String fetchAllMessage() {
	
		return "<h1>"+msgStore.getAllMessage()+"</h1>";
	}
}
