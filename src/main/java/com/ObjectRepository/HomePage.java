package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (name="Campaigns")
	private WebElement CampaignModule;
	
	@FindBy (linkText="More")
	private WebElement MoreButton;
	
	@FindBy (linkText="Contacts")
	private WebElement ContactModule;
	
	@FindBy (linkText="Leads")
	private WebElement LeadsModule;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement ProfileButton;
	
	@FindBy (xpath="//a[text()='Sign Out']")
	private WebElement SignOut;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getProfileButton() {
		return ProfileButton;
	}

	public WebElement getSignOut() {
		return SignOut;
	}

	public WebElement getCampaignModule() {
		return CampaignModule;
	}

	public WebElement getMoreButton() {
		return MoreButton;
	}

	public WebElement getContactModule() {
		return ContactModule;
	}

	public WebElement getLeadsModule() {
		return LeadsModule;
	}

}
