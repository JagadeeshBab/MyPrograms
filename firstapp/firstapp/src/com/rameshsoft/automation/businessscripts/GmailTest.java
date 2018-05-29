package com.rameshsoft.automation.businessscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.rameshsoft.automation.base.DriverEngine;

public class GmailTest extends DriverEngine{
	@Test
public void gmailTest() {
	getWebDriver().get("https://www.gmail.com");
	getWebDriver().findElement(By.id("123")).sendKeys("abc123");
}
}
