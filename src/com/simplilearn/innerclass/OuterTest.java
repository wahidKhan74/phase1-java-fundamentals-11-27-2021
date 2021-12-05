package com.simplilearn.innerclass;

public class OuterTest {
	// data members 
	private double amount = 345034.454;
	public String message ="Today is a good day!";
	
	// non static inner class
	class InnerTest {
		// data members of inner class
		private String text = "Hello, & Welcome";
		
		public void showData() {
			System.out.println("Outer class amount :: "+ amount);
			System.out.println("Outer class Message :: "+ message);
			System.out.println("Inner class text :: "+ text);
		}
	}
	
	public static void main(String[] args) {
		// create a outer class object
		OuterTest outer = new OuterTest();
		// create inner class object with outer class refrence.
		InnerTest inner = outer.new InnerTest();
		
		inner.showData();
	}
}
