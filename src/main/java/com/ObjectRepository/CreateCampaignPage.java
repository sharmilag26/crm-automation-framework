package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {

	
	@FindBy (name="campaignname")
	private WebElement CampaignName;
	
	@FindBy (id="jscal_field_closingdate")
	private WebElement ExpectedClosingDate;
	
	@FindBy (xpath="//input[@class='crmbutton small save']")
	private WebElement SaveButton;
	
	public CreateCampaignPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateCampaign() {
		return CampaignName;

	}
	public WebElement ExpectedClosingDate() {
		return ExpectedClosingDate;

	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	
}

