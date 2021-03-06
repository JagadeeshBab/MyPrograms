package com.automation.selenium.CRM.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.rameshsoft.automation.base.BaseTest;

public class CRMLoginPage extends BaseTest {
	
	
	static {
		PageFactory.initElements(getWebDriver(), CRMLoginPage.class);
	}
	
	@FindBy(name="username")
	private static WebElement un;
	
	@FindBy(name="password")
	private static WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	private static WebElement logIn;
	
	
	public static void verifyCRMPage(String condition,String testdata) {
		Assert.assertTrue(condition.contains(testdata));
		
	}

	
	}
