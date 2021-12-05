package com.simplilearn.multithread;

public class OrganizationThread {
	
	public static void main(String[] args) {
		// create a new thread for john
		John t1 = new John();
		t1.start();
		
		// create a new thread for mike
		Mike t2 = new Mike();
		t2.start();
		
		// create a new thread for sam
		Sam t3 = new Sam();
		t3.start();
	}
}

class John extends Thread {
	
	@Override
	public void run() {
		System.out.println("John Thread is ruuning ! " + Thread.currentThread().getName());
	}
}

class Mike extends Thread {
	
	@Override
	public void run() {
		System.out.println("Mike Thread is ruuning ! " + Thread.currentThread().getName());
	}
}

class Sam extends Thread {
	
	@Override
	public void run() {
		System.out.println("Sam Thread is ruuning ! "+Thread.currentThread().getName());
	}
}