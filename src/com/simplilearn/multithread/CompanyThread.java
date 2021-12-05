package com.simplilearn.multithread;

public class CompanyThread {

	public static void main(String[] args) {
		// create object of implemented class
		Bob bob = new Bob();
		// create thread from implemented object
		Thread t1 = new Thread(bob);
		t1.start();
		
		Prama prama = new Prama();
		Thread t2 = new Thread(prama);
		t2.start();
	}

}


class Bob implements Runnable {
	@Override
	public void run() {
		System.out.println("The thread Bob is running ! "+Thread.currentThread().getName());
	}
}

class Prama implements Runnable {
	@Override
	public void run() {
		System.out.println("The thread Prama is running ! " + Thread.currentThread().getName());
	}
}