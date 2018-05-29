package com.java.programs;

class DesignPattern {

	private static DesignPattern pattern;

	private DesignPattern() {

	}

	public static DesignPattern getInstance() {

		if(pattern==null) {
			pattern = new DesignPattern();
		}
		return pattern;

	}

	public void greetings() {
		System.out.println("Singleton pattern is acheived");
	}
}

public class Singleton {

	public static void main(String[] args) {

		//DesignPattern obj = DesignPattern.getInstance();
		//obj.greetings();
		DesignPattern.getInstance().greetings();
	}

}
