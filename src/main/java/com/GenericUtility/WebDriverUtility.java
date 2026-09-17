package com.GenericUtility;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	
	/**
	 * To Maximize the Browser window
	 * @param driver
	 */
	public void toMaximize(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
}
