package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate_ArrayList {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("jaggu");
		list.add("job");
		list.add("selenium");
		list.add("phython");
		list.add("practice");
		list.add("job");
		list.add("babu");
		list.add("phython");
		list.add("jaggu");
		
		System.out.println(list);
		
		//1
		Set set = new TreeSet();
		set.addAll(list);
		System.out.println(set);
		
		//2
		Set set2 = new TreeSet(list);
		System.out.println(set2);
		
		//3
		Set set3 = new TreeSet();
		for (int i = 0; i < list.size(); i++) {
			
			set3.add(list.get(i));
			
		}
		System.out.println(set3);
	}

}
