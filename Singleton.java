package com.goit.webinar56.q10;

public class Singleton {
	private static Singleton instance;
	// private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	

}
