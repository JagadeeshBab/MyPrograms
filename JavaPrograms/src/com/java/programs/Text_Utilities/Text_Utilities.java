package com.java.programs.Text_Utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text_Utilities {

	public static void main(String[] args) throws Exception {
		File file=new File("F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Text_Utilities\\data.txt");
		boolean b=file.createNewFile();
		
		
		String status = b?"file is created":"return existing file";
		System.out.println(status);
		
		FileWriter filewriter = new FileWriter(file);
		
		BufferedWriter bufferwriter = new BufferedWriter(filewriter);
		
			bufferwriter.write("Jagadeesh");
			bufferwriter.newLine();
			bufferwriter.write("Babu");
			bufferwriter.newLine();
			bufferwriter.write("Babu");
			bufferwriter.newLine();
			bufferwriter.write("Baby");
			bufferwriter.flush();
			
			
			FileReader filereader = new FileReader(file);
			BufferedReader bufferreader = new BufferedReader(filereader);
			boolean b1 = bufferreader.ready();
			
			int count=0;
			while(bufferreader.ready()) {
				
				String text = bufferreader.readLine();
				System.out.println(text);
				count++;
				
				/*switch(count) {
				case 2:System.out.println("cureent line text is:"+text);
				break;
				}*/
			}
			System.out.println(count);
					
	}
	
}
