package login;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LoginPage;

public class Tc001_VerifyuserisabletocreatecampaignwithMandatoryfields {
	
	
	//driver initialization
	WebDriver driver = null;
	
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("BeforeSuite - Database Connectivity Established",true);
		}
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("BeforeSuite - Database Connectivity Terminated",true);
		}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("BeforeTest - report starts",true);
		}
	

	@AfterTest
	public void aftertest() {
		Reporter.log("AfterTest - report backup",true);
		}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("BeforeClass - Launch Browser",true);
		
				//create object for ChromeDRiver class
				driver = new ChromeDriver();				
				//maximize browser
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("AfterClass - Close Browser",true);
		
		driver.quit();
			
	}
	
	@BeforeMethod
	public void beforemethod() throws IOException {
		
		//print
		Reporter.log("BeforeMethod-Login to application ",true);
		//create object for Utility Classes
		FileUtility fileutil = new FileUtility();
		//read data from properties file
				String URL = fileutil.readDataFromPropertiesFile("url");
				String PASSWORD = fileutil.readDataFromPropertiesFile("password");
				String USERNAME = fileutil.readDataFromPropertiesFile("username");
				
				//navigate to url
				driver.get(URL);
				//create object for POM class
				LoginPage loginpage = new LoginPage(driver);
				loginpage.login(USERNAME, PASSWORD);		
	}
	
	@AfterMethod
	public void aftermethod() {
		
		//print
		Reporter.log("AfterMethod-Logout to application ",true);		
	}

	@Test
	public void tc001_VerifyuserisabletocreatecampaignwithMandatoryfields() throws InterruptedException, IOException {
		
		//print
		Reporter.log("Test - TestCase executed",true);
	}
}
//        /*FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
//         Properties prop = new Properties();
//         prop.load(fis);
//		String URL = prop.getProperty("url");
//		String PASSWORD = prop.getProperty("password");
//		String USERNAME = prop.getProperty("username");*/
//		
//		//create object for Utility Classes
//		FileUtility fileutil = new FileUtility();
//		WebDriverUtility webutil = new WebDriverUtility();
//		
//		String URL = fileutil.readDataFromPropertiesFile("url");
//		String PASSWORD = fileutil.readDataFromPropertiesFile("password");
//		String USERNAME = fileutil.readDataFromPropertiesFile("username");
//		
//		//create object for ChromeDRiver class
//		ChromeDriver driver = new ChromeDriver();
//		
//		//FirefoxDriver driver=new FirefoxDriver();
//		
//		//maximize browser
//		//driver.manage().window().maximize();
//		
//		webutil.toMaximize(driver);
//		
//		//navigate to url
//		driver.get(URL);
//		
//		//enter user name into username textfield
//		/*	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		
//		//enter password into password textfield
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		
//		//click on login button
//		driver.findElement(By.id("submitButton")).click();*/
//		
//		
//		
//		
//		LoginPage loginpage = new LoginPage(driver);
//		
//		//enter user name into username textfield
//		/*loginpage.getUserNameTextfield().sendKeys(USERNAME);
//		
//		//enter password into password textfield
//		loginpage.getPasswordTextfield().sendKeys(PASSWORD);
//		
//		//click on login button
//		loginpage.getLoginButton().click();*/
//		
//		loginpage.login(USERNAME, PASSWORD);
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//print login successful message
//		Reporter.log("Login Successful", true);
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//to click on more button
//		/*driver.findElement(By.linkText("More")).click();
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//to click on campaign Module
//		driver.findElement(By.name("Campaigns")).click();*/
//		
//		HomePage homepage = new HomePage(driver);
//		
//		homepage.getMoreButton();
//		
//		homepage.getCampaignModule();
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//to click on create campaign button
//		driver.findElement(By.cssSelector("[title=\'Create Campaign...']")).click();
//		
//		//hard wait
//		Thread.sleep(2000);
//				
//		//enter campaign name into campaign name textfield
//		driver.findElement(By.name("campaignname")).sendKeys("Camp_002");
//		
//		//hard wait
//		Thread.sleep(2000);
//				
//		//clear the data in textfield
//		driver.findElement(By.id("jscal_field_closingdate")).clear();
//		
//		//hard wait
//		Thread.sleep(2000);
//				
//		
//		//enetr closing date
//		driver.findElement(By.id("jscal_field_closingdate")).sendKeys("2026-09-15");
//		
//		//hard wait
//		Thread.sleep(2000);
//				
//		
//		//click on save button
//		driver.findElement(By.name("button")).click();
//		
//		driver.quit();
//	}
//
//}
