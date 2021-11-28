package com.simplilearn.stringhandling;

public class StringImmutableDemo {

	public static void main(String[] args) {
		
		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		
		String username = "John";
		
		// contact -> updating a string 
		String response = username.concat(" Snow");
		
		System.out.println(username);   // -> old string
		System.out.println(response);   // -> new string	

	}

}
