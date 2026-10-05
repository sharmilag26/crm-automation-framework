package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadsPage {
	
	@FindBy(name="lastname")
	public WebElement LeadsName;
	
	@FindBy(name="company")
	public WebElement CompanyName;
	
	@FindBy(xpath="//input[@class='crmbutton small save']")
	public WebElement SaveButton;
	
	public CreateLeadsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeadsName() {
		return LeadsName;
	}

	public WebElement getCompanyName() {
		return CompanyName;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	
}
