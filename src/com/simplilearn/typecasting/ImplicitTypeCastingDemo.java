package com.simplilearn.typecasting;

public class ImplicitTypeCastingDemo {

	public static void main(String[] args) {
		// Implicit Type cast : When data type are compatible, automatically type cast
		/**
		 * Widening Type cast : Converts data from lower range value to higher range type.
		 * byte -> short -> int -> long  -> float -> double.
		 */
		
		byte smallCount = 100;   // -128 to 127 => 1 byte = 8 bit.
		
		short shortCount = smallCount; // widening => byte -> short
		
		int intCount = smallCount;  // widening  -> byte => int
		
		long bigCount = intCount;  // widening  -> int => long
		
		float floatCount = bigCount; // widening => long -> float 
	
		double decimalCount = bigCount;  // widening => long -> double
		
		System.out.println("Byte count : "+ smallCount);
		System.out.println("Integer Count : "+ intCount);
		System.out.println("Short count : "+ shortCount);
		System.out.println("Long Count : "+ bigCount);
		System.out.println("Float count : "+ floatCount);
		System.out.println("Double Count : "+ decimalCount);

	}

}
