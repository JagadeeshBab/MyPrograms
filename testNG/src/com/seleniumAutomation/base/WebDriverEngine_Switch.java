package com.seleniumAutomation.base;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;

	public class WebDriverEngine_Switch {
		WebDriver driver;

		@BeforeSuite
		@Parameters({"internet"})
		public void openBrowser(@Optional("hai")String Ibrowser) {
			
			switch(Ibrowser) {
			
			case "chrome":	System.setProperty("webdriver.chrome.driver", "F:\\selenium\\Javaselenium\\drivers\\chromedriver.exe");
							driver=new ChromeDriver();
							browserInitial();	
							break;
							
							
			case "firefox": System.setProperty("webdriver.gecko.driver", "F:\\selenium\\Javaselenium\\drivers\\geckodriver.exe");
							driver=new FirefoxDriver();
							browserInitial();	
							break;
							
			case "edge" :   System.setProperty("webdriver.edge.driver", "F:\\selenium\\Javaselenium\\drivers\\MicrosoftWebDriver.exe");
							driver=new EdgeDriver();
							browserInitial();
							break;
						
			case "ie"   :   System.setProperty("webdriver.ie.driver", "F:\\selenium\\Javaselenium\\drivers\\IEDriverServer.exe");	
							driver=new InternetExplorerDriver();
							browserInitial();	
							break;
							
							}
			
		}
		
		public void browserInitial() {
			
			driver.manage().window().maximize();
			driver.get("http://www.gmail.com");
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			


		}
		@AfterSuite
		public void closeBrowser() {
			driver.close();

		}
		
		public WebDriver getDriver() {
			return driver;
		}


		
	}
