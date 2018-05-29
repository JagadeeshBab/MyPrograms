package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DiplicateTest {

	public static void main(String[] args) {

		int[] a = { 24, 12, 18, 21, 24, 78, 92, 19, 24, 11, 45, 18, 21 };

		Set set = new TreeSet();
		List duplicates = new ArrayList();

		for (int i = 0; i < a.length; i++) {

			boolean b = set.add(a[i]);
			System.out.println(b);

			if (b) {
				System.out.println("element is added");
				set.add(a[i]);
			} else {

				System.out.println("element is not added");
				duplicates.add(a[i]);
			}

		}
		System.out.println(set);
		System.out.println(duplicates);
	}

}
