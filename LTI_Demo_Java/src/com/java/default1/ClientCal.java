package com.java.default1;

public class ClientCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorInterface indian = new IndianCalculator();
		System.out.println("-----Indian--------");
		System.out.println(indian.addition(1, 2));
		System.out.println(indian.divide(3, 3));
		System.out.println(indian.multiply(1, 2));
		System.out.println(indian.substract(3, 3));

		CalculatorInterface chinese = new ChineseCalculator();
		System.out.println("-----Chinese--------");

		System.out.println(chinese.addition(1, 2));
		System.out.println(chinese.divide(3, 3));
		System.out.println(chinese.multiply(1, 2));
		System.out.println(chinese.substract(3, 3));

	}

}
