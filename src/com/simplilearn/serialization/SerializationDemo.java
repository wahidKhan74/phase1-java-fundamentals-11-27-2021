package com.simplilearn.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// create a object
		Employee employee = new Employee(1001, "John Smith", 4556543.43, "Engineering");
		// convert object into stream  -> byte stream to file.
		try {
			// create file output stream
			FileOutputStream file = new FileOutputStream("file-db.txt");
			// create object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			// method to serialized object
			out.writeObject(employee);
			
			System.out.println("Serialization / Write operation is completed !");
			// clean
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//TODO :: Write a list of employees into file  -> serialization
	// read list of employees from file  - deserialization

}
