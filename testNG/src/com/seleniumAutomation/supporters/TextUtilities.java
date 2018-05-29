package com.seleniumAutomation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextUtilities {

	private String filePath;
	private FileWriter filewriter;
	private BufferedWriter bufferwriter;
	private FileReader filereader;
	private BufferedReader bufferreader;
	
	public TextUtilities(String filePath) throws IOException {
		this.filePath=filePath;
		File file = new File(filePath);
		
		String fileCreation=(file.createNewFile())?"create new file" : "return existing file";
		System.out.println(fileCreation);
		
		filewriter = new FileWriter(file);
		bufferwriter = new BufferedWriter(filewriter);
		
		filereader = new FileReader(file);
		bufferreader = new BufferedReader(filereader);
				
		
	}
	public void closeResources() throws IOException {
		String s = (filewriter!=null && bufferreader!=null )? close() : "pointing to null";
		
	}
	
	public void writeIntData(int data) throws IOException
	{
		if (isFWBR()) {
			filewriter.write(data);
			filewriter.flush();
		}
		
	}
	public void writeStringData(String data) throws IOException
	{
		if (isFWBR()) {
			filewriter.write(data);
			filewriter.flush();
		}
		
	}

	public boolean isFWBR() {
		boolean value = (filewriter!=null && bufferreader!=null )? true : false;
		return value;
		
	}
	public String close() throws IOException {
		
		filewriter.close();
		bufferreader.close();
		return "";
		
	}
	
	public String getSingleLineData() throws IOException
	{
		String lineData = null;
		
		if (isFWBR())
			lineData = bufferreader.readLine();
		return lineData;
	}

	public List getTotalFileData() throws IOException {
		List fileData = new ArrayList();
		if (isFWBR()) {
			
			while(bufferreader.ready())
			{
				String value = bufferreader.readLine();
				fileData.add(value);
			}
			
		}
		return fileData;
	}

	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		TextUtilities t = new TextUtilities("");
		List list = t.getTotalFileData();
		System.out.println("Total no of lines in a file is: " +list.size());
		System.out.println(list.get(5));


	}

}
