package com.java.default1;

public class IndianCalculator implements CalculatorInterface {

	@Override
	public double substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b+1;
	}

	@Override
	public double multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b+1;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b -1;
	}

}
