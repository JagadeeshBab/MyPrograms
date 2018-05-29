package com.rameshsoft.automation.businessscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.gmail.pageobjects.GmailHomePage;
import com.rameshsoft.automation.gmail.pageobjects.GmailPwdPage;
import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtility;
import com.rameshsoft.automation.utilities.PojoUtility;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.media.sound.InvalidFormatException;

public class PomLoginTest extends BaseTest {

	@org.testng.annotations.Test
	public void login() throws IOException, EncryptedDocumentException, InvalidFormatException, InterruptedException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		PropertiesUtility prConf = new PropertiesUtility(PojoUtility.getConfFilePath());
		enterUrl(prConf.getPropertValue("url_gmail"));
		getExtentTest().log(LogStatus.INFO, "URL is entered as : " + prConf.getPropertValue("url_gmail"));

		ExcelReader excelReader = new ExcelReader(PojoUtility.getExcelFilePath());
		GmailHomePage.enterUserName(excelReader.getCellData("Sheet1", 0, 0));
		getExtentTest().log(LogStatus.INFO,
				"DTA is done on username: with test data: " + excelReader.getCellData("Sheet1", 0, 0));

		GmailHomePage.clickOnNxtBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next button");

		Thread.sleep(3000);
		GmailPwdPage.enterPwd(excelReader.getCellData("Sheet1", 0, 1));
		getExtentTest().log(LogStatus.INFO,
				"DTA is done on PASSWORD: with test data: " + excelReader.getCellData("Sheet1", 0, 1));

		GmailPwdPage.clickOnNxtBtn();
		GmailPwdPage.validatePwdErrMsg("Wrong password. Try again or click Forgot password to reset it.");

	}
}
