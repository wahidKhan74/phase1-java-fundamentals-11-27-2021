package com.simplilearn.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		// PriorityQueue : does not maintains the FIFO order.
		Queue<String> banKQueue = new PriorityQueue<String>();

		// add data into queue
		banKQueue.add("John");
		banKQueue.add("Smith");
		banKQueue.add("Parul");
		banKQueue.add("Jeet");
		banKQueue.add("Mike");
		banKQueue.add("Prama");

		System.out.println(banKQueue);

		// top / peek element
		System.out.println("Head :> " + banKQueue.peek());
		System.out.println("Head :> " + banKQueue.element());
		System.out.println("----------------------------");
		// remove and print head
		System.out.println("Removed element / head :> " + banKQueue.poll());
		System.out.println("Head :> " + banKQueue.element());
		
		System.out.println("----------------------------");
		System.out.println(banKQueue);
		
		// iterate over queue
		for(String person : banKQueue) {
			System.out.println("Name :> "+ person);
		}
	}

}
