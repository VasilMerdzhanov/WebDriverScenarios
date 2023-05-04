package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class NewWindowTest extends AbstractChromeWebDriverTest{
	@Test
	public void testForWindows() {
		driver.get("https://www.google.com/search?q=%D0%B1%D1%8A%D0%BB%D0%B3%D0%B0%D1%80%D0%B8%D1%8F&sxsrf=APq-WBtmZ6HKabpDaO0nKBdH3LMxJxT05w:1646675247541&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi_isKpx7T2AhWHSPEDHc0ODscQ_AUoAXoECAIQAw#imgrc=qzraMU3lxCr5xM");
//		0 - [CDwindow-44A21B5F147CB3E475864E17546A84CE]
		System.out.println("0 - " + driver.getWindowHandles());
		
		driver.findElement(By.className("n3VNCb")).click();
		// Window handle
//		1 - CDwindow-44A21B5F147CB3E475864E17546A84CE
		System.out.println("1 - " + driver.getWindowHandle());
		
//		2 - [CDwindow-44A21B5F147CB3E475864E17546A84CE, CDwindow-E85AB581B2DC4EF159D6FDD9DC1A8B71]
		System.out.println("2 - " + driver.getWindowHandles());
	}
	
	@Test
	public void findWindowHandleOfSecondWindow() {
		driver.get("https://www.google.com/search?q=%D0%B1%D1%8A%D0%BB%D0%B3%D0%B0%D1%80%D0%B8%D1%8F&sxsrf=APq-WBtmZ6HKabpDaO0nKBdH3LMxJxT05w:1646675247541&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi_isKpx7T2AhWHSPEDHc0ODscQ_AUoAXoECAIQAw#imgrc=qzraMU3lxCr5xM");
//		0 - [CDwindow-44A21B5F147CB3E475864E17546A84CE]
		
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		
		driver.findElement(By.className("n3VNCb")).click();
		
		String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);
		
		System.out.println(secondWindowHandle);
	}

	private String findSecondWindowHandle(String firstWindowHandle) {
		
		for(String handle: driver.getWindowHandles()) {
			if(!firstWindowHandle.equals(handle)) {
				return handle;
			}
		}
		return null;
	}
	
	@Test
	public void switchToSecondWindow() {
		driver.get("https://www.google.com/search?q=%D0%B1%D1%8A%D0%BB%D0%B3%D0%B0%D1%80%D0%B8%D1%8F&sxsrf=APq-WBtmZ6HKabpDaO0nKBdH3LMxJxT05w:1646675247541&source=lnms&tbm=isch&sa=X&ved=2ahUKEwi_isKpx7T2AhWHSPEDHc0ODscQ_AUoAXoECAIQAw#imgrc=qzraMU3lxCr5xM");
		
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		
		driver.findElement(By.className("n3VNCb")).click();
		
		String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);
		
		System.out.println(secondWindowHandle);
		
		//System.out.println(driver.findElement(By.tagName("h1")).getText());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(secondWindowHandle);
		//sleep();
		//System.out.println(driver.findElement(By.id("firstHeading")).getText());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(firstWindowHandle);
	}
}
