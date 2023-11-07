package com.Dinesh.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	public WebElement login;
	
	@FindBy(xpath="//input[@name='Email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='Password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginBtn;
}
