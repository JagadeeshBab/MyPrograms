package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Removing_Duplicates_Arrays {
	
	public static void main(String[] args) {
		int[] a = {5,54,5,4,6,9,36,2,143,9,2,5,36,143,92,21,18,16,4};
		List duplicates =new ArrayList();
		//Set duplicates =new TreeSet();        //duplicates values in sorting order
		Set set =new TreeSet();
		for(int i=0;i<a.length;i++)
		{
			//boolean b=set.add(a[i]);
			if(set.add(a[i]))
			{
				System.out.println("not a duplicate");
			}
			else 
			{
				System.out.println("duplicate element:"+a[i]);
				duplicates.add(a[i]);
			}
		}
		System.out.println(duplicates);
		System.out.println(set); 
		 
		List list =new ArrayList(set);
		System.out.println("MIN VALUE:"+list.get(0));
		System.out.println("MAX VALUE:"+list.get(list.size()-1));
		
		
	}

}
