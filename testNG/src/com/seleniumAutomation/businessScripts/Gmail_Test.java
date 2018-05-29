package com.seleniumAutomation.businessScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.seleniumAutomation.base.WebdriverEngine;

class Gmail_Test extends WebdriverEngine {
	
	@Test
	public void gmail() throws Exception {
	 
		getDriver().get("https://www.gmail.com");
		Thread.sleep(3000);
		getDriver().findElement(By.id("identifierId")).sendKeys("shfsjh");
	}
}
