package com.Dinesh.TechAssessment3;

import org.openqa.selenium.support.PageFactory;


public class LoginPageActions {
	LoginPageLocators loginPageLocators = null;
	String strEmail, strPassword;
	
	public LoginPageActions() {
		this.loginPageLocators = new LoginPageLocators();
		PageFactory.initElements(HelperClassLogin.getDriver(), loginPageLocators);
	}
	public void loginClick() {
		loginPageLocators.login.click();
	}
	public void setEmail(String strEmail) {
		loginPageLocators.email.sendKeys(strEmail);
	}
	
	public void setPassword(String strPassword) {
		loginPageLocators.password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		loginPageLocators.loginBtn.click();
	}
	
	public void login(String strEmail, String strPassword) {
		
		this.setEmail(strEmail);
		this.setPassword(strPassword);
		
		
	}
 
}
