package com.java.programs.Properties_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writing_Property_Files {

	public static void main(String[] args) throws IOException {
		FileInputStream inputfile = new FileInputStream("F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Properties_Utilities\\OR.properties");
		
		Properties prop=new Properties();
		prop.load(inputfile);
		prop.setProperty("name", "jagadeesh");
		prop.setProperty("course", "java");
		prop.setProperty("address", "hindupur");
		prop.setProperty("institute", "rameshsoft");
		prop.setProperty("place", "hindupur");
		prop.setProperty("mobile", "9885901191");
		
		
		
		FileOutputStream outputfile=new FileOutputStream("F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Properties_Utilities\\OR.properties");
		prop.store(outputfile, "successfully data added to OR file");
		

	}

}
