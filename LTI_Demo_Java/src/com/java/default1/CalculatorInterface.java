package com.java.default1;

public interface CalculatorInterface {
	
	// decalre the cal services implement by the Indian & china Calculator
	
		 public default double addition(int a, int b) {
			 
			 // addition are here common impl
			return a+b; 
		 };
		 
		 public double substract(int a, int b);

		 public double multiply(int a, int b);
		 
		 public double divide(int a, int b);

}
