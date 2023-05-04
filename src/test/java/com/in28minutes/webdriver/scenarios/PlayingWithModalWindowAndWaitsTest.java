package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class PlayingWithModalWindowAndWaitsTest extends AbstractChromeWebDriverTest{
//	@Test(expectedExceptions=NoSuchElementException.class)
//	public void playingWithModalWindows_ExpectingAnException() {
//		driver.get("https://news.bg/");
//		
//		driver.findElement(By.id("fc-button-label"));
//	}
	
//	@Test
//	public void playingWithModalWindwsAndSleep() {
//		driver.get("https://www.livescore.com/en/");
//		
//		sleep(4);
//		
//		System.out.println(driver.findElement(By.id("onetrust-policy-title")).getText());
//		
//		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//
//	}
	
//	@Test
//	@Ignore("implicit wait fails on Chrome")
//	public void playingWithModalWindws_implicitlyWait() {
//		
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		
//		driver.get("https://www.livescore.com/en/");
//		
//		//sleep(4);
//		
//		System.out.println(driver.findElement(By.id("onetrust-policy-title")).getText());
//		
//		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//
//	}
	
	@Test
	public void playingWithModalWindws_explicitWait() {
		
		driver.get("https://www.livescore.com/en/");
		
		//sleep(4);
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.withMessage("Waited for 10 seconds but still not available");
		
		WebElement modalLabel = 
				webDriverWait.until(
						ExpectedConditions.visibilityOf
							(driver.findElement(By.id("onetrust-policy-title"))));
		
		System.out.println(modalLabel.getText());
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

	}
}
