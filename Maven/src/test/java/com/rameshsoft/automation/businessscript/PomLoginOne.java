package com.rameshsoft.automation.businessscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.gmail.pageobjects.GmailHomePage;
import com.rameshsoft.automation.gmail.pageobjects.GmailPwdPage;
import com.rameshsoft.automation.utilities.WorkBookValues;
import com.relevantcodes.extentreports.LogStatus;

public class PomLoginOne extends BaseTest {
	@Test
	public void loginpom() throws IOException, EncryptedDocumentException, InvalidFormatException {

		enterUrl(getPrConfigInstance().getPropertValue("url_gmail"));
		getExtentTest().log(LogStatus.INFO,
				"URL is entered as : " + getPrConfigInstance().getPropertValue("url_gmail"));

		String userName = getExcelReaderInstance().getCellData("Sheet1", 0, 0);
		GmailHomePage.enterUserName(userName);

		getExtentTest().log(LogStatus.INFO, "DTA is done on username: with test data: " + userName);

		GmailHomePage.clickOnNxtBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next in home page button");

		GmailPwdPage.enterPwd(getExcelReaderInstance().getCellData("Sheet1", 0, 1));
		getExtentTest().log(LogStatus.INFO,
				"DTA is done on PASSWORD: with test data: " + getExcelReaderInstance().getCellData("Sheet1", 0, 1));

		GmailPwdPage.clickOnNxtBtn();
		getExtentTest().log(LogStatus.INFO, "Clicked on next button in PWD Page");

		GmailPwdPage.validatePwdErrMsg("Wrong password. Try again or click Forgot password to reset it.");

	}
}
