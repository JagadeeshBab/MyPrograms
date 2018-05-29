import java.io.FileNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {

public static void login(String username, String password) {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		WebElement un = driver.findElement(By.name("uid"));
		un.clear();
		un.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		String expected = driver.getTitle();
		
	try {	
		if(expected.contains("Guru99 Bank Manager HomePage"))
		{
			System.out.println("login successfully done");
		}
		else {
			Alert alt= driver.switchTo().alert();
			String popup = alt.getText();
			alt.accept();
			
			System.out.println(popup);
		}
	}
	catch (UnhandledAlertException e) {

		e.printStackTrace();
	}

}
	public static void main(String[] args) {
		
		Day2.login("mngr132348", "uhYnedE");
		Day2.login("mngr132348", "jsdkdjsklj");
		Day2.login("jagadeesh", "uhYnedE");
		Day2.login("baby", "babu");
	}

}
