package com.java.programs.regex;

public class Upper_Lower {

	public static void main(String[] args) {
		
		String s = "SeleniumJavaPhython";
		char c1[]=s.toCharArray();
		String result="";
		for(int i=0;i<c1.length;i++) {
			
			if(Character.isLowerCase(s.charAt(i))) {
				String result1=s.substring(i, i+1);
				result=result+result1.toUpperCase();
				//System.out.println(result);
				//result=result+
			}
			else {
				String result1=s.substring(i, i+1);
				result=result+result1.toLowerCase();
				
			}
		}
	System.out.println(result);

	}

}
