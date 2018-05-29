package com.java.object_class;

public class AllStringMethods {

	public static void main(String[] args) {
		
		String name = "E Jagadeesh";
		String str = "e jagadeesh";
		System.out.println(name);
		System.out.println(name.charAt(3));					//a
		System.out.println(name.concat("babu"));			//E Jagadeesh babu
		System.out.println(name.length());					//11
		System.out.println(name.equals(str));				//false
		System.out.println(name.equalsIgnoreCase(str));		//true
		System.out.println(name.contains("ees"));			//true
		System.out.println(name.substring(5));				//adeesh
		System.out.println(name.substring(2, 6));			//Jaga
		System.out.println(name.toLowerCase());				//e jagadeesh
		System.out.println(name.toUpperCase());				//E JAGADEESH
		System.out.println(name.replace(name, str));		//e jagadeesh
		System.out.println(name.replace('J', 'R'));			//E Ragadeesh
		System.out.println(name.trim());					//remove the spaces at starting and ending 
		System.out.println(name.indexOf('e'));				//first letter===7
		System.out.println(name.lastIndexOf('e'));			//last letter====8
	}

}
