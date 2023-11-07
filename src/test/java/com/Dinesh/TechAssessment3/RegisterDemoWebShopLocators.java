package com.Dinesh.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterDemoWebShopLocators {
	
	@FindBy(xpath="//a[@class='ico-register']")
	public WebElement RegisterPage;
	
	@FindBy(xpath="//input[@id='gender-male']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lname;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement cpassword;
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement registerbtn;
	
	@FindBy(xpath="//h1[text()='Register']")
	WebElement titleText;
}
