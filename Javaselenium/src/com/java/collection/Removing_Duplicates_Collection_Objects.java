package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Removing_Duplicates_Collection_Objects {
public static void main(String[] args) {
	List list =new ArrayList();
	list.add(25);
	list.add(56);
	list.add(89);
	list.add(3);
	list.add(39);
	list.add(12);
	list.add(3);
	list.add(39);
	list.add(12);
	list.add(24);
	//1st approach
	Set set =new TreeSet(list);
	System.out.println(set);
	
	//2nd approach
	Set set1 =new TreeSet();
	set1.addAll(list);
	System.out.println(set1);
	
	//3rd approach
	Set set2=new TreeSet();
	Set set3=new TreeSet();
		for (int i=0;i<list.size();i++)
			{
				//set2.add(list.get(i));
			boolean b=set2.add(list.get(i));
			if(b) {
				System.out.println("NOT A DUPLICATE:"+list.get(i));
			}
			else
			{
				System.out.println("DUPLICATE ELEMENTS:"+list.get(i));
				set3.add(list.get(i));
			}
			//System.out.println(list.get(i));
			
			
			}
		System.out.println(set2);
		System.out.println("duplicate elements are:"+set3);
		}
}
