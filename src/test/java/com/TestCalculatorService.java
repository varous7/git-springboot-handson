package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	
	CalculatorService calculatorService = new CalculatorService();
	
	@Test
	public void testSum() {
		
		Assertions.assertEquals(30, calculatorService.sum());
	}
	@Test
	public void testSubstract() {
		Assertions.assertEquals(10,calculatorService.substract());
		
	}
	@Test
	public void testMultiply() {
		Assertions.assertEquals(200, calculatorService.multiply());
		
	}
	@Test
	public void testDivide() {
		Assertions.assertEquals(2.0, calculatorService.divide(),0.01);
		
	}	
	@Test
	public void testMod() {
		Assertions.assertEquals(0, calculatorService.mod());
		
	}
}
