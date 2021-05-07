package com.example.calculator;

import java.util.Date;

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
		return "Welcome Tomcat is started ...." + new Date();
	}

	@GetMapping("/sub/{a}/{b}")
	public Integer sub(@PathVariable Integer a, @PathVariable Integer b) {
		return a - b;
	}

	@GetMapping("/multi/{a}/{b}")
	public Integer multi(@PathVariable Integer a, @PathVariable Integer b) {
		return a * b;
	}

	@GetMapping("/div/{a}/{b}")
	public Integer div(@PathVariable Integer a, @PathVariable Integer b) {
		return a / b;
	}

	@GetMapping("/seq/{a}")
	public Integer seq(@PathVariable Integer a) {
		return a * a;
	}

	@GetMapping("/qube/{a}")
	public Integer qube(@PathVariable Integer a) {
		return a * a * a;
	}
}
