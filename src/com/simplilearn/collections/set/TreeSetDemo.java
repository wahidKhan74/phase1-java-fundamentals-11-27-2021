package com.simplilearn.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TreeSet : ascending order of the names
		TreeSet<String> setOfUniqueNames = new TreeSet<String>();
		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Mike");
		setOfUniqueNames.add("William");
		setOfUniqueNames.add("Bob");
		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Mark");

		System.out.println(setOfUniqueNames);
		// Enhance for loop
		for (String name : setOfUniqueNames) {
			System.out.println(name);
		}
		System.out.println("------------------");
		System.out.println(setOfUniqueNames.descendingSet());
	}
}
