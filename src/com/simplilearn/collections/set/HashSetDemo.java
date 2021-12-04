package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// Set is child interface in Collection
		// Set does not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// set decleration
		Set<String> set1 = new HashSet<String>(); // when do not want any insertion order to preserve
		Set<String> set2 = new LinkedHashSet<String>(); // when want to preserve insertion order.
		Set<String> set3 = new TreeSet<String>(); // Arrange set element is ascending / descending order

		// HashSet
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		// add element into set
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("SIMPLILAERN");
		setOfUniqueCompanies.add("CISCO");
		setOfUniqueCompanies.add("WIPRO");
		setOfUniqueCompanies.add("DELL");
		// print set
		System.out.println(setOfUniqueCompanies);
		System.out.println("------------------");

		// Enhance for loop
		for (String comp : setOfUniqueCompanies) {
			System.out.println(comp);
		}
		System.out.println("------------------");

	}

}
