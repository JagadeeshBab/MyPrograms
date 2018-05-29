package com.java.object_class;

public class Hashcode {

	public static void main(String[] args) {
		
		Hashcode h = new Hashcode();
		System.out.println(h);				//com.java.object_class.Hashcode@70dea4e
		System.out.println(h.hashCode());	//118352462
		
		Hashcode h1 = new Hashcode();
		System.out.println(h1);				//com.java.object_class.Hashcode@5c647e05
		System.out.println(h1.hashCode());	//1550089733
		
		Hashcode h2 = new Hashcode();
		System.out.println(h2);				//com.java.object_class.Hashcode@33909752
		System.out.println(h2.hashCode());	//865113938
	}

}
