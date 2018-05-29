package com.java.programs;

class OneA{
	int id ;
	String name;
	public OneA(int id1,String name1) {
		id=id1;
		name=name1;
		System.out.println(id+ ":int string constructor:" +name);
	}
	
	public OneA() {
		System.out.println("default constructor");
	}
	
	public OneA(String name1) {
		
		name=name1;
		System.out.println("sting constructor:" + name);
	}
	
}

public class ConstructorOverload {

	public static void main(String[] args) {
		
		OneA a= new OneA();
		OneA a1= new OneA("selenium");
		OneA a2= new OneA(21,"java");
		OneA a3= new OneA('j',"practice");		//automatic promotion concept followed here
	}

}
