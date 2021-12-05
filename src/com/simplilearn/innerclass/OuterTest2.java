package com.simplilearn.innerclass;

public class OuterTest2 {
	// data members 
	private static double amount = 345034.454;
	public static String message ="Today is a good day!";
	
	// static inner class
	static class InnerTest {
		// data members of inner class
		private String text = "Hello, & Welcome";
		
		public void showData() {
			System.out.println("Outer class amount :: "+ amount);
			System.out.println("Outer class Message :: "+ message);
			System.out.println("Inner class text :: "+ text);
		}
	}
	
	public static void main(String[] args) {
		
		// create inner class object with outer class reference.
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
	}
}
