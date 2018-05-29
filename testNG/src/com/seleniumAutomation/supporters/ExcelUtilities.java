package com.seleniumAutomation.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
private String filePath;
private FileInputStream fip;
private Workbook workbook;
private Cell cell;
private Row row;
private Sheet sheet;



	public ExcelUtilities(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		this.filePath=filePath;
		fip = new FileInputStream(filePath);
		workbook = WorkbookFactory.create(fip);
		
	}
	
	public Sheet getSheet(String sheetName) {
		Sheet sheet = null;
		if(workbook!=null)
		sheet=workbook.getSheet(sheetName);
		return sheet;

	}
	
	public Row getRow(String sheetName, int rowNum) {
		
		return getSheet(sheetName).getRow(rowNum);
			
	}
	
	private Cell getCell(String sheetName, int rowNum, int cellNum) {
		
		return getSheet(sheetName).getRow(rowNum).getCell(cellNum);
	
		
	}
	
	public void getCellData(String sheetName, int rowNum, int cellNum) {
		String cellValue = null;
		cell = getCell(sheetName, rowNum, cellNum);
		
		String str=(cell.getCellType()==cell.CELL_TYPE_STRING) ? stringData():(cell.getCellType()==cell.CELL_TYPE_NUMERIC)? numericData() :"";
			
		
	}
	
	public String stringData() {
		
		String cellValue = null;
		 cellValue = cell.getStringCellValue();
		return cellValue;
		
	}
	
	public String numericData() {
		double cellValue =0;
		cellValue = cell.getNumericCellValue();
		return cellValue+"";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
