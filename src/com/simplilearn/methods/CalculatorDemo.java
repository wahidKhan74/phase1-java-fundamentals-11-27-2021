package com.simplilearn.methods;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {

		// step 1. collect input from user console
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println(" :: Welcome to Arithmatic calulator :: ");
		System.out.println("--------------------------------");
		
		System.out.println(" :: Enter a number 1 vaule :: ");	
		int x = input.nextInt();
		
		
		System.out.println(" :: Enter a number 2 vaule :: ");	
		int y = input.nextInt();
		
		// step 2. call arithmetic calculator function
		Calculator calculator = new Calculator();
		System.out.println("X is "+x+" , Y is "+y+" And Addition : "+calculator.add(x, y));
		System.out.println("X is "+x+" , Y is "+y+" And Substration : "+calculator.sub(x, y));
		System.out.println("X is "+x+" , Y is "+y+" And Multiplication : "+calculator.mul(x, y));
		System.out.println("X is "+x+" , Y is "+y+" And Division : "+calculator.div(x, y));
		System.out.println("X is "+x+" , Y is "+y+" And Average : "+Calculator.avg(x, y));
	}
}

class Calculator {

	// add
	public float add(int num1, int num2) {
		float result = num1 + num2;
		return result;
	}

	// sub
	public float sub(int num1, int num2) {
		float result = num1 - num2;
		return result;
	}

	// mul
	public float mul(int num1, int num2) {
		float result = num1 * num2;
		return result;
	}

	// div
	public float div(int num1, int num2) {
		float result = num1 / num2;
		return result;
	}

	// avg
	public static float avg(int num1, int num2) {
		float result = (num1+num2)/2;
		return result;
	}
}
