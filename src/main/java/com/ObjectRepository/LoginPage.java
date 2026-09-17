package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (name= "user_name")
	private WebElement UserNameTextfield;
	
	@FindBy (name= "user_password")
	private WebElement PasswordTextfield;
	
	@FindBy (css= "[value='Login']")
	private WebElement LoginButton;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	//getters method
	
    public WebElement getUserNameTextfield() {
		return UserNameTextfield;
	}


	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//create scenario based methods-(objects)
	public void login(String USERNAME, String PASSWORD)
	{		
		UserNameTextfield.sendKeys(USERNAME);
		PasswordTextfield.sendKeys(PASSWORD);
		LoginButton.submit();
		
	}
}
