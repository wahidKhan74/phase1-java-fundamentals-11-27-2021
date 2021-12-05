package com.simplilearn.multithread;

class CounterA {
	int count;

	// increase count : thread operation
	public synchronized void increaseCount() {
		count++; // count=count+1; or count+=1;
	}

	// decrease count
	public void decreaseCount() {
		count--; // count=count-1; or count-=1;
	}
}

public class ThreadSafeDemo2 {

	public static void main(String[] args) throws InterruptedException {

		// create a counter object
		CounterA counter = new CounterA();

		Thread t1 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		Thread t3 = new Thread(() -> {
			for (int index = 0; index < 10000; index++) {
				counter.increaseCount();
			}
		});

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("The Count : " + counter.count);
	}

}
