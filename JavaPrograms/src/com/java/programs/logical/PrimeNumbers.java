package com.java.programs.logical;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		// printing prime numbers
		int i;
		int j;
int numOf = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value for primenumbers");
		int count = scan.nextInt();

		for (i = 2; i < count; i++) {

			for (j = 2; j < i; j++) {

				if (i % j == 0) {

					break;
				}

			}
			if (i == j) {
				System.out.println("prime numbers are: " + i);
				numOf++;
				if(numOf==10)					//condition for first 10 primenumbers
					break;
			}

		}
			System.out.println("the number of prime numbers is :" +numOf); // gives number of primenumbers

			}

}
