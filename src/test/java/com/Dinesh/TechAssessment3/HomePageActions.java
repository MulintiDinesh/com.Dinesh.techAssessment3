package com.Dinesh.TechAssessment3;

import org.openqa.selenium.support.PageFactory;


public class HomePageActions {
	HomePageLocators homePageLocators = null;
	
	public  HomePageActions() {  
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(HelperClassLogin.getDriver(),homePageLocators);
	}
	public String getVerifyText() {
		return homePageLocators.assertContains.getText();
	}
	public String VerifyErrorMessage() {
		return homePageLocators.VerifyErrorMessage.getText();
	}
	public String ErrorMessage() {
		return homePageLocators.ErrorMessage.getText();
	}
	public String assertcheck() {
		return homePageLocators.WishlistText.getText();
	}
}
