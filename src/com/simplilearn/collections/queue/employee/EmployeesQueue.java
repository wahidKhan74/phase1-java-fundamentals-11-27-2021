package com.simplilearn.collections.queue.employee;

import java.util.ArrayDeque;
import java.util.Queue;

import com.simplilearn.collections.list.employee.Employee;

public class EmployeesQueue {

	public static void main(String[] args) {
		// create multiple employee object
		Employee employee1 = new Employee(1001, "John Smith", 534564.546, "Engineering");
		Employee employee2 = new Employee(1002, "Marry William", 134564.546, "Engineering");
		Employee employee3 = new Employee(1003, "Ava Smith", 834564.546, "HR");
		Employee employee4 = new Employee(1004, "David Bakum", 124564.546, "HR");
		Employee employee5 = new Employee(1005, "Amar Sign", 334564.546, "Engineering");

		Queue<Employee> queueOfEmployees = new ArrayDeque<Employee>();

		queueOfEmployees.add(employee1); // head element
		queueOfEmployees.add(employee2);
		queueOfEmployees.add(employee3);
		queueOfEmployees.add(employee4);
		queueOfEmployees.add(employee5);

		// top / peek element
		System.out.println("Head :> " + queueOfEmployees.peek());
		System.out.println("Head :> " + queueOfEmployees.element());
		System.out.println("----------------------------");
		// remove and print head
		System.out.println("Removed element / head :> " + queueOfEmployees.poll());
		System.out.println("Head :> " + queueOfEmployees.element());
		System.out.println("----------------------------");
		
		for (Employee employee : queueOfEmployees) {
			// System.out.println(employee);
			System.out.println("--------------------");
			System.out.println("Employee Id : " + employee.id);
			System.out.println("Employee Name : " + employee.name);
			System.out.println("Employee Dept : " + employee.dept);
			System.out.println("Employee Salary : " + employee.salary);
		}
		
		
	}

}
