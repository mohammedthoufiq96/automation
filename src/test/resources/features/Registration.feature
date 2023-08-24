#Author: Uday
#Total 5 Scnearios with 3 santiy.

Feature: Registration Functionality
  Here we are checking the valid and invalid flows of Registraion.

  Background: 
  	Given Creates mailid
    Given User access the application

#1 Registration > MPD-316-68 > T352
@Regression @Sanity
@Regression @Sanity
  Scenario: Verify Registration functionality with valid details
    When Navigates to Registraion pop-up
    And  Enter valid registration details and clicks register
    Then User should receive an email
    #And  Click on the click here link received 
    #Then Email should be verified
    And  Login with the registerd details
    Then user should be login successfully
    
############################################################################################################   
#
#2 Registration > MPD-316-68 > T353
@Regression @test2
  Scenario: Verify the validation messages displayed on trying to register with invalid Email ID.
  	When 
    When Navigates to Registraion pop-up
    And  User enters valid registration details except a missing @ in email and clicks register
    Then Verify the correct error message should be displayed
    When User enters valid registration details but a space in the start middle and end of email
    Then Verify the correct error message is shown
    When User enters valid registration details but a space in the middle of the email
    Then Verify the correct error message is shown
    When User enters valid registration details but a space in the beginning and end of email
    Then Verify a success message should be displayed and the confirmation email should be received.
    #
############################################################################################################   
    #	
#3 Registration MPD-316-68 > T354
#@Regression
#	Scenario: Verify the account already exists validation on trying to register with the same email ID
#	When Navigates to Registraion pop-up
#	And  User enters valid registration details with an exisiting users email and clicks register
#	Then User should receive an email
  #And  Click on the click here link received 
  #Then Verify the correct validation message should be displayed
  #When User navigates to the sign in pop-up
  #And  User attempts to sign-in with the newly registered user
  #Then "User does not exist" error message should show
  #
############################################################################################################   
#	
#4 Registration MPD-316-68 > T355
@Regression
	Scenario: Verify validation message displayed on trying to register with the existing username
	When Navigates to Registraion pop-up
	And  User enters valid registration details with an exisiting users username and clicks register
	Then Verify "User already exists" error message should show
#
############################################################################################################   
#
#5 Registration MPD-316-68 > T356 
@Regression
	Scenario: Verify validation message displayed on trying to register with invalid username
	When Navigates to Registraion pop-up
	And  User enters valid registration details but a new username with a space in the middle and clicks register
	Then Verify the correct error message is shown
	When User enters valid registration details but a new username with a space in the start middle and end and clicks register
	Then Verify the correct error message is shown
	When User enters valid registration details but a new username with a space in the start and end and clicks register
	Then Verify the correct error message is shown
	When User enters valid registration details but a new username with a space at the end and clicks register
	Then Verify the correct error message is shown
	When User enters valid registration details and clicks register
	Then Verify the success message should be displayed and user  should receive a verification email
	
	
#	
############################################################################################################   
#	
#6 Registration MPD-316-68 > T357
@Regression
	Scenario: Verify validation message displayed on trying to register with invalid password
	When Navigates to Registraion pop-up
	And  User clicks on the password field
#	Then Verify the password conditions information is displayed
	When User enters valid registration details but a password including the restricted characters and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a passwords less than eight characters and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a passwords without any uppercase and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a passwords without any lowercase and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a passwords without any numbers and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but the passwords have a space at the start and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but the passwords have a space at the end and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but the passwords have a space in the middle and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but the passwords have a space in the start middle and end and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but the passwords do not match and clicks register
	Then Verify the correct error message is displayed
#
############################################################################################################   
#	
#7 Registration MPD-316-68 > T358
#@Regression
#	Scenario: Verify links and validation message displayed on trying to register without accepting the conditions
#	When Navigates to Registraion pop-up
#	And  User enters valid registration details does not select t&c and clicks register
#	Then Verify the correct error message is displayed
#	When User clicks on the  customer terms of service link
#	Then Verify the correct pdf opens up
#	When User clicks on the  privacy policy link
#	Then Verify the correct pdf opens up
#	When User click on the cookie policy link
#	Then Verify the correct pdf opens up
#	When User clicks on the click here to sign in link displayed under the Register button
#	Then Verify the sign in pop up is displayed
#	
#	
#	
@Regression 
	Scenario: Verify registration fields
	When Navigates to Registraion pop-up
	Then verify the fields
	Then click close button
	
	@Regression 
		Scenario: Verify validation message displayed on trying to register with invalid email
	When Navigates to Registraion pop-up
	When User enters valid registration details but a email including with @ and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a email with space at start and ending clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a email with space at start middle and ending  and clicks register
	Then Verify the correct error message is displayed
	When User enters valid registration details but a email with space at inbetween and clicks register
	Then Verify the correct error message is displayed
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	
	
	
   