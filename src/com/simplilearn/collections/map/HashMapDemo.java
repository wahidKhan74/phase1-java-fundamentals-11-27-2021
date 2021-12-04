package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		// add elemnts into map
		phoneBook.put("John", 8989898989L);
		phoneBook.put("Mike", 1989898989L);
		phoneBook.put("Ava", 9989898989L);
		phoneBook.put("Emma", 229898989L);
		phoneBook.put("Marry", 339898989L);
		
		System.out.println(phoneBook);
		
		// fetch values from map
		System.out.println("Ava Numbers : "+phoneBook.get("Ava"));
		System.out.println("Mike Numbers : "+phoneBook.get("Mike"));
		
		// iterate map
		for(Map.Entry<String, Long> entry : phoneBook.entrySet()) {
			System.out.println("--------------------------");
			System.out.println("Key :> "+entry.getKey());
			System.out.println("Value :> "+entry.getValue());
		}
		
	}

}
