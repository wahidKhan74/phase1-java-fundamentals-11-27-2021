package com.simplilearn.methods.bank;

public class BankOperation {
	
	// show balance
	public double showBalance(Account account) {
		System.out.println("The account " + account.accNo 
				+ " with username " +account.username
				+ " has Balance : "+account.balance);
		return account.balance;
	}
	
	
	// withdraw operation
	public double withdrawAmount(Account account, double amount) {
		if(amount>0 && amount < account.balance) {
			account.balance -= amount;  // account.balance = account.balance - amount;
			return account.balance;
		} else {
			System.out.println("Invalid withdraw amount !");
			return 0;
		}
	}
	
	// deposit operation
	public double depositAmount(Account account, double amount) {
		if(amount>0) {
			account.balance += amount;  // account.balance = account.balance + amount;
			return account.balance;
		} else {
			System.out.println("Invalid deposit amount !");
			return 0;
		}
	}
	// fd operation
}
