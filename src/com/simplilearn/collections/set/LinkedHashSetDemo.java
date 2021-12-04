package com.simplilearn.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {

		// LinkedHashSet
		Set<String> setOfUniqueBrands = new LinkedHashSet<>();

		// add elements into linked hashset
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Fila");
		setOfUniqueBrands.add("ASICS");
		setOfUniqueBrands.add("Adidas");
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Puma");

		// print set
		System.out.println(setOfUniqueBrands);
		System.out.println("------------------");

		// Enhance for loop
		for (String brand : setOfUniqueBrands) {
			System.out.println(brand);
		}
	}
}
