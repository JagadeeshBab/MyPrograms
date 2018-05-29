package com.java.programs.logical;

import java.util.Scanner;

public class PrimeNumber_Check {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner scan1 = new Scanner(System.in);

		int num = scan1.nextInt();
		scan1.close();
		int a;
		for (a = 2; a <= num; a++) { // we can give lessthan or (lessthan or equal)

			if (num % a == 0) {

				break;
			}

		}
		if (num == a) {
			System.out.println(num+"is a prime number");
		}
		else
			System.out.println(num+"is not a prime number");

	}

}
