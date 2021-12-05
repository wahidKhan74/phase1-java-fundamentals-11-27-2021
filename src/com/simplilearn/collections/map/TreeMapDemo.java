package com.simplilearn.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> mapOfNames = new TreeMap<Integer, String>();
		
		mapOfNames.put(105, "Marry Smith");
		mapOfNames.put(101, "John Smith");
		mapOfNames.put(103, "Will Smith");
		mapOfNames.put(104, "Ava Smith");
		mapOfNames.put(102, "Mark Smith");
		
		System.out.println(mapOfNames);
		System.out.println(mapOfNames.get(104));
		
		System.out.println(mapOfNames.descendingMap());


		// iterate map
		for (Map.Entry<Integer, String> entry : mapOfNames.entrySet()) {
			System.out.println("--------------------------");
			System.out.println("Key :> " + entry.getKey());
			System.out.println("Value :> " + entry.getValue());
		}
	}

}
