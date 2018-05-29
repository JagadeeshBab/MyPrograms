package com.automation.jaggu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CRMSampleTest {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://FreeCRM.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String title = driver.getTitle();
		// String text =
		// driver.findElement(By.xpath("//*[text()='Facebook']")).getText();

		System.out.println(title);

		org.testng.Assert.assertTrue(title.contains("Free CRM software"));
		if (title.contains("Free CRM software")) {
			System.out.println("crm page is opened");
		}
			driver.findElement(By.name("username")).sendKeys("J_BABU");
			driver.findElement(By.name("password")).sendKeys("FreeCRM");
			driver.findElement(By.xpath("//input[@type='submit']")).submit();

			String home = driver.getTitle();
			System.out.println(home);
			Assert.assertEquals(home, "CRMPRO");
			List frame = driver.findElements(By.xpath("//frame"));

			System.out.println(frame.size());
			driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//div[@id='navmenu']/ul/li[1]/a")).click();

			List<WebElement> dates = driver
					.findElements(By.xpath("//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody"));
			// System.out.println(dates.get(5).getText());
			/*
			 * for(WebElement dat:dates) { System.out.println(dat.getText()); } for(int
			 * i=0;i<dates.size();i++) { System.out.println(dates.get(i).getText());
			 * if(dates.get(i).getText().equals("24")) { dates.get(i).click();
			 * 
			 * }
			 * 
			 * }
			 */
			// date
			// picker//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
			String fpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
			String lpath = "]/td[";

			for (int i = 2; i <= 6; i++) {
				for (int j = 1; j <= 7; j++) {
					List<WebElement> alldates = driver.findElements(By.xpath(fpath + i + lpath + j + "]"));

					for (int l = 0; l < alldates.size(); l++) {
						System.out.println(alldates.get(l).getText());
						if (alldates.get(l).getText().equals("24")) {
							alldates.get(l).click();

						} 
					}
				}

			}

		

	}
}