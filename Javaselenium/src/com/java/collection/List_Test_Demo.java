package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Test_Demo {
public static void main(String[] args) {
	List list =new ArrayList();
	list.add("24041992");
	list.add('b');
	list.add('a');
	list.add('b');
	list.add('u');
	list.add("java");
	list.add("selenium");
	System.out.println(list.add("job"));	//this is for boolean Value
	list.add(0, "My name is");

	System.out.println(list);
	System.out.println(list.get(6));;    //this is for printing value based on index
	
	ArrayList list1 =new ArrayList();
	list1.add(12);
	list1.add("phython");
	list1.add("sachin");
	list1.add("dhoni");
	list1.add("kohli");
	list1.addAll(2, list);
	System.out.println(list1);
	System.out.println(list1.get(5));
	
	LinkedList list2 =new LinkedList();
	
	list2.add(12);
	list2.add("chiru");
	list2.add("charan");
	list2.add("nani");
	list2.add("ravi");
	list2.add(null);
	list2.addAll(5, list);
	System.out.println(list2);
	System.out.println(list2.get(5));
	}
}

