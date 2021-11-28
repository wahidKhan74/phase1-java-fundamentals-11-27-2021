package com.simplilearn.arrays.examples;

import java.util.Scanner;

public class UserOperation {
	
	static String[] usernames = { "John Smith", "Mike Smith", "David Miller", "Rajan Ram", "Robert Kim" };
	static int[] userIds = { 1001, 1002, 1003, 1004, 1005 };
	static double[] balances = { 76552.3, 23423.456, 54654.67, 343.34, 8345.456 };
	static boolean until = true;
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println(" :: Welcome to show deails feature of Bank ABC :: ");
		System.out.println("-----------------------------------------");
		
		while(until) {
			System.out.println(" :: Enter a userId :: ");			
			int userId = input.nextInt();
			findUser(userId);
		}

	}

	private static void findUser(int userId) {
		int match =0;
		for (int index = 0; index < userIds.length; index++) {
			if(userIds[index]==userId) {
					System.out.println("User is found with details");
					System.out.println("The user Id : "+userIds[index]);
					System.out.println("The user name : "+usernames[index]);
					System.out.println("The user balance : "+balances[index]);
					match++;
					until = false;
			}
		}
		if(match==0) {
			System.out.println("User is not found with userId "+ userId);
		}		
	}

	//find a user details with arrays
	
}
