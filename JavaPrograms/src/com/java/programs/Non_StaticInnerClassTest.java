package com.java.programs;

import com.java.programs.OuterClass.InnerClass;

class OuterClassAB{
	
	static int a=90;
	 public int getA() {
		
		System.out.println("outer class getA method:"+ a);
		return a;
		
	}
	
	 class InnerClass{
		int a=900;
		public int getB() {
			
			System.out.println("inner class getB method:"+a);
			
			return a;
			
		}
		
		public void greetings() {
			
			System.out.println("inner class greetings :");
		}
	}
}
public class Non_StaticInnerClassTest {

	public static void main(String[] args) {
	
		System.out.println(OuterClass.a);
		OuterClassAB oc = new OuterClassAB();
		
		oc.getA();
		
		OuterClassAB.InnerClass ic = oc.new InnerClass();
		
		System.out.println(ic.a);

	}

}
