package com.simplilearn.collections.map.employees;

import java.util.LinkedHashMap;
import java.util.Map;

import com.simplilearn.collections.list.employee.Employee;

public class EmployeeMap {

	public static void main(String[] args) {
		// create employee map
		Map<Integer, Employee> mapOfEmployees = new LinkedHashMap<Integer, Employee>();

		// add elements into map
		mapOfEmployees.put(101, new Employee(1001, "John Smith", 534564.546, "Engineering"));
		mapOfEmployees.put(102, new Employee(1002, "Mike Smith", 134564.546, "Engineering"));
		mapOfEmployees.put(103, new Employee(1003, "Marry Smith", 134564.546, "HR"));
		mapOfEmployees.put(104, new Employee(1004, "Ava Smith", 134564.546, "HR"));

		System.out.println(mapOfEmployees);
		System.out.println(mapOfEmployees.get(101));

		// iterate map
		for (Map.Entry<Integer, Employee> entry : mapOfEmployees.entrySet()) {
			System.out.println("--------------------------");
			System.out.println("Key :> " + entry.getKey());
			System.out.println("Value :> " + entry.getValue());
		}
	}
}
