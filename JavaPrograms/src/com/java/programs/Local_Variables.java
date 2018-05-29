package com.java.programs;

class Demo{
	
	static int a =90;
	static int b=100;
	public  int hello(){
		 final int a=65;
		 		// a=34;	compiletime error	we cant reassign a value to final variable 
		int c=a+b;			//here c is declaration type
		
		System.out.println(c);
		
		return c;
	}

	public int hai() {
		//c=a+b; //compile time error :  c is not declared in method level
		return a;
		
	}
}
public class Local_Variables {

	public static void main(String[] args) {
		

	}

}
