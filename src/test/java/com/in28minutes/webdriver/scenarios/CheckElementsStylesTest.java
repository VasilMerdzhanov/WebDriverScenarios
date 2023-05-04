package com.in28minutes.webdriver.scenarios;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class CheckElementsStylesTest extends AbstractChromeWebDriverTest{
//  
//	@Test
//	public void getSCCStyles() {
//		
//		driver.get("https://bulma.io/documentation/form/input/");
//		WebElement elementField = driver.findElement(By.id("categoriesFilter"));
//
//		System.out.println(elementField.getCssValue("color"));  //	rgba(54, 54, 54, 1)
//		System.out.println(elementField.getCssValue("display"));//	inline-flex
//		System.out.println(elementField.getCssValue("border-color"));//	rgb(219, 219, 219)
//		System.out.println(elementField.getCssValue("box-shadow"));//rgba(10, 10, 10, 0.05) 0px 0.75px 1.5px 0px inset
//		System.out.println(elementField.getCssValue("background-color"));//rgba(255, 255, 255, 1)
//	}
	
	@Test
	public void checkIfElementIsEnabled() {
		
		driver.get("https://bulma.io/documentation/form/input/");
		WebElement elementField = driver.findElement(By.id("categoriesFilter"));
		assertTrue(elementField.isEnabled());
		System.out.println(elementField.isEnabled());//true
	}
	
	@Test
	public void exploreWebElementInterface() {
		
		driver.get("https://bulma.io/documentation/form/input/");
		WebElement elementField = driver.findElement(By.id("categoriesFilter"));
		
		//getAttribute
		System.out.println(elementField.getAttribute("placeholder"));//Filter links
		System.out.println(elementField.getSize());
		System.out.println(elementField.getLocation());
		
		//findElement, findElements
		//getLocation, getSize
	}
}
