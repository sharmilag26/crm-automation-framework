package com.buisnessUtility;

import java.io.IOException;
import java.time.Duration;

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

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.ContactsPage;
import com.ObjectRepository.CreateCampaignPage;
import com.ObjectRepository.CreateContactPage;
import com.ObjectRepository.CreateLeadsPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LeadsPage;
import com.ObjectRepository.LoginPage;

public class BaseClass {
	
	//driver initialization
	public	WebDriver driver = null;
	
	//create object for Utility classes
	public FileUtility futuil = new FileUtility();
	public WebDriverUtility webutil = new WebDriverUtility();
	public JavaUtility jutuil = new JavaUtility();
	
	//create object for POM class
	public LoginPage loginpage;
	public HomePage homepage;
	public CampaignPage campaignpage;
	public CreateCampaignPage createcampaignpage;
	public ContactsPage contactspage;
	public CreateContactPage createcontactspage;
	public LeadsPage leadspage;
	public CreateLeadsPage createleadspage;
		
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

}
