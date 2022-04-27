package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloword")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Alo mundão!";
	}
}
