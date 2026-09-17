package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.LoginPage;

public class Tc002_Verifyuserisabletocreatecampaignwithallfields {
	@Test
	public void tc001_Verifyuserisabletocreatecampaignwithallfields() throws InterruptedException, IOException {
		
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
		/*driver.findElement(By.name("user_name")).sendKeys("admin");
		
		//enter password into password textfield
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//click on login button
		driver.findElement(By.id("submitButton")).click();*/
		
        LoginPage loginpage = new LoginPage(driver);
		
		//enter user name into username textfield
		loginpage.getUserNameTextfield().sendKeys(USERNAME);
		
		//enter password into password textfield
		loginpage.getPasswordTextfield().sendKeys(PASSWORD);
		
		//click on login button
		loginpage.getLoginButton().click();
		
		//hard wait
		Thread.sleep(2000);
		
		//print login successful message
		Reporter.log("Login Successful", true);
		
		//hard wait
		Thread.sleep(2000);
		
		//to click on more button
		driver.findElement(By.linkText("More")).click();
		
		//hard wait
		Thread.sleep(2000);
		
		//to click on campaign Module
		driver.findElement(By.name("Campaigns")).click();
		
		
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
		
		//enter target audience into target audience text field
		driver.findElement(By.id("targetaudience")).sendKeys("Gents");
				
		
		//click on save button
		driver.findElement(By.name("button")).click();
	}


}
