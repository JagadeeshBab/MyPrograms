package com.java.programs.Properties_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Property_Files {

	public static void main(String[] args) throws IOException {
		FileInputStream inputfile = new FileInputStream("F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Properties_Utilities\\OR.properties");
		Properties  propt=new Properties();
		propt.load(inputfile);
		String un=propt.getProperty("name");
		System.out.println(un);
		
		String crse=propt.getProperty("course");
		System.out.println(crse);
		
		String adrs=propt.getProperty("address");
		System.out.println(adrs);
		
		String inst=propt.getProperty("institute");
		System.out.println(inst);
		
		
		System.out.println(propt.getProperty("mobile"));
		
		
	}

}
