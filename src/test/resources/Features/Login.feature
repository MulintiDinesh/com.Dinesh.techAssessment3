Feature: User login to the demo application
 
Background:
	Given User can login to the demo application
	
@ValidCredentials
Scenario: Verification of Login using valid credentials
 
When User clicks Login
And User enters Email and Password
And User clicks login button
Then User logged in sucessfully
 
@InvalidCredentials
Scenario: Verification of Login using invalid credentials
 
When User clicks Login
And User enters Email and Password
And User clicks login button
Then Login will be unsucessful with error message