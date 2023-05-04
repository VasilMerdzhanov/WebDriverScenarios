package com.in28minutes.webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver driver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
	 //Download the web driver executable
	  //WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
	
	  //Create an instance of your web driver - chrome
	  driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		  driver.quit();
	   }
	
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}