package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// List  -> Order collection of data with duplicates elements.
		// List (interface) ->  imp classes -> ArrayList, LinkedList , Vector , Stack
		
		// list decleration
		List<String> list1 = new ArrayList<String>();  // backed by dynamic array, not thread safe, read operations
		List<Integer> list2 = new LinkedList<Integer>(); //backed by doubly linkedlist ,not thread safe, -> insert, delete,replace
		List<String>  list3 = new Vector<String>(); // backed by dynamic array, thread safe
		List<Double>  list4 = new Stack<Double>(); // backed by dynamic array, thread safe
		
		// collection without typesafety
		List<String> nameList = new ArrayList<String>();
		
		// add element into list
		nameList.add("John Snow");
		nameList.add("Arya Stark");
		nameList.add("Tony Stark");
		nameList.add("Jaime Lannister");
		nameList.add("Viserys Targaryen");
		
		System.out.println(nameList);
		System.out.println("The element at index 2: "+nameList.get(2));
		System.out.println("The element at index 4: "+nameList.get(4));
		System.out.println("--------------------------------------");
		// add element at a index
		nameList.add(2, "Cersei Lannister");
		System.out.println("The element at index 2: "+nameList.get(2));
		System.out.println("The element at index 3: "+nameList.get(3));
		
		System.out.println("--------------------------------------");
		// iterate over array list
		// 1. list iterator to iterate list
		Iterator<String> itr = nameList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		System.out.println("--------------------------------------");
		// 2. enhance for loop(foreach) to iterate list
		for(String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println("--------------------------------------");
		// 3. counter for loop to iterate list
		for (int index = 0; index < nameList.size(); index++) {
			System.out.println("The index : "+index +" & value : "+nameList.get(index));
		}
	}

}
