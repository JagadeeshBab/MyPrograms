package com.java.object_class;

public class ReverseString {
	
private static void continueString(String str) {
	
	String reverse = "";
	for (int i =  str.length()-1; i >=0; i--) {
		if(i==2||i==7||i==10)
			continue;
		reverse= reverse+str.charAt(i);
	}
System.out.println(reverse);
}
	public static void main(String[] args) {
						 
		ReverseString.continueString("my name is jagadeesh");
	}

}
