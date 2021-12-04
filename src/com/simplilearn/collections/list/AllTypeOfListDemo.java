package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AllTypeOfListDemo {

	public static void main(String[] args) {
		// Array List
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("DELL");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("CGI");
		listOfCompanies.add("BOI");

		// print list
		System.out.println(listOfCompanies);

		// Linked List
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("Mumbai");
		listOfCities.add("California");
		listOfCities.add("Virginia");
		listOfCities.add("New York");
		listOfCities.add("Mumbai");

		// print list
		System.out.println(listOfCities);

		// Vector -> thread safe
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Apple");
		listOfFruits.add("Kwi");
		listOfFruits.add("Orange");
		listOfFruits.add("Grapes");

		// print list
		System.out.println(listOfFruits);

		// Stack -> thread safe -> FILO
		List<String> listOfBanks = new Stack<String>();
		listOfBanks.add("BOA");
		listOfBanks.add("BOI");
		listOfBanks.add("BOM");
		listOfBanks.add("BOC");
		listOfBanks.add("BOS");
		listOfBanks.add("BOA");

		// print list
		System.out.println(listOfBanks);
	}
}
