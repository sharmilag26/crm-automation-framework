package org.leadss;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.buisnessUtility.BaseClass;

public class Tc002_VerifyuserisabletocreateLeadswithallfields extends BaseClass {
	
	@Test
	public void test() {
		
		//to click on Leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//to click on create leads button
		driver.findElement(By.cssSelector("[title='Create Lead...']")).click();
		
		//to enter last name in last name in text field
		driver.findElement(By.name("lastname")).sendKeys(USERNAME);
				
		//hard wait
		Thread.sleep(2000);
		
		// to enter company name in company text field
		driver.findElement(By.name("company")).sendKeys("YAMAHA");
		
		//to enter title in title textfield
		driver.findElement(By.id("designation")).sendKeys("New Bike Campaign");
		
		//click on save button
		driver.findElement(By.name("button")).click();
	}

}
