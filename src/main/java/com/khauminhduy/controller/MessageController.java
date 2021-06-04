package com.khauminhduy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.khauminhduy.model.Message;

@Controller
public class MessageController {

	@GetMapping("/message")
	@ResponseBody
	public Message send() {
		return new Message("first message");
	}
}
