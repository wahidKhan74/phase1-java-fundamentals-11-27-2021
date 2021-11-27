package com.simplilearn.acessmodifier;

import com.simplilearn.acessmodifierB.SuperHero;

public class ProtectedAccessmodifierDemo extends SuperHero{

	public static void main(String[] args) {
		
		// same package class
		Hero hero = new Hero();
		System.out.println("The Power :: "+hero.power);
		System.out.println("The Power :: "+hero.showPower());		
		hero.usePower();
		System.out.println("------------------");
		// outside package class
		SuperHero hero2 = new SuperHero();
		// hero2.power; // this is not visible
		// hero2.usePower(); // this is not visible		
		hero2.showPower();
		System.out.println("------------------");
		// protected properties and method with inheritance.
		ProtectedAccessmodifierDemo pamd = new ProtectedAccessmodifierDemo();
		System.out.println("The Power :: "+pamd.power);
		System.out.println("The Power :: "+pamd.showPower());		
		pamd.usePower();
	}

}