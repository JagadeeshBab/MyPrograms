package com.java.programs.arrays_object;

public class Object_Array {

	public static void main(String[] args) {
		//both homogenious and hetro genious
		Object[] obj = new Object[10];
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);	//default values
		}
		
		obj[0] = 1229837;
		obj[1] = 24;
		obj[6] = "jaggu";
		obj[3] = "nani";
		obj[8] = 18.89272f;
		obj[5] = 1;
		obj[9] = 12.738;
		System.out.println(obj);      	//hashcode
		System.out.println(obj[1]);		//24.0
		for(int i=0;i<obj.length;i++) {
			
			//we have hascode for strings but not for datatypes
			//if we try to get hashcode of datatypes we will get exception
			
			//System.out.println(obj[i].hashCode());	// hascode of values
			System.out.println(i +"......." +obj[i]);	
			
		
		}
		

	}

}
