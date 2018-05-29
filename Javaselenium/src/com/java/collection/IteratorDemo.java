package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("selenium");
		list.add("java");
		list.add("phython");
		list.add("rameshsoft");
		list.add("456");
		list.add("mysql");
		list.add("oracle");
		list.add("java");
		System.out.println(list);
		
		Iterator iterator=list.iterator();
		//int interator=0;
		while(iterator.hasNext())
		{
			String str=(String)iterator.next();		//type casting to String
			System.out.print(str+" ");
			
		}
		
		
		
		
	}

}
