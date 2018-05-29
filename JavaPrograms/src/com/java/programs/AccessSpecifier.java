package com.java.programs;


class Specifier{
	static public int a=21;
	static public int b=24;
	
	int d=1000;
	
	public static void add()
	{
		int c=a+b;
		System.out.println(c);
		//int f=a+b+d: //compile time error  d is non static used in static method
	}
	
	public int addOne()
	{
		int c=a+b+d;
		return c;
		
	}
}

class AccessSpecifier {
	public static void main(String[] args) {
		Specifier.add();
		Specifier as=new Specifier();
		as.addOne();
	}
	
}

