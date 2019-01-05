package com.capgemini.calculate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	private Calculator calculator;
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}

	@Test
	public void additionTestForTwoPositiveNumbers() 
	{
		int answer = calculator.addNumbers(50,50);
		assertEquals(100,answer);
		
	}
	
	@Test
	public void additionTestForTwoNegativeNumbers() 
	{
		int answer = calculator.addNumbers(50,50);
		assertEquals(100,answer);
		
	}
	
	/**
	 * For subtraction
	 */

	@Test
	public void subtractionTestForTwoPositiveNumbers1() 
	{
		int answer = calculator.subtractNumbers(50,10);
		assertEquals(40,answer);
	}
	
	@Test
	public void subtractionTestForTwoNegativeNumbers() 
	{
		int answer = calculator.subtractNumbers(-60,-10);
		assertEquals(-50,answer);
	}
	
	/**
	 * For Multiplication
	 */
	@Test
	public void multiplicationTestForTwoPositiveNumbers1() 
	{
		int answer = calculator.multiplyNumbers(50,10);
		assertEquals(500,answer);
	}
	
	@Test
	public void multiplicationTestForTwoNegativeNumbers() 
	{
		int answer = calculator.multiplyNumbers(-60,-10);
		assertEquals(600,answer);
	}
	
	/**
	 * for Division
	 * 
	 */
	
	
	@Test
	public void divisionTestForTwoPositiveNumbers() 
	{
		int answer = calculator.divideNumbers(50,10);
		assertEquals(5,answer);
		
	}

	@Test
	public void divisionTestForTwoNegativeNumbers() 
	{
		int answer = calculator.divideNumbers(-10,-5);
		assertEquals(2,answer);
		
	}
}



