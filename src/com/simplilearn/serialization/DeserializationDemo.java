package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		try {
			// read file to de serialized object
			FileInputStream file = new FileInputStream("file-db.txt");
			// create input object
			ObjectInputStream input = new ObjectInputStream(file);
			// method de serialization the object
			Employee employee = (Employee) input.readObject();
			System.out.println("Deserialization is completed !");
			
			System.out.println("Emp Id : "+employee.id);
			System.out.println("Emp Name : "+employee.name);
			System.out.println("Emp Dept : "+employee.dept);
			System.out.println("Emp Salary : "+employee.salary);
			
			//clean up
			input.close();
			file.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
