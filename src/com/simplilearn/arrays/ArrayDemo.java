package com.simplilearn.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// Arrays : arrays is an ordered collection of similar type of data elements.
		int numbers[] = new int[5];
		
		// add elements in arrays
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		// get element
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
		// numbers[5]=3030; // Array Index Out Of Bounds Exception
		
		for(int index=0; index<numbers.length ; index++) {
			System.out.println("Index : "+index +" , value : "+numbers[index]);
		}
	}
}
