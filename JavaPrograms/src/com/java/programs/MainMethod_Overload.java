package com.java.programs;

public class MainMethod_Overload {

	public static void main(String[] args) {
		
		System.out.println("String[] args");
		main(24);
		main("jagadeesh");
		
	}

	public static void main(int a) {
		
		System.out.println("int value");
		
	}


	public static void main(String name) {
		
		System.out.println("name");
		
	}
}
