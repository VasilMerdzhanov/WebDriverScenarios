package com.in28minutes.webdriver.scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;
import com.in28minutes.webdriver.scenarios.framework.TableReader;

public class ReadTableTest extends AbstractChromeWebDriverTest{
	@Test
	public void testJS() throws IOException {
		driver.get("https://bulma.io/documentation/elements/table/");
		
		TableReader reader = new TableReader(driver, "div:nth-child(9) > div.column.is-half > table");
		System.out.println(reader.getData(1,2));
		System.out.println(reader.getData(2,2));
		
		TableReader reader2 = new TableReader(driver, "div.table-container > table");
		System.out.println(reader2.getData(2,2));
		System.out.println(reader2.getData(2,7));
		
		
		//#docs > main > div > div > div.bd-docs-content.bd-content.algolia-content > div.table-container > table > tbody > tr:nth-child(2) > td:nth-child(7)
		//#docs > main > div > div > div.bd-docs-content.bd-content.algolia-content > div:nth-child(9) > div.column.is-half > table > tbody > tr:nth-child(1) > td:nth-child(1)
		//#docs > main > div > div > div.bd-docs-content.bd-content.algolia-content > div:nth-child(9) > div.column.is-half > table > tbody > tr:nth-child(2) > td:nth-child(1)
//		WebElement tBody = driver.findElement(By.cssSelector("#docs > main > div > div > div.bd-docs-content.bd-content.algolia-content > div:nth-child(9) > div.column.is-half > table > tbody"));
//		
//		String tb1 = tBody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")).getText();
//		String tb2 = tBody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).getText();
//		System.out.println(tb1);
//		System.out.println(tb2);
	}
}
