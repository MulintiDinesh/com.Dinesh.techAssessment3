package com.Dinesh.TechAssessment3;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDef {
	WishListActions wish = new WishListActions();
	HomePageActions objHome = new HomePageActions();
	
	@Given("User is on DemoWebShop Web mainpage")
	public void user_is_on_demo_web_shop_web_mainpage() {
		HelperClassLogin.openPage("https://demowebshop.tricentis.com/");
	    System.out.println("login page");
	}

	@When("User Click the Search Feature")
	public void user_click_the_search_feature() {
		wish.search();
	    System.out.println("search feature enable");
	}

	@When("User Enter smartphone and click search option")
	public void user_enter_smartphone_and_click_search_option() {
		wish.clicksearch();
		System.out.println("search the smartphone");
	}

	@When("user pick the first smart phone")
	public void user_pick_the_first_smart_phone() {
		wish.mobileFunction();
	}

	@When("User add the smartphone into wishlist")
	public void user_add_the_smartphone_into_wishlist() {
		wish.WishList();
	    System.out.println("moble successfully added");
	}

	@When("User verify the wishlist count")
	public void user_verify_the_wishlist_count() {
		wish.wishlistOpt();
	    System.out.println("verify the wishList ");
	}

	@When("User remove the smartphone from the Wishlists")
	public void user_remove_the_smartphone_from_the_wishlists() {
		wish.removeWishlist();
	    wish.removefrom();
	    System.out.println("remove from the wishlist");
	}

	@Then("User Got the Wishlist add and remove function")
	public void user_got_the_wishlist_add_and_remove_function() {
		Assert.assertTrue(objHome.assertcheck().contains("The wishlist is empty!"));
		System.out.println("Assert successfull");
	}
}
