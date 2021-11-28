package com.simplilearn.methods.bank;

public class Account {
	
	// data members
	public long accNo;
	public String username;
	public String bankName;
	public double balance;
	
	// Constructor : 1) non parameterized 2) parameterized constructor
	
	// Zero arg / non parameterized constructor
	Account(){ }
	
	// one parameter constructor
	Account(long accNo){
		this.accNo = accNo;
	}
	
	// two parameter constructor 
	Account(long accNo, String username){
		this.accNo = accNo;
		this.username= username;
	}
	
	// multi parameterized constructor
	Account(long accNo, String username, String bankName, double balance){
		this.accNo = accNo;
		this.username= username;
		this.bankName = bankName;
		this.balance = balance;
	}
}
