#Author: Abdalla
#Total: 7 scenarios

Feature: Sign In Functionality
  As a guest & registered user, need to check the sign-in features enabled.

  Background:
  Background:
    Given User access the application



#1  Registered User MPD-118/274 > T360
@Regression 
	Scenario: Verify User Login functionality with valid details
	When user clicks on sigin link displayed at the header right corner
	Then verify the details of the signin pop-up
	When user enters a valid username and password
	Then verify the eye-logo when clicked the password field shows/hides the password
	And  user clicks on the sign in button
#	Then verify the homepage is shown with full content
	
############################################################################################################   
	
#2  Invalid Username MPD-118/274 - T361
@Regression
	Scenario: Verify validation message displayed on trying to login with invalid user name
	When User clicks on sigin link displayed at the header right corner
	Then Verify the details of the signin pop-up
	When User enters valid password and username with space end
	Then Verify user is logged in successfully
	Then User clicks sign-out button displayed at the header right corner
	When User clicks on sigin link displayed at the header right corner
	Then User enters valid password and valid username with a space  middle
	Then Verify valid error message should be displayed
	Then Verify valid error message should be displayed
	When User enters valid password  and username with space in the middle and end
	Then Verify valid error message should be displayed
	When User enters a valid username and password with a space in the beginning
	When User enters a valid username and password with a space in the beginning
	Then Verify valid error message should be displayed
	When User enters a valid username and password with space at the end
	Then Verify valid error message should be displayed
	When User enters a valid username and password with space in the start middle and end
	Then Verify valid error message should be displayed
	When User enters a valid username and an invalid password
	Then Verify valid error message should be displayed
	
	############################################################################################################   
	
#3 Reset password MPD-118/274 > T363 
		@Regression
		Scenario: Verify user navigation to Reset password and Signup page from Sigin
		When User clicks on sigin link displayed at the header right corner
		Then Verify the details of the signin pop-up
		When User clicks on the reset password link
		Then User should be navigated to the forgot password flow
		When User clicks on the sign up link
		Then The user should be navigated to the registration flow
		
	@Regression
	Scenario: verify google login
	When Access the application
	Then click on sign in
	Then click on google login and verify logged in or not
	
	@Regression
	Scenario Outline: Verify validation message displayed on trying to login with invalid user name
	When Access the application and click on signin on sidemenu
	Then Enter login details with "<scenario>" and validate the "<validation>"
	
	Examples:
	 |scenario  | validation |
  |registered username with space at beginning|homepage|
  |registered username with space at end|homepage|
  |registered username with space at in between|errormessage|
  |registered username with space at beginning,inbetween and end|errormessage|
  |registered password with space at beginning|errormessage|
  |registered password with space at ending|errormessage|
  |registered password with space at beginning,inbetween and end|errormessage|
  |invalid password|errormessage|
  
  @Regression
	Scenario Outline: Verify validation message displayed on trying to login with invalid email and password
	When Access the application and click on signin from header
	Then Enter "<scenario>" and validate the "<validation>"
	
	Examples:
	 |scenario  | validation |
  |registered email with space at beginning|homepage|
  |registered email with space at end|homepage|
  |registered email with space at in between|errormessage|
  |registered email with space at beginning,inbetween and end|errormessage|
  |registered password with space at beginning|errormessage|
  |registered password with space at ending|errormessage|
  |registered password with space at beginning,inbetween and end|errormessage|
  |invalid password|errormessage|
  
  
  @Regression
  Scenario: Verify user navigation to Signin pop-up
  When Access the application and click on signin button on header of application
  Then verify signup pop displayed
  Then Access the video and click on signin to add comment and verify signup popup displayed
  Then Login and verify the add comment 
  #Then click live streaming banner abd verify signuppop displayed
  Then click on any video and click share and verify signuppopup displayed or not
  Then login with valid details and verify the share uption
		