package com.Dinesh.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class WishListActions {
	WishListLocators wishListlocators = null;
	
	WishListActions(){
		this.wishListlocators = new WishListLocators();
		PageFactory.initElements(HelperClassLogin.getDriver(), wishListlocators);
	}
	public void search() {
		wishListlocators.search.click();
	}
	public void clicksearch() {
		wishListlocators.search.sendKeys("Smartphone");
		wishListlocators.searchButton.click();
	}
	
	public void mobileFunction() {
		wishListlocators.mobile.click();
	}
	
	public void WishList() {
		wishListlocators.AddtoWish.click();
	}
	
	public void wishlistOpt() {
		wishListlocators.wishlists.click();
	}
	
	public void removeWishlist() {
		wishListlocators.removelist.click();
	}
	
	public void removefrom() {
		wishListlocators.remove.click();
	}
 
}

