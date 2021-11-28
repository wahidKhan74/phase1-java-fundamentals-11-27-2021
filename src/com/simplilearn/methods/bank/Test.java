package com.simplilearn.methods.bank;

public class Test {

	public static void main(String[] args) {

		// create account object
		Account account = new Account(100011, "John Snow", "Iron Bank", 20000.345);

		// create bank account object
		BankOperation operation = new BankOperation();

		operation.showBalance(account);
		System.out.println("---------------");

		operation.withdrawAmount(account, 3000);
		operation.showBalance(account);

		System.out.println("---------------");

		operation.depositAmount(account, 3000);
		operation.showBalance(account);

	}

}
