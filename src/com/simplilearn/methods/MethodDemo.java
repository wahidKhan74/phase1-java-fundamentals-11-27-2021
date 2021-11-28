package com.simplilearn.methods;

public class MethodDemo {

	public static void main(String[] args) {

		// method calling
		MethodDemo md = new MethodDemo();
		md.showMessage();
		md.displayAuthor("John Smith");
		md.displayDetails("john@gmail.com", "Book Author");
		
		System.out.println("---------------");
		//create a employee object
		Employee emp = new Employee(10001, 5345654.675, "John Smith");
		md.showEmployee(emp);
		
		// md.showMessage();
		// md.displayAuthor("Kim Smith");
	}

	// methods deceleration 1) parameterized methods 2) non-parameterized methods
	// Non static
	// non-parameterized / zero params methods
	public void showMessage() {
		System.out.println(" :: Welcome to Java Methods ::");
	}

	// one parameterized methods
	public void displayAuthor(String name) {
		System.out.println(" :: @Author :: " + name);
	}

	// two parameterized methods
	public void displayDetails(String email, String description) {
		System.out.println(" :: @Author email :: " + email +" description :: "+description);
	}

	// 
	public void showEmployee(Employee emp) {
		System.out.println("Id :: "+emp.id +" , name :: "+emp.name +" , Salary :: "+emp.salary);
	}
}

class Employee {
	public int id;
	public double salary;
	public String name;
	
	Employee(int id, double salary, String name){
		this.id= id;
		this.name = name;
		this.salary= salary;
	}
}
