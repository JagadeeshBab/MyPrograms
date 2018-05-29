package com.java.programs.arrays_object;

public class SingleDimensionTest {

	public static void main(String[] args) {
	
			//only homogenious elements are allowed
		float []f = new float[10];
		System.out.println(f[1]);		//default value as 0.0
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);	//default values
		}
		
		f[0] = 12;
		f[1] = 24;
		f[6] = 18.566f;
		f[3] = 21.98f;
		f[8] = 18;
		f[5] = 1;
		f[9] = 12;
		System.out.println(f);      	//hashcode
		System.out.println(f[1]);		//24.0
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);	// values
			System.out.println(f[i]);	//no hashcode for datatypes
		}
		
		String []s1 = {"jaggu","babu","charan","badri","java","selenium"};
		System.out.println(s1);         //gives hash code [Ljava.lang.String;@70dea4e
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
			System.out.println(s1[i].hashCode()); 		//hashcode of strings
		}
	}

}
