package com.in28minutes.webdriver.scenarios.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableReader {
	private WebDriver driver;
	private String id;
	private WebElement tBody;
	
	public TableReader(WebDriver driver, String id) {
		this.driver = driver;
		this.id = id;
		tBody = driver.findElement(By.cssSelector("#docs > main > div > div > div.bd-docs-content.bd-content.algolia-content > "
				+ id
				+ " > tbody"));
	}

	public String getData(int row, int cow) {
		return tBody.findElement(By.cssSelector("tr:nth-child("
				+ row
				+ ") > td:nth-child("
				+ cow
				+ ")")).getText();
	}
	
}
