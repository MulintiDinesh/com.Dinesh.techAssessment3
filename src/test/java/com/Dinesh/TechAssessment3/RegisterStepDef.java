package com.Dinesh.TechAssessment3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class RegisterStepDef {
	RegisterDemoWebShopActions objRegist = new RegisterDemoWebShopActions();
	UtilityClass data = new UtilityClass();
	HomePageActions objHome = new HomePageActions();
	LoginPageActions objLogin = new LoginPageActions();

	@Given("User opens demoWebShop register page")
	public void user_opens_demo_web_shop_register_page() {
		System.out.println("HomePage");
		HelperClassLogin.openPage("https://demowebshop.tricentis.com/");
	}

	@When("User clicks register page")
	public void user_clicks_register_page() {
		System.out.println("Register Page");
		objRegist.clickRegisterPage();
	}

	@When("User clicks radio button")
	public void user_clicks_radio_button() {
		System.out.println("Gender");
		objRegist.clickGender();
	}

	@When("User enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	
	    	String FirstName=data.get("FirstName");
	    	objRegist.setfname(FirstName);
	    	
	    	String LastName=data.get("LastName");
	    	objRegist.setlname(LastName);
	    	
	    	String Email=data.get("Email");
	    	objRegist.setemail(Email);
	    	
	    	String Password=data.get("Password");
	    	objRegist.setpassword(Password);
	    	
	    	String Confirm=data.get("Confirm Password");  
	    	objRegist.setcpassword(Confirm);
	    }
	}

	@When("User clicks register button")
	public void user_clicks_register_button() {
		System.out.println("Register Button");
		objRegist.clickregisterbtn();
	}

	@Then("User should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {
		Assert.assertTrue(objHome.ErrorMessage().contains("The specified email already exists"));
		   System.out.println("User already exists");
	}
}
