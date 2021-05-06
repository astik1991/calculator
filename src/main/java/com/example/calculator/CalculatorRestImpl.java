package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestImpl {

	@GetMapping("/add/{a}/{b}")
	public Integer add(@PathVariable Integer a, @PathVariable Integer b) {
		return a + b;
	}

	@GetMapping("/hello")
	public String hello() {
		return "Welcome Tomcat is started ....";
	}
}
