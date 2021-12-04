package com.simplilearn.collections.set.employees;

import java.util.LinkedHashSet;
import java.util.Set;

import com.simplilearn.collections.list.employee.Employee;

public class EmployeeSet {

	public static void main(String[] args) {
		// create multiple employee object
		Employee employee1 = new Employee(1001, "John Smith", 534564.546, "Engineering");
		Employee employee2 = new Employee(1002, "Marry William", 134564.546, "Engineering");
		Employee employee3 = new Employee(1003, "Ava Smith", 834564.546, "HR");
		Employee employee4 = new Employee(1004, "David Bakum", 124564.546, "HR");
		Employee employee5 = new Employee(1005, "Amar Sign", 334564.546, "Engineering");

		// create a set of employees
		Set<Employee> setOfEmployees = new LinkedHashSet<Employee>();

		// add elements in set
		setOfEmployees.add(employee1);
		setOfEmployees.add(employee2);
		setOfEmployees.add(employee3);
		setOfEmployees.add(employee4);
		setOfEmployees.add(employee5);
		setOfEmployees.add(employee1);

		System.out.println(setOfEmployees);

		// enhanced for loop
		for (Employee emp : setOfEmployees) {
			System.out.println("-------------------------");
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.salary);
			
		}
	}
}
