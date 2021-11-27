package com.simplilearn.acessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		
		//create object 
		Father father = new Father();
		System.out.println("The amount :: "+father.amount);
		System.out.println("The park :: "+father.park);
		
		System.out.println("----------------------");
		//access methods
		System.out.println("The amount : "+father.showAmount());
		System.out.println("The park : "+father.displayPark());
	}

}

class Father {
	
	// public variable
	public double amount =345464.43d;
	public String park ="Public Health Park";
	
	// public methods
	public double showAmount() {
		return amount;
	}
	
	public String displayPark() {
		return park;
	}
	
	// constructor
	public Father() { }
}