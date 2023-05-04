package com.in28minutes.webdriver.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class TakesSkreenShotTest extends AbstractChromeWebDriverTest{
	@Test
	public void testWindows() throws IOException {
		driver.get("https://www.livescore.com/en/");
		
		//Operations
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, 
				new File("./target/" + "-screenshot.png"));
	}
}
