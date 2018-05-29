package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class KeySet_Iterator {

	public static void main(String[] args) {
		
		// TreeMap map = new TreeMap();
		LinkedHashMap map = new LinkedHashMap(); // insertion order preserved
		map.put(3, "baby");
		map.put(1, "jaggu");
		map.put(2, "babu");
		map.put(6, "selenium");
		map.put(4, "nani");
		map.put(5, "job");
		// map.put("7", "practice"); //classcastexception
		map.put(7, "practice");
		System.out.println(map);
		//In map we dont have Iterator so we need to get keyset in to the list and then iterate
		Set keys = map.keySet();
		System.out.println(keys);
		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
			Object value = map.get(key);
			System.out.println(key + "............" + value);
		}
	}

}
