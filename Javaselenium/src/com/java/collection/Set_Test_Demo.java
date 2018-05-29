package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_Test_Demo {
public static void main(String[] args) {
	Set set =new HashSet();
	System.out.println(set.add("java"));
	System.out.println(set.add("phython"));
	System.out.println(set.add("selenium"));
	System.out.println(set.add("qtp"));     	
	System.out.println(set.add("practice"));
	System.out.println(set.add("job"));
	System.out.println(set.add("java"));
	System.out.println(set.add("qtp"));			//duplicates not allowed
	System.out.println(set.add(5));				//insertion order is not prserverd in Hashset
	System.out.println(set);					//[practice, java, selenium, phython, 5, qtp, job]

	//converting set into list inorde to perform adding new objects 
		List list =new ArrayList(set);
		System.out.println(list);				//[practice, java, selenium, phython, 5, qtp, job]
		list.add(2, "rameshsoft");
		
		set=new HashSet(list); 					//reassigning of set
		System.out.println(set);				//[practice, rameshsoft, java, selenium, phython, 5, qtp, job]
	
	LinkedHashSet set1=new LinkedHashSet();
	//Set set1 =new LinkedHashSet();
	System.out.println(set1.add("java"));
	System.out.println(set1.add("phython"));
	System.out.println(set1.add("selenium"));
	System.out.println(set1.add("qtp"));     	
	System.out.println(set1.add("practice"));
	System.out.println(set1.add("job"));
	System.out.println(set1.add("java"));
	System.out.println(set1.add("qtp"));		//duplicates not allowed
	System.out.println(set1.add(5));			//insertion order is  prserverd in LinkedHashset
	System.out.println(set1);				//[java, phython, selenium, qtp, practice, job, 5]

	
	List list1 =new ArrayList(set1);
	System.out.println(list1);			//[java, phython, selenium, qtp, practice, job, 5]

	list1.add(3, "perfection");
	set1 =new LinkedHashSet(list1);
	System.out.println(set1);			//[java, phython, selenium, perfection, qtp, practice, job, 5]
	






}
}
