package com.automation.selenium.java;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioCheckTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Javaselenium\\drivers\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	WebElement female=driver.findElement(By.id("u_0_c"));
	if(female.isDisplayed()&&female.isEnabled())
		female.click();
	else
		System.out.println("element is not displayed");
	if(female.isSelected())
		;
	else
		System.out.println("female radio button is not selected");
	Thread.sleep(5000);
	female.click();

}




}
