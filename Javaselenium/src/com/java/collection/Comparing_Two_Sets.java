package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Comparing_Two_Sets {

	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet();
		set.add("jagadeesh");
		set.add("babu");
		set.add("baby");
		set.add("ironman");
		set.add("spiderman");
		set.add("antman");
		
		//Set<String> set1=new HashSet();
		Set<String> set1=new LinkedHashSet();
		set1.add("jagadeesh");
		set1.add("babu");
		set1.add("baby");
		set1.add("ironman");
		set1.add("spiderman");
		set1.add("antman");
		
		
		System.out.println(set);
		System.out.println(set1);
		
		List<String> list=new ArrayList(set);
		List<String> list1=new ArrayList(set1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i);
			for (int j = 0; j < list1.size(); j++) {
				
				if(list.get(i).equals(list1.get(j))) {
					System.out.println("values are equal:"+j);
					break;
				
				}
//				else
//				{
//					System.out.println("values are not equal:"+j);
//				}
				//System.out.println(j);
				
			//System.out.println(list1.get(j));
			}
		//System.out.println(i);
			//System.out.println(list.get(i));
	
		}
	}	
}

