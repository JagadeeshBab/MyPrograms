package com.java.programs;

class Parent{
	
	public Parent(String s) {
	System.out.println(s+"parent class parameterized constructor");
	
	}
	
	public Parent(){
		this("babu");
		System.out.println("parent class default constructor");
	}
}

class Child extends Parent{
	
	public Child() {
		super();
	}
	public void hello() {
								
		System.out.println();
	

	}
}

public class ConstructorTest {

	public static void main(String[] args) {

Child c=new Child();
	}

}
