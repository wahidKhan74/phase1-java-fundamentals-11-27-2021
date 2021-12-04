package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue is a data structure which works in first in first out order (FIFO).
		Queue<String> peopleQueue = new ArrayDeque<String>();
		
		// add elements into queue
		peopleQueue.add("John");   // head element
		peopleQueue.add("Mike");
		peopleQueue.add("William");
		peopleQueue.add("Amar");
		peopleQueue.add("Jeet");
		peopleQueue.add("David");
		peopleQueue.add("Prama");
		
		// top / peek element
		System.out.println("Head :> "+peopleQueue.peek());
		System.out.println("Head :> "+peopleQueue.element());
		System.out.println("----------------------------");
		// remove and print head
		System.out.println("Removed element / head :> "+peopleQueue.poll());
		System.out.println("Head :> "+peopleQueue.element());
		
		System.out.println("----------------------------");
		System.out.println(peopleQueue);
		
		// iterate over queue
		for(String person : peopleQueue) {
			System.out.println("Name :> "+ person);
		}
		
		
	}
	

}
