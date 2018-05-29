package com.java.programs.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String str= "Jagadeesh Babu E";
		
		int count=0;
		Pattern pat = Pattern.compile("[a-zA-Z]");
		Matcher mat = pat.matcher(str);
		
List list = new ArrayList();
	
		while(mat.find()) {
			//Matcher matcher = Pattern.compile("[a-z]").matcher(str);
			
			System.out.println(mat.start()+"........."+mat.end());
			count++;
			System.out.println(list.add(mat.group()));   	//boolean value
		}
		System.out.println(count);
		
		System.out.println(list);
		List small = new ArrayList();
		List capital = new ArrayList();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals("J")||list.get(i).equals("B")||list.get(i).equals("E")) {
				capital.add(list.get(i));
			}
			else
				small.add(list.get(i));
		}
		
		System.out.println(small);
		System.out.println(capital);
		String sm= small.toString();
		String cap = capital.toString();
		System.out.println(sm.toUpperCase());
		System.out.println(cap.toLowerCase());
		
		
		
		
		
		
		
		
	/*System.out.println(list);
	String str1 = list.toString();
	
	for(int i=0;i<str1.length();i++) {
		char c = str1.charAt(i);
		if(Character.isUpperCase(c)) {
		
		}
		else if(Character.isLowerCase(c)) {
			str1.toUpperCase();
		}
	}
	System.out.println(str1);
*/
		//System.out.println(str1.toLowerCase());
	/*if(str1.equals(Pattern.compile("[a-z]").matcher(str1))) {
		System.out.println(str1.toLowerCase());
	}
	else
		System.out.println(str1.toUpperCase());*/
	}
	

}
