package com.khauminhduy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khauminhduy.model.Message;

@RestController
@RequestMapping(value = {"messagerest"})
public class MessageRestController {
	
	@GetMapping("")
	public Message sendMessage() {
		return new Message("first message rest");
	}
	
	@PostMapping("")
	public Message createMessage(@RequestBody Message message) {
		return message;
	}

}
