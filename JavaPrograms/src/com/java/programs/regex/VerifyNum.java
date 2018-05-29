package com.java.programs.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyNum {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("09885901191");
		list.add("919885901191");
		list.add("+919885901191");
		list.add("51011912345");
		list.add("1236985468");
		list.add("0239654255");
		list.add("38955901191");
		
		
		System.out.println(list);
		String s = list.toString();
		System.out.println(s);
		String[] str = s.split(",");
		char[] ch;
		for(String str1:str) {
			 ch = str1.toCharArray();
		
		
		Pattern pat = Pattern.compile("(0/[+]?91)?[6-9][0-9]{9}");
		Matcher match = pat.matcher(s);
		
		while(match.find()&&match.group().equals(s)) {
			System.out.println("valid mobile number is"+match.group());
		}
		
		while(match.find()) {
		
			System.out.println("valid mobile number is  :" +match.group());
		}
		}
	}

}
