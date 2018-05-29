package com.java.programs.Excel_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderOne {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fip = new FileInputStream("F:\\selenium\\JavaPrograms\\src\\com\\java\\programs\\Excel_Utilities\\data.xls");
		
		Workbook workbook= WorkbookFactory.create(fip);
		Sheet sheet= workbook.getSheet("Sheet1");
		
		
		
		//for particular column data
		for(Row row: sheet) {
			Cell column = row.getCell(2);     //3rd column
			System.out.println("column data is :"+column);
			
			for(Cell cell:row) {
			//System.out.println(cell.getRow());	
			System.out.println("cell data is:"+cell);
			}
		}
		
		
		//total sheet data
		List list = new ArrayList();
		 for(int i=0;i<=sheet.getLastRowNum();i++)
		 {
			Row  row = sheet.getRow(i);
			 for(int j=0;j<row.getLastCellNum();j++)
			 {
				Cell cell = row.getCell(j);
				if (cell.getCellType()==cell.CELL_TYPE_STRING) {
					String cellValue = cell.getStringCellValue();
					list.add(cellValue);
					//System.out.println(cellValue);
				}
				else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
					double cellValue = cell.getNumericCellValue();
					list.add(cellValue);
					//System.out.println(cellValue);
				}
			}
		 }

	System.out.println("total sheet data is:"+list);

		
		
		//for one row data (framework level)
	List rowData = new ArrayList();
	Row rowd = sheet.getRow(2);
	for(int i = 0;i<rowd.getLastCellNum();i++) {
		Cell cell = rowd.getCell(i);
		if (cell.getCellType()==cell.CELL_TYPE_STRING) {
			String cellValue = cell.getStringCellValue();
			rowData.add(cellValue);
			//System.out.println(cellValue);
		}
		else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			double cellValue = cell.getNumericCellValue();
			rowData.add(cellValue);
			//System.out.println(cellValue);
		}
	}
	System.out.println("row data is  :"+rowData);
		
		//for particular one row data (own logic)
		
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			Row row = sheet.getRow(i);
			
			if(i==2)          //for particular row data means only 3rd row data
				
			{
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell= row.getCell(j);
							//if(j==2)	
					System.out.println("row data is :"+cell);
					
				}	
			}
			
			//System.out.println(row.getLastCellNum());
			//System.out.println(sheet.getLastRowNum());
		}
		
	}

}
