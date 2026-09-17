package org.campaign;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ObjectRepository.HomePage;
import com.buisnessUtility.BaseClass;

public class Tc001_VerifyuserisabletocreatecampaignwithMandatoryfields extends BaseClass {
	
	@Test
	public void test() throws InterruptedException {
		
	//to click on more button
	driver.findElement(By.linkText("More")).click();
	
	//hard wait
	Thread.sleep(2000);
	
	//to click on campaign Module
	driver.findElement(By.name("Campaigns")).click();
	
	HomePage homepage = new HomePage(driver);
	
	homepage.getMoreButton();
	
	homepage.getCampaignModule();
	
	//hard wait
	Thread.sleep(2000);
	
	//to click on create campaign button
	driver.findElement(By.cssSelector("[title=\'Create Campaign...']")).click();
	
	//hard wait
	Thread.sleep(2000);
			
	//enter campaign name into campaign name textfield
	driver.findElement(By.name("campaignname")).sendKeys("Camp_002");
	
	//hard wait
	Thread.sleep(2000);
			
	//clear the data in textfield
	driver.findElement(By.id("jscal_field_closingdate")).clear();
	
	//hard wait
	Thread.sleep(2000);
			
	
	//enetr closing date
	driver.findElement(By.id("jscal_field_closingdate")).sendKeys("2026-09-15");
	
	//hard wait
	Thread.sleep(2000);
			
	
	//click on save button
	driver.findElement(By.name("button")).click();
	}

}
