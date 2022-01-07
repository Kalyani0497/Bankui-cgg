package com.bankui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountOpenController {

	@RequestMapping("/")
	public String showAccountOpenScreen() {
		return "account_open";
	}
	
	@RequestMapping("/login")
	public String showAccountLoginScreen() {
		return "account_open";
	}
}
