package com.automation.jaggu;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinksTset {

	public static void main(String[] args) throws IOException, MalformedURLException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumbymahesh.com");
		/*driver.get("http://www.FreeCRM.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys("J_BABU");
		driver.findElement(By.name("password")).sendKeys("FreeCRM");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.switchTo().frame("mainpanel");
*/		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links :" + allLinks.size());

		List<WebElement> activelinks = new ArrayList();
		for (int i = 0; i < allLinks.size(); i++) {
			if (allLinks.get(i).getAttribute("href") != null
					&& (!allLinks.get(i).getAttribute("href").contains("javascript"))) {
				activelinks.add(allLinks.get(i));

			}

		}
		System.out.println("active links:" + activelinks.size());
		List<WebElement> actLinks = new ArrayList();
		List<WebElement> brokenLinks = new ArrayList();
		for (int j = 0; j < activelinks.size(); j++) {
			WebElement element = activelinks.get(j);
			String url = element.getAttribute("href");
			URL link = new URL(url); 							//MalformedURLException
			HttpURLConnection httpURL = (HttpURLConnection) link.openConnection(); // throws IOException
			httpURL.connect();
			int responseCode = httpURL.getResponseCode();
			httpURL.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"......"+responseCode);
			if (responseCode > 400) {
				brokenLinks.add(activelinks.get(j));
			} else
				actLinks.add(activelinks.get(j));
		}
		System.out.println("number of active links :" + actLinks.size());
		System.out.println("number of  links :" + brokenLinks.size());

	}

}