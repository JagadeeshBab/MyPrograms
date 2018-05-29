package com.java.collection;

import java.util.LinkedHashSet;

public class ForEachLoop_CollectionAndArrays {
public static void main(String[] args) {
	LinkedHashSet l=new LinkedHashSet();	
	l.add(07);
	l.add(52);
	l.add(24);
	l.add(21);
	l.add(18);
	l.add(24);
	l.add(95);
	l.add(07);
	l.add(04);
	System.out.println(l);
	
	for(Object abc:l) 
	{
		Integer i=(Integer)abc;
		System.out.println(i);
		if(i==24) 
		{
			System.out.println("number" + i );
		}
	}
	
String[] s= {"java","selenium","java with selenium","phython","manual testing"};

	/*	for(int i=0;i<s.length;i++) 
		{
			System.out.println(s[i]);
		}*/
		
		
		for(String str:s) {
			System.out.println(str);
		}





}
}
