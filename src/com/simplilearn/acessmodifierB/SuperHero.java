package com.simplilearn.acessmodifierB;

public class SuperHero {

	// protected properties
	protected String power = "Healing Power!";

	// protected methods
	protected void usePower() {
		System.out.println("The Best power is " + power);
	}

	// public method
	public String showPower() {
		return power;
	}

	public SuperHero() {}
	
//	protected SuperHero() {}
	// protected constructor cannot be instantiate object outside the package.
}
