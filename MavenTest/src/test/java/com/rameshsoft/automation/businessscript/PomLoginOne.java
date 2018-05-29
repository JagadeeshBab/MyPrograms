package com.rameshsoft.automation.businessscript;

import org.testng.annotations.Test;

import com.rameshsoft.automation.base.BaseTest;
import com.rameshsoft.automation.gmail.pageobjects.GmailHomePage;
import com.rameshsoft.automation.gmail.pageobjects.GmailPwdPage;
import com.relevantcodes.extentreports.LogStatus;

public class PomLoginOne extends BaseTest
{
	@Test
public void loginpom() {
	String URL = getConfInstance().getPropertValue("url_gmail");
	enterUrl(URL);
	getExtentTest().log(LogStatus.INFO, "URL is entered as : " +URL);
	
	String userName = getExcelInstance().getCellData("Sheet1", 0, 0);
	GmailHomePage.enterUserName(userName);;
	getExtentTest().log(LogStatus.INFO, "DTA is done on username: with test data: " + userName);
	
	
	
	GmailHomePage.clickOnNxtBtn();
	getExtentTest().log(LogStatus.INFO, "Clicked on next in home page button");
	
	GmailPwdPage.enterPwd(getExcelInstance().getCellData("Sheet1" ,0 ,1));
	getExtentTest().log(LogStatus.INFO, "DTA is done on PASSWORD: with test data: " +getExcelInstance().getCellData("Sheet1" ,0 ,1));
	
	
	GmailPwdPage.clickOnNxtBtn();
	getExtentTest().log(LogStatus.INFO, "Clicked on next button in PWD Page");
	
	GmailPwdPage.validatePwdErrMsg("Wrong password. Try again or click Forgot password to reset it.");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
