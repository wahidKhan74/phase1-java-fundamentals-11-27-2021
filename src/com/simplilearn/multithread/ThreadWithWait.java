package com.simplilearn.multithread;

class Customer {

	double balance = 1000.0;

	// deposit operation
	public synchronized void deposit(double amount) {
		System.out.println("Going to deposit ...");
		balance += amount;
		System.out.println("Deposit is completed ! & new balance is " + balance);
		notify();
	}

	// withdraw operation
	public synchronized void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds !");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("-----------------------------------");
		System.out.println("Withdraw is completed ! & new balance is : " + balance);
	}

	// show balance operation
	public synchronized void showBalance() {
		System.out.println("-----------------------------------");
		System.out.println("The Account balance is : " + balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) {
		// Customer object
		Customer customer = new Customer();

		// create threads
		Thread t1 = new Thread(() -> {
			customer.withdraw(3000);
		});

		Thread t2 = new Thread(() -> {
			customer.deposit(5000);
		});

		Thread t3 = new Thread(() -> {
			customer.showBalance();
		});

		
		t1.start();
		t2.start();
		t3.start();
	}

}
