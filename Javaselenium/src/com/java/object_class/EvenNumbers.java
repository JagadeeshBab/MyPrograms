package com.java.object_class;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {

		int i;
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> base = new ArrayList<Integer>();
		for (i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				even.add(i);

			} else
				base.add(i);

		}
		System.out.println("even numbers are: " + even);
		System.out.println("base numbers are: " + base);
	}

}
