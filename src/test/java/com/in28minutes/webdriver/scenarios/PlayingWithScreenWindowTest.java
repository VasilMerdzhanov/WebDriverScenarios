package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class PlayingWithScreenWindowTest extends AbstractChromeWebDriverTest{
	@Test
	public void playingWithWindows() {
		driver.get("https://bulma.io/documentation/form/input/");
		
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
		sleep(2);
		driver.manage().window().setPosition(new Point(200,200));
		sleep(2);
		driver.manage().window().setSize(new Dimension(200,200));
		sleep(2);
		driver.manage().window().fullscreen();
		sleep(2);
		driver.manage().window().maximize();
		sleep(2);
	}
		@Test
		public void backForwardAndNavigation() {
			driver.get("https://bulma.io/documentation/form/input/");
			sleep(2);
			driver.get("https://bulma.io/documentation/form/textarea/");
			sleep(2);
			driver.get("https://bulma.io/documentation/form/select/");
			sleep(2);
			driver.get("https://bulma.io/documentation/form/checkbox/");
			
			sleep(2);
			driver.navigate().back();
			sleep(2);
			driver.navigate().back();
			sleep(2);
			driver.navigate().back();
			sleep(2);
			driver.navigate().forward();
			sleep(2);
			driver.navigate().refresh();
			sleep(2);
			driver.navigate().back();
			sleep(2);
	}
}
