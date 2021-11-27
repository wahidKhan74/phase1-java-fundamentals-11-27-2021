package com.simplilearn.acessmodifier;

public class Hero {
	
	// protected properties
	protected String power = "Healing Power!";
	
	// protected methods
	protected void usePower() {
		System.out.println("The Best power is "+power);
	}
	
	// public method
	public String showPower() {
		return power;
	}
	
	protected Hero() {} 
	
}