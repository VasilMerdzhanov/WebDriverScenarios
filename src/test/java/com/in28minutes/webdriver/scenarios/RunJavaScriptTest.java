package com.in28minutes.webdriver.scenarios;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class RunJavaScriptTest extends AbstractChromeWebDriverTest{
	@Test
	public void testJS() throws IOException {
		driver.get("https://www.livescore.com/en/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String title = (String)js.executeScript("return document.title;");
		
		sleep(2);
		
		js.executeScript("window.scrollBy(0,200)");
		
		sleep(2);
		
		js.executeScript("window.scrollBy(0,200)");
		
		sleep(2);
		
		js.executeScript("window.scrollBy(0,200)");
		
		sleep(2);
		
		System.out.println(title);
	}
}
