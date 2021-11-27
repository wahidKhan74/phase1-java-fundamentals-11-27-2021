package com.simplilearn.acessmodifier;

public class PrivateAccessModifierDemo {

	public static void main(String[] args) {
		// create object account
		Account account = new Account();
		// access private data variables
		//  account.balance;   // Account.balance is not visible
		// account.password;   // Account.password is not visible
		
		// access private methods
		// account.showPass();  // The method showPass() from the type Account is not visible
		// account.showUsername();  // The method showUsername() from the type Account is not visible
		account.showId();
	}

}

class Account {
	
	// data members 
	private long id = 123234545;
	private double balance = 656344;
	private String username ="mike12K";
	private String password ="mik@#!%";
	
	//private methods
	private String showUsername() {
		return username;
	}
	
	private String showPass() {
		return password;
	}
	
	public void showId() {
		System.out.println("User Id : "+id);
	}
	
	Account() {}
	// private constructor
	// Note : Private Constructor based class can not be instantiated.
	// private Account() {}
	
}
