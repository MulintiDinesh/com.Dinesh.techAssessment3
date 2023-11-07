Feature: Wishlist add and remove options

Scenario: Verify the Wishlist with add and remove options

Given User is on DemoWebShop Web mainpage
When User Click the Search Feature
And User Enter smartphone and click search option
And user pick the first smart phone
And User add the smartphone into wishlist
And User verify the wishlist count
And User remove the smartphone from the Wishlists
Then User Got the Wishlist add and remove function