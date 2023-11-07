package com.Dinesh.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListLocators {
	
	@FindBy(xpath = "//input[@id='small-searchterms']") 
	public WebElement search;
	
	@FindBy(xpath = "//input[@value='Search']") 
	public WebElement searchButton;
	
	@FindBy(xpath = "//a[text()='Smartphone']") 
	public WebElement mobile;
	
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-43']") 
	public WebElement AddtoWish;
	
	@FindBy(xpath = "//span[text()='Wishlist']") 
	public WebElement wishlists;
	
	@FindBy(xpath = "//input[@name='removefromcart']") 
	public WebElement removelist;
	
	@FindBy(xpath = "//input[@name='updatecart']") 
	public WebElement remove;
	
}
