package com.java.object_class;

public class Reverse_String {

	public static void main(String[] args) {
		// 1.with API
		String str = "madam";
		// StringBuffer rev = new StringBuffer(str);// this is one way of append
		// directly
		// rev.reverse();
		String str2 = new StringBuffer(str).reverse().toString();
		System.out.println("reverse string(with API) is :" + str2);
		if (str2.equals(str)) {
			System.out.println("Yes" + str + " is  palindrome");
		} else {
			System.out.println("No" + str + " is not a palindrome");
		}

		// 2.without API
		String s2 = "jagadeesh";
		String reverse2 = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			reverse2 = reverse2 + s2.charAt(i);
			// System.out.println("reverse string(without API) is :"+reverse2);
		}
		System.out.println("reverse string(without API) is :" + reverse2);

		if (reverse2.equals(s2)) {
			System.out.println("given string is palindrome");
		} else {
			System.out.println("given string is not a palindrome");
		}
	}

}
