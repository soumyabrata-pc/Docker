package com.sbc.consumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MessageStore {

	private List<String> listMessages=new ArrayList<String>();
	
	public void addMessage(String message) {
		listMessages.add(message);
	}
	
	public String getAllMessage() {
		return listMessages.toString();
	}

}
