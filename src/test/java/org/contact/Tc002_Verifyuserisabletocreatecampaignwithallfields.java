package org.contact;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.WebDriverUtility;

public class Tc002_Verifyuserisabletocreatecampaignwithallfields {
	
	@Test
	public void tc001_Verifyuserisabletocreatecampaignwithallfields() throws InterruptedException, IOException {
		

   /*FileInputStream fis = new FileInputStream("./src/main/resources/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String PASSWORD = prop.getProperty("PASSWORD");
		String USERNAME = prop.getProperty("username");*/
		
       FileUtility fileutil = new FileUtility();
       WebDriverUtility webutil = new WebDriverUtility();
       
       
		String URL = fileutil.readDataFromPropertiesFile("url");
		String PASSWORD = fileutil.readDataFromPropertiesFile("password");
		String USERNAME = fileutil.readDataFromPropertiesFile("username"); 
		
		//create object for ChromeDRiver class
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver=new FirefoxDriver();
		
		//maximize browser
		//driver.manage().window().maximize();
		
		webutil.toMaximize(driver);
		
		//navigate to url
		driver.get(URL);
		
		//enter user name into username textfield
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		
		//enter password into password textfield
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		
		//click on login button
		driver.findElement(By.id("submitButton")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//print login successful message
		Reporter.log("Login Successful", true);
		
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
						
		driver.quit();
	}

}
