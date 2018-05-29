package com.java.programs;

public class VarArgTest {
	
	public void add(int a)
	{
		System.out.println(a);

	}
	public void add (int a,int b)
	{
	
	
		System.out.println(a+"........."+b);
		
	}
	public void add(int... i )
	{
		System.out.println("VarArgMethod");
	}
	
	public static void main(String[] args) {
		VarArgTest v=new VarArgTest();
		v.add(5);
		v.add(4,5,6,5,5);
		v.add('a','d','d','g');
		v.add('h');
		
		
	}
	
}
