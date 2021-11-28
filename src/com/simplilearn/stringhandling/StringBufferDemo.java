package com.simplilearn.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		// string with string buffer
		StringBuffer text = new StringBuffer("Today is a good day!");
		System.out.println(text);

		// modification on string
		text.append(" Happy to work !");
		System.out.println(text);

		// replace text
		text.replace(0, 1, "t");
		System.out.println(text);

		// delete text
		text.delete(0, 2);
		System.out.println(text);

		// insert text
		text.insert(0, "Welcome, ");
		System.out.println(text);

	}
}
