package com.simplilearn.methods.bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// create account object
		Account account = new Account(100011, "John Snow", "Iron Bank", 20000.345);

		// create bank account object
		BankOperation operation = new BankOperation();

		// step 1. collect input from user console
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println(" :: Welcome to "+account.bankName+" :: ");
		System.out.println("--------------------------------");

		System.out.println(" :: Select Bank Operations :: ");
		System.out.println(" :: 1) Show Balance 2) Deposit 3) withdraw :: ");
		int option = input.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("---------------");
			operation.showBalance(account);
			System.out.println("---------------");
			break;
		case 2:
			System.out.println("---------------");
			System.out.println("Enter the deposit amount");
			int damount = input.nextInt();
			operation.depositAmount(account, damount);
			operation.showBalance(account);
			System.out.println("---------------");
			break;
		case 3:
			System.out.println("---------------");
			System.out.println("Enter the withdraw amount");
			int wamount = input.nextInt();
			operation.withdrawAmount(account, wamount);
			operation.showBalance(account);
			System.out.println("---------------");
			break;
		default:
			break;
		}
	}

}
