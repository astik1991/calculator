package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Test
	public void addTest() {
		Assertions.assertEquals(200, HttpStatus.OK);
	}
}
