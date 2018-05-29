package com.java.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test {
public static void main(String[] args) {
	TreeSet ts =new TreeSet();
	//Set ts=new TreeSet();
	ts.add(54);
	ts.add(21);
	ts.add(18);
	ts.add(21);
	ts.add(04);
	ts.add(07);
	ts.add(16);
	ts.add(54);
	System.out.println(ts);
	
	
	TreeSet ts1 =new TreeSet();
	//Set ts=new TreeSet();
	ts1.add("java");
	ts1.add("phython");
	ts1.add("selenium");
	ts1.add("qtp");
	ts1.add("ruby");
	ts1.add("testing");
	ts1.add("qtp");
	ts1.add("java");
	ts1.add("12");
	System.out.println(ts);

	
	
}
}
