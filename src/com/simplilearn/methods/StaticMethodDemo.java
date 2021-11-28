package com.simplilearn.methods;

public class StaticMethodDemo {

	public static void main(String[] args) {

		// method calling
		StaticMethodDemo.showMessage();
		StaticMethodDemo.displayAuthor("John Smith");
		StaticMethodDemo.displayDetails("john@gmail.com", "Book Author");
		
		System.out.println("---------------");
		//create a employee object
		Employee emp = new Employee(10001, 5345654.675, "John Smith");
		showEmployee(emp);

	}

	// methods deceleration 1) parameterized methods 2) non-parameterized methods
	// static
	// non-parameterized / zero params methods
	public static void showMessage() {
		System.out.println(" :: Welcome to Java Methods ::");
	}

	// one parameterized methods
	public static void displayAuthor(String name) {
		System.out.println(" :: @Author :: " + name);
	}

	// two parameterized methods
	public static void displayDetails(String email, String description) {
		System.out.println(" :: @Author email :: " + email +" description :: "+description);
	}

	// 
	public static void showEmployee(Employee emp) {
		System.out.println("Id :: "+emp.id +" , name :: "+emp.name +" , Salary :: "+emp.salary);
	}
}