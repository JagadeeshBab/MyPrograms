package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(90);
		hs.add(20);
		hs.add(20);
		hs.add("java");
		hs.add("jagadeesh");
		hs.add("selenium");
		hs.add(20);

		System.out.println(hs);
		/*Set set = new TreeSet(hs); // getting exception when compare integer with string
		System.out.println(set);
*/		
		
		HashSet hs1 = new HashSet();
		hs1.add("90");
		hs1.add("20");
		hs1.add("20");
		hs1.add("java");
		hs1.add("jagadeesh");
		hs1.add("selenium");
		hs1.add("20");

		System.out.println(hs1);
		Set set1 = new TreeSet(hs1); 		//
		System.out.println(set1);
		Iterator itr = hs1.iterator();
		while(itr.hasNext()) {
			Object str= itr.next();
			/*if(str.equals("90"))
				break;*/
			System.out.println(str);
		}

	}

}
