package com.java.interview.questions;

import java.util.TreeMap;

public class TreeMap_Test {
public static void main(String[] args) {
	TreeMap t=new TreeMap();
	t.put("hello", "java");
	t.put("qtp", "null");
	t.put("java", "phython");
	t.put("job", null);
	t.put("practice", null);
	//t.put(null, null);	//null pointer exception
	//t.put(null, "babu");	//null pointer exception
	System.out.println(t);
}
}
