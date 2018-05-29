package com.java.programs;

public class Static_Impact {
		int a;
		String name;
	static	String course="java";
		
	public static void main(String[] args) {
		Static_Impact s = new Static_Impact();
		
		System.out.println("value is :"+s.a);
		System.out.println("name is :"+s.name);
		System.out.println("course is :"+s.course);
		
		s.a=24;
		s.name="rameshsoft";
		
		System.out.println("value is :"+s.a);
		System.out.println("name is :"+s.name);
		System.out.println("course is :"+s.course);
		
		Static_Impact s1 = new Static_Impact();
		
		System.out.println("value is :"+s1.a);
		System.out.println("name is :"+s1.name);
		System.out.println("course is :"+s1.course);
		
		s1.a=21;
		s1.name="Success";
		s1.course="selenium";
		System.out.println("value is :"+s1.a);
		System.out.println("name is :"+s1.name);
		System.out.println("course is :"+s1.course);
		
Static_Impact s2 = new Static_Impact();
		
		System.out.println("value is :"+s2.a);
		System.out.println("name is :"+s2.name);
		System.out.println("course is :"+s2.course);
		
		s2.a=18;
		s2.name="job";
		
		System.out.println("value is :"+s2.a);
		System.out.println("name is :"+s2.name);
		System.out.println("course is :"+s2.course);
		
	}

}
