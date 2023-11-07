package com.Dinesh.TechAssessment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterDemoWebShopActions {
	RegisterDemoWebShopLocators registerDemoWebShopLocators = null;
//	String strfname,strlname,stremail,strpassword,strcpassword;
	WebDriver driver;
	
	public RegisterDemoWebShopActions() {
		this.registerDemoWebShopLocators = new RegisterDemoWebShopLocators();
		
		PageFactory.initElements(HelperClassLogin.getDriver(),registerDemoWebShopLocators);
	}
	public void clickRegisterPage() {
		registerDemoWebShopLocators.RegisterPage.click();
	}
	public void clickGender() {
		registerDemoWebShopLocators.gender.click();
	}
	
	public void setfname(String strfname) {
		registerDemoWebShopLocators.fname.sendKeys(strfname);
	}
	public void setlname(String strlname) {
		registerDemoWebShopLocators.lname.sendKeys(strlname);
	}
	public void setemail(String stremail) {
		registerDemoWebShopLocators.email.sendKeys(stremail);
	}
	public void setpassword(String strpassword) {
		registerDemoWebShopLocators.password.sendKeys(strpassword);
	}
	public void setcpassword(String strcpassword) {
		registerDemoWebShopLocators.cpassword.sendKeys(strcpassword);
	}
	public void clickregisterbtn() {
		registerDemoWebShopLocators.registerbtn.click();
	}
	
//	public String getRegisterTitle(){
//		return registerDemoWebShopLocators.titleText.getText();
//	}
public void register(String strfname,String strlname,String stremail,String strpassword,String strcpassword) {
		
		setfname(strfname);
		setlname(strlname);
		setemail(stremail);
		setpassword(strpassword);
		setcpassword(strcpassword);
		
	}
}
