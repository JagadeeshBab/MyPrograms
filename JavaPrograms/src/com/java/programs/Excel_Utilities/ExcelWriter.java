package com.java.programs.Excel_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriter {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		String filepath = "F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Excel_Utilities\\TestData.xls";
		FileInputStream fip = new FileInputStream(filepath);
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("Sheet3");
		
		Row row0 = sheet.createRow(0);
		Cell cell00 = row0.createCell(0);
		cell00.setCellValue("jagadeesh");
		
		
		
		FileOutputStream fio = new FileOutputStream(filepath);
		workbook.write(fio);
		
		
	}

}
