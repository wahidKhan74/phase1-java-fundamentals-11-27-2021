package com.simplilearn.typecasting;

public class ExplicitTypeCast {

	public static void main(String[] args) {
		// Explicit type cast :When type are not compatible, does not happen automatically
		/**
		 * Narrowing : Converts data of incompatible type 
		 * Convert data from hihger range value to lower range value.
		 * double => float => long => int => short => byte.
		 */
		
		double price = 122.334d;
		
		long bigPrice = (long) price; // Narrowing => double -> long
		
		int intPrice = (int) price;  // Narrowing => double to int
		
		short shortPrice = (short) bigPrice; // Narrowing => long -> short
		
		byte bytePrice = (byte) price; // Narrowing double -> byte
		
		
		System.out.println("Double price : "+price);
		System.out.println("Long price : "+bigPrice);
		System.out.println("Integer price : "+intPrice);
		System.out.println("Short price : "+shortPrice);
		System.out.println("Byte price : "+bytePrice);
		
	}

}
