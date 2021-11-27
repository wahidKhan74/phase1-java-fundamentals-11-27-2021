package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {
	
	public static void main(String[] args) {
		// step 1: collect input number value from user.
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println(" :: Welcome to numeric convertor :: ");
		System.out.println(" :: Enter a integer number vaule :: ");
		System.out.println("--------------------------------");
		int userInput = input.nextInt();		
		
		// step 2: convert number into other types.
		// implicit type 
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// explicit type
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		System.out.println(":: Interger to Other Type casted values ::");
		System.out.println("Byte Value : "+byteValue);
		System.out.println("Short Value : "+shortValue);
		System.out.println("Long Value : "+bigValue);
		System.out.println("Float Value : "+floatValue);
		System.out.println("Double Value : "+doubleValue);
		
	}

}
