package com.simplilearn.collections.set.employees;

public class Employee {
	
	public int id;
	public String name;
	public double salary;
	public String dept;
	
	public Employee() {};
	
	public Employee(int id,String name, double salary,  String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
