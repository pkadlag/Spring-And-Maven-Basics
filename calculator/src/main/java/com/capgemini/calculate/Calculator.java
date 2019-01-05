package com.capgemini.calculate;
public class Calculator {
	public int addNumbers(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1+number2;
	}


	public int subtractNumbers(int number3, int number4) {
		// TODO Auto-generated method stub
		return number3-number4;
	}



	public int multiplyNumbers(int number5, int number6) //throws InvalidMultiplyNumberException {
	{	//if(number5 < 0 && number6 < 0)
			//throw new InvalidMultiplyNumberException();
		return number5*number6;
	}


	public int divideNumbers(int number7, int number8) {
		// TODO Auto-generated method stub
		return number7/number8;
	}
}