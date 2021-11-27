package com.simplilearn.acessmodifier;

public class DefaultAccessmodifierDemo {

	public static void main(String[] args) {
		
		Brother brother = new Brother();
		
		System.out.println("The Brother Money :: "+ brother.money);
		System.out.println("The Brother shoes :: "+ brother.shoes);
		brother.showAll();
	}

}


class Brother {
	
	// default properties
	double money = 3454576;
	String shoes ="XYZ";
	
	// default method
	void showAll() {
		System.out.println("The Money :: "+ money +" Shoes :: "+shoes);
	}
	
	//default constructor
	Brother(){ }
}