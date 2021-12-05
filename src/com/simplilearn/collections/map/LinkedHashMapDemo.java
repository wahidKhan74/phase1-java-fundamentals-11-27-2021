package com.simplilearn.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String, Double> mapOfItems = new LinkedHashMap<String, Double>();

		// add data elements into map
		mapOfItems.put("Rice", 145.45);
		mapOfItems.put("Oil", 55.45);
		mapOfItems.put("Apple", 35.45);
		mapOfItems.put("Orange", 45.45);
		mapOfItems.put("Noodles", 145.45);

		System.out.println(mapOfItems);

		System.out.println("Rice Price : " + mapOfItems.get("Rice"));
		System.out.println("Apple Price : " + mapOfItems.get("Apple"));

		// iterate map
		for (Map.Entry<String, Double> entry : mapOfItems.entrySet()) {
			System.out.println("--------------------------");
			System.out.println("Key :> " + entry.getKey());
			System.out.println("Value :> " + entry.getValue());
		}
	}

}
