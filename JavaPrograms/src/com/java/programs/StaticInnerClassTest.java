package com.java.programs;

import com.java.programs.OuterClass.InnerClass;

class OuterClass{
	static int a=90;
	 public int getA() {
		
		System.out.println("outer class getA method:"+ a);
		return a;
		
	}
	
	static class InnerClass{
		int a=900;
		public int getB() {
			
			System.out.println("inner class getB method:"+a);
			
			return a;
			
		}
		
		public static void greetings() {
			
			System.out.println("inner class greetings :");
		}
	}
}
public class StaticInnerClassTest {

	public static void main(String[] args) {
		
		System.out.println(OuterClass.a);
		OuterClass oc = new OuterClass();
		oc.getA();
		
		OuterClass.InnerClass.greetings();
		OuterClass.InnerClass oi = new OuterClass.InnerClass();
		oi.getB();
		
		InnerClass ic1 = new OuterClass.InnerClass();    //inner class object
		System.out.println(oi.a);
		
		
		

	}

}