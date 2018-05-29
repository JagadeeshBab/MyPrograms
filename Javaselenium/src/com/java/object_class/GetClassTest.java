package com.java.object_class;


interface DemoSix{
	
}

class DemoNine implements DemoSix{
	
}


public class GetClassTest  extends DemoNine{

	public static void main(String[] args) {
		
		DemoSix d = new DemoNine();
		System.out.println(d.getClass());				//class com.java.object_class.DemoNine
	
		System.out.println(d.getClass().getName());		//com.java.object_class.DemoNine
		
		DemoNine d1 = new DemoNine();
		System.out.println(d1.getClass());				//class com.java.object_class.DemoNine
		System.out.println(d1.getClass().getName());	////com.java.object_class.DemoNine
	
	}

}
