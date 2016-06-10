package com.goit.offline3.Diagram333;

public class NotEnoughInstrument extends Exception {
	private final String message;
	
	NotEnoughInstrument(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
