package com.java.programs.logical;

public class FactorialTest {

	public static void main(String[] args) {

		// 4! is pronounced as "4 factorial", it is also called "4 bang" or "4 shriek".
		int factorial = 1;
		int num = 5;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println("factorial of " + num + "is" + factorial);
	}

}
