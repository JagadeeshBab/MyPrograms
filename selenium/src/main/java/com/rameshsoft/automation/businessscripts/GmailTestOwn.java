package com.rameshsoft.automation.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.ActionEngineOne;
import com.rameshsoft.automation.customisedexceptions.FrameworkException;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.LocMechUtility;
import com.rameshsoft.automation.utilities.PojoUtility;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTestOwn extends ActionEngineOne {
	
	@Test
	public void gmail_Login() throws IOException, FrameworkException, EncryptedDocumentException, InvalidFormatException, InterruptedException {
	
		
		PropertiesUtility prConfig = new PropertiesUtility(PojoUtility.getConfFilePath());
		
		getWebDriver().get(prConfig.getPropertValue("url_gmail"));
	getExtentTest().log(LogStatus.INFO, "url is entered:"+prConfig.getPropertValue("url_gmail"));
	
	ExcelReader excelReader = new ExcelReader(PojoUtility.getExcelFilePath());
	PropertiesUtility prOr = new PropertiesUtility(PojoUtility.getOrFilePath());
	DTA(LocMechUtility.id, prOr.getPropertValue("gmail_un_id"), excelReader.getCellData("Sheet1", 0, 0));
	getExtentTest().log(LogStatus.INFO, "gamail is entered into text field:"+excelReader.getCellData("Sheet1", 0, 0));
	
	CLICK(LocMechUtility.xpath, prOr.getPropertValue("gmail_next_xpath"));
	getExtentTest().log(LogStatus.INFO, "clickable operation is performed on next element");
	
	
	//webDriverWait(LocMechUtility.name, prOr.getPropertValue("gmail_pwd_name"));
	//Thread.sleep(3000);
	DTA(LocMechUtility.name, prOr.getPropertValue("gmail_pwd_name"), excelReader.getCellData("Sheet1", 0, 1));
	
	getExtentTest().log(LogStatus.INFO, "password is entered in to the text field as :"+excelReader.getCellData("Sheet1", 0, 1));
	
	CLICK(LocMechUtility.id, prOr.getPropertValue("gmail_pwdNext_id"));
	getExtentTest().log(LogStatus.INFO, "clickable operation is performed on pwdnext button");
	
	}
}
