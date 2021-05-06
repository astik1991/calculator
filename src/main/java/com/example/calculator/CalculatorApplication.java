package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(CalculatorApplication.class); 
	}

}
