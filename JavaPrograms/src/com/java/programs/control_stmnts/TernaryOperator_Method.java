package com.java.programs.control_stmnts;

public class TernaryOperator_Method {

	
	public static int multiples() {
	
		
		for(int i=1;i<=20;i++) {
			int result=i*5;
			System.out.println(result);
		}
		return 0;
	}
	
	public static int addition() {
		
		int a=42,b=21;
		int c=(42/21)*b+a;
		System.out.println(c);
		return c;
		
	}
	public static void main(String[] args) {
		
		int a=90,b=100;
		 int value=(a<=b)? multiples() : addition() ;
		
		
	}

}
