package com.seleniumAutomation.businessScripts;

import org.testng.annotations.Test;

import com.seleniumAutomation.base.WebdriverEngine;

public class Facebook_Test extends WebdriverEngine
	{
	@Test
	public void fbTest() {
	getDriver().get("http://www.facebook.com");
}
}
