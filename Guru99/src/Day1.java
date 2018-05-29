import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day1 {
@Test
	public void login() {
		
		//System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Guru99\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		WebElement username = driver.findElement(By.name("uid"));
		username.clear();
		username.sendKeys("mngr132348");
		
		driver.findElement(By.name("password")).sendKeys("uhYnedE");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String dt = driver.findElement(By.xpath("//td[text()='Manger Id : mngr132348']")).getText();
		
		String expected = driver.getTitle();
		
		Assert.assertEquals("Guru99 Bank Manager HomePage", expected);
		Assert.assertEquals("Manger Id : mngr132348", dt);
		
		
	}

}
