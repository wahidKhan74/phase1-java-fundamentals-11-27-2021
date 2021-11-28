package com.simplilearn.arrays;

import java.util.Arrays;

public class StringArrayDemo {
	
	public static void main(String[] args) {
		// create a username array
		String[] names = { "john", "mike","david","william","ruby","marry"};
		
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);
		
		//access element by index
		System.out.println("Element at index 0 :" +names[0]);
		System.out.println("Element at index 5 :" +names[5]);
		
		// System.out.println("Element at index 6 :" +names[6]); // ArrayIndexOutOfBoundsException
	

		for(int index=0; index<names.length ; index++) {
			System.out.println("Index : "+index +" , value : "+names[index]);
		}
	}
}
