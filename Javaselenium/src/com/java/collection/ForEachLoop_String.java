package com.java.collection;

import java.util.ArrayList;

public class ForEachLoop_String {
public static void main(String[] args) {
	
	ArrayList l =new ArrayList();
	l.add("phython");
	l.add("236");
	l.add("seleniun");
	l.add("18");
	l.add("24");
	l.add("54");
	l.add("java");
	l.add("45");
	System.out.println(l);
	for(Object a :l) 
	{
		String string=(String)a;
		System.out.println(string);
		if(string=="java") {
			System.out.println("welcome to india");
		}
	}
	







}
}
