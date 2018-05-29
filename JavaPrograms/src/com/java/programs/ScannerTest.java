package com.java.programs;

import java.util.Scanner;

public class ScannerTest {
	int a;
	String name;
	
	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		
		System.out.println("enter a value for A");
		Scanner scanner =new Scanner(System.in);
		int a1= scanner.nextInt();
		st.a=a1;
		System.out.println("A value is :"+st.a);
		
		System.out.println("Enter the name");
		st.name = scanner.next();
		System.out.println("name is:"+st.name);
		

	}

}
