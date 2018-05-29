package com.rameshsoft.automation.base;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.PojoUtility;
import com.rameshsoft.automation.utilities.WorkBookValues;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest extends ActionEngineOne 
{
	
	public static  PropertiesUtility getPrConfigInstance() throws IOException {
		PropertiesUtility prConf = new PropertiesUtility(PojoUtility.getConfFilePath());
		return prConf;
	}
	
public static  PropertiesUtility getPrOrInstance() throws IOException {
	PropertiesUtility prOr = new PropertiesUtility(PojoUtility.getOrFilePath());
	return prOr;
	}

public static  ExcelReader getExcelReaderInstance() throws EncryptedDocumentException, InvalidFormatException, IOException {
	ExcelReader excelReader = new ExcelReader(PojoUtility.getExcelFilePath());
	return excelReader;
}
	;;;;;;;;;;;;;;;;;;;;;
}












