package com.java.programs.Excel_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.RowSetMetaData;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderTwo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = null;
		String filepath = "F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Excel_Utilities\\TestData.xls";
		try {
			fis = new FileInputStream(filepath);

		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		//particular cell data
		Cell celldata= workbook.getSheet("Sheet2").getRow(0).getCell(0);
		System.out.println(celldata);

		
		//total  data
		 List totaldata = new ArrayList();
		Sheet sheet = workbook.getSheet("Sheet2");
		for (int i = 0; i<=sheet.getLastRowNum(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j <row.getLastCellNum(); j++) {
			Cell cell = row.getCell(j);
			totaldata.add(cell);
			}
			
		}
		System.out.println(totaldata);
		
		
		//one column data :for this we should give cell value is 0 nothing but 0yh column datawe are getting
		
		for (int i = 0; i <sheet.getLastRowNum(); i++) {
			Cell rowdata= workbook.getSheet("Sheet2").getRow(i).getCell(0);
			
			System.out.println(rowdata);	
		}
		
		//one row data
		
		Row row = sheet.getRow(6);
		
		for (int i = 0; i <row.getLastCellNum(); i++) {
			Cell cell = row.getCell(i);
			System.out.println(cell);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
