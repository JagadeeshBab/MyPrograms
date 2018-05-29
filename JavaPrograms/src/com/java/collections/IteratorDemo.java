package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

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
		Iterator itr = list.iterator();
		/*while (itr.hasNext()) {
			Object object = itr.next();
			if (object.equals("job")) {
				System.out.println("print value" + object);

			}

		}
*/
		while (itr.hasNext()) {
			String object = (String) itr.next();
			if (object.equalsIgnoreCase("Job")) {
				System.out.println("print value" + object);

			}

		}

	}

}
