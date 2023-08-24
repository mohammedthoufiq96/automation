#Author: Abdalla
#Total 5 Scenarios


Feature: MyProfile Functionality
  As a registered user, need to check the MyProfile features enabled.

#1  T129-MPD-355
@Regression 
@Regression 
Scenario: Verify the Edit profile functionality
	Given User access the application and navigates to MyProfile
#	When verify the features of MyProfile are correct
	When user clicks on the edit profile link
	Then verify the edit profile pop-up is displayed
	And  the correct fields should be available to edit
	When user edits location and submits changes
	Then changes should be successfully updated
	
@Regression 
Scenario: Verify the Edit password functionality
	Given Login and user clicks on the edit profile link
	Then click on change password
	And  Enter validdetails and change password
	When verify success message of password change
	Then validate login with old and new password

#2 T310-MPD-120

@Regression @Sanity  
Scenario: Verify the validation message displayed on trying to change password with invalid details
	Given User access the application and navigates to MyProfile
	When user clicks on the change password button1
	When user enters valid old password matching new passwords below eight char
	Then correct below eight error message should display
	When user enters valid old password matching new passwords w/o uppercase
	Then correct w/o uppercase error message should display
	When user enters valid old password matching new passwords w/o lowercase
	Then correct w/o lowercase error message should display
	When user enters valid old password matching new passwords w/o any digits
	Then correct w/o digits error message should display
	When user enters valid old password matching new passwords with restricted char
	Then correct w/o restricted char error message should display
	When user enters valid old password and mis-matching new passwords
	Then correct mismatch error message should display
	When user enters invalid old password and valid new passwords
	Then correct invalid old password error message should display
	When user enters valid old password matching new passwords with a space
	Then correct no space erorr error message should display
	When user enters valid old password with space valid new passwords
	Then correct no space error message should display
#
#3 T305-MPD-820
@Regression 
Scenario: Verify deactivate account functionality
	Given Login and user clicks on the edit profile link
	When  user clicks on the deactivate/delete your account link
	And  user clicks cancel on the pop-up
	Then pop-up should close and user should be redirected to MyProfile
	When user clicks on the deactivate/delete your account link again
	Then the user should be logged out and the home page should be displayed
	When user tried to login with the deactivated account
#	Then login should success and user should able to click myprofile
#	
#	
#	
#4 T152-MPD-739
@Regression 
Scenario: Verify Upload profile picture - Crop Image 
	Given Login and user clicks on the edit profile link
	When user clicks on the edit icon placed on the my profile pic 
	Then user should be able to edit and upload a new image
	Then user crops the picture and clicks on Submit
	Then verify the image is updated on all pages
#	
#	
#
#5 T304-MPD-120 
#@ignore
#@Regression
#Scenario: Verify Change password feature functionality with valid details
#	When user clicks on the change password button
#	Then verify the correct pop-up is displayed 
#	When user enters valid matching passwords
#	And  clicks submit
#	When user attempts to log in with the old password
#	Then the login should fail with the correct error message
#	When user attempts to log in with the new password
#
#	

@Regression 
Scenario: Login the Deactivated account with in x days of expiry
	Given Login and user clicks on the edit profile link
	Then  click on the deactivate/delete your account link
	Then user should be logged out and the home page should be displayed
	When user tried to login with the deactivated account within x days