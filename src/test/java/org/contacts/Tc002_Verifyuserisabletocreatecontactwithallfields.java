package org.contacts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.buisnessUtility.BaseClass;

public class Tc002_Verifyuserisabletocreatecontactwithallfields extends BaseClass {
	
	@Test
	public void test() throws InterruptedException {

	//to click on contacts button
	driver.findElement(By.linkText("Contacts")).click();
	
//to click on create contact button
driver.findElement(By.cssSelector("[title=\'Create Contact..']"));
	
//to enter last name in last name in text field
driver.findElement(By.name("lastname")).sendKeys("admin");
	
//hard wait
Thread.sleep(2000);
					
			
//click on save button
driver.findElement(By.name("button")).click();
}
}