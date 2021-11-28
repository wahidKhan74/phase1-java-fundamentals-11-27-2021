package com.simplilearn.stringhandling;

public class StringDemo {
	
	public static void main(String[] args) {
		
		// 1. string literal 
		// Each time you create a string literal, the JVM checks the "string constant pool" first. 
		// If the string already exists in the pool, a reference to the pooled instance is returned. 
		String username ="Noah";
		String user = "Noah";
		if(user == username) {
			System.out.println("Strings are same.");
		}else {
			System.out.println("Strings are diffrent.");
		}
		
		// 2. string with new keyword
		// Each Time new keyword is going to generate new string reference.
		String name1 = new String("John");
		String name2= new String("John");
		
		if(name1 == name2) {
			System.out.println("Strings are same.");
		}else {
			System.out.println("Strings are diffrent.");
		}
	}
}
