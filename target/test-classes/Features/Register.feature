Feature: Registering demoWebShop application

Scenario: Register the website using valid credentials
 
Given User opens demoWebShop register page
When User clicks register page
And User clicks radio button
And User enters credentials
	|	FirstName |	LastName | Email             | Password    | Confirm Password   |
	|	Shubman   |	Gill     | Shubman@gmail.com | Shubman@123 | Shubman@123 |
	
And User clicks register button
Then User should be able to register successfully
