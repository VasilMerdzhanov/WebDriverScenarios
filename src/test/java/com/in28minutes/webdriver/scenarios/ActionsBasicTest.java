package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class ActionsBasicTest extends AbstractChromeWebDriverTest{
	@Test
	public void testBasicActions_Combine() {
		driver.get("https://bulma.io/documentation/elements/box/");

		WebElement element = driver.findElement(By.className("input"));
		WebElement tablesLink = driver.findElement(By.linkText("Table"));
		//Using sendkeys
		//element.sendKeys("Zdravey");
		
		Actions action = new Actions(driver);
		//setup
		//invoke
		
		action.sendKeys(element, "Hello").click(tablesLink).perform();
		sleep(3);
	}
	@Test
	public void testBasicDragAndDrop() {
		driver.get("https://sortablejs.github.io/Sortable/");
		
		//#example1 > div:nth-child(1)
		WebElement itemLink = driver.findElement(By.cssSelector("#example1 > div:nth-child(1)"));
		
		Actions action = new Actions(driver);
		//setup
		//invoke
		sleep(3);
		action
			.dragAndDropBy(itemLink, 10, 50)
			.perform();
		sleep(3);
	}
	@Test
	public void testBasicDragAndDrop_Complicated() {
		driver.get("https://sortablejs.github.io/Sortable/");
		
		//#example1 > div:nth-child(1)
		WebElement itemLink = driver.findElement(By.cssSelector("#example1 > div:nth-child(1)"));
		
		Actions action = new Actions(driver);
//		itemLink.getLocation().getX();
//		itemLink.getLocation().getY();
		//setup
		//invoke
		sleep(3);
		action
			.clickAndHold(itemLink)
			.moveByOffset(10, 50)
			.release()
			.perform();
		sleep(3);
	}
}
