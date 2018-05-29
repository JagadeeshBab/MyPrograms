package com.java.programs.arrays_object;

public class TwoDimensionTest {

	public static void main(String[] args) {
		
		
		//only homogenious elements are allowed
			String[][] str = new String[2][2];
			
			str[1][1] = "jaggu";
			str[1][0] = "hulk";
			str[0][1] = "baby";
			str[0][0] = "babu";
			System.out.println(str.length);  //gives length as 2
			System.out.println(str);		//gives hashcode of array
			System.out.println(str[1][0]);	//hulk
			for (int i = 0; i < str.length; i++) {
				//System.out.println(str[i]);		//it gives hashcode
				for (int j = 0; j < str.length; j++) {
					System.out.println(str[i][j]);
				}
			}

	}

}
