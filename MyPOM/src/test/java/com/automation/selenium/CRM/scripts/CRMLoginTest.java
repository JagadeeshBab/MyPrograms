package com.automation.selenium.CRM.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.automation.selenium.CRM.pageobjects.CRMLoginPage;
import com.rameshsoft.automation.base.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class CRMLoginTest extends BaseTest {
	@Test
	public static void CRMLogin() throws IOException, EncryptedDocumentException, InvalidFormatException  {
		
		getWebDriver().get(getPrConfigInstance().getPropertValue("url_CRM"));
		getExtentTest().log(LogStatus.INFO, "url is entered as:"+getPrConfigInstance().getPropertValue("url_CRM"));
		
		CRMLoginPage.verifyCRMPage(getWebDriver().getTitle(), getExcelReaderInstance().getCellData("Sheet3", 0, 0));
		getExtentTest().log(LogStatus.INFO, "CRM page is opened");
		
	}

}
