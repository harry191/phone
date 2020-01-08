package com.qa.numbers.core;

public class Phone {

	private String numberString;
	
	public String Phone (String numberString) {
		
		int number = Integer.parseInt(numberString);
		
		return numberString;
	}
	
	public String getNumber() {
		return numberString;
	}
	
}
