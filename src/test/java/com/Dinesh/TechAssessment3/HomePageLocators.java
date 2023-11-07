package com.Dinesh.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	@FindBy(xpath="//a[contains(text(),'ShubmanGill@gmail.com')]")
	public WebElement assertContains;
	
	@FindBy(xpath="//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")
	WebElement VerifyErrorMessage;
	
	@FindBy(xpath="//li[contains(text(),'The specified email already exists')]")
	WebElement ErrorMessage;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div")
	WebElement WishlistText;
}
