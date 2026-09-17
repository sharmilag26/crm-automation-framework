package org.Leads;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.WebDriverUtility;

public class Tc001_VerifyuserisabletocreatecampaignwithMandatoryfields  {
	@Test
	
	public void test() throws InterruptedException, IOException {
	

	//create object for fileInputStream class from java
	//fetch the file
	/*FileInputStream fis = new FileInputStream("./src/main/resources/commondata.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String URL = prop.getProperty("url");
	String PASSWORD = prop.getProperty("password");
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
	
	//hard wait
	Thread.sleep(2000);

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
	
	//click on save button
	driver.findElement(By.name("button")).click();
					
	driver.quit();
	
	
 }
}