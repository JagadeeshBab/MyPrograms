package com.automation.selenium.CRM.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.rameshsoft.automation.base.BaseTest;

public class CRM_HomePage extends BaseTest{

	
	static {
		
		PageFactory.initElements(getWebDriver(), CRM_HomePage.class);
		
	}
	@FindBy(linkText="Home")
	private static WebElement home;
	
	@FindBy(xpath="//select[@name='slctMonth']")
	private static WebElement ddMonth;
	
	@FindBy(xpath="//select[@name='slctYear']")
	private static WebElement ddYear;
	
	/*@FindBy(xpath="//div[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody")
	private static List<WebElement> date;
	*/
	@FindBys(@FindBy(xpath="//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody"))
    private static List<WebElement> AllData;

    public static List<WebElement> getAllData() {
        return AllData;
    }

}

