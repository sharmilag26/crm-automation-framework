package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	
	@FindBy (name="lastname")
	public WebElement ContactName;
	
	@FindBy (xpath="//input[@class='crmbutton small save']")
	public WebElement SaveButton;
	
	public CreateContactPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getContactName() {
		return ContactName;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	
}
