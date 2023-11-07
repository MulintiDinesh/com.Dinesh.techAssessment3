package com.Dinesh.TechAssessment3;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	UtilityClass data = new UtilityClass();
	LoginPageActions objLogin = new LoginPageActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User can login to the demo application")
	public void user_can_login_to_the_demo_application() {
		HelperClassLogin.openPage(data.url);
	    System.out.println("login page");
	}
 
	@When("User clicks Login")
	public void user_clicks_login() {
		objLogin.loginClick();
	}
 
	@When("User enters Email and Password")
	public void user_enters_email_and_password() {
		objLogin.login(data.email, data.password);
		System.out.println("User logged in");
	}
 
	@When("User clicks login button")
	public void user_clicks_login_button() {
		objLogin.clickLogin();
		System.out.println("User clicks login ");
	}
 
	@Then("User logged in sucessfully")
	public void user_logged_in_sucessfully() {
		Assert.assertTrue(objHome.getVerifyText().contains("ShubmanGill@gmail.com"));
		System.out.println("sucessfull login");
	}
 
	@Then("Login will be unsucessful with error message")
	public void login_will_be_unsucessful_with_error_message() {
		Assert.assertTrue(objHome.VerifyErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again."));
		System.out.println("User logged in with invalid credentials");
 
	}
}
