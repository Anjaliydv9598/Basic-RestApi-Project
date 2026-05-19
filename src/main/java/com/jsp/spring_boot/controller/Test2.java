package com.jsp.spring_boot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {

	@PostMapping("/api")
	public String test() {
		return "WELCOME TO API";
	}
}
