#Author: Uday
#Total 5 Scnearios with 3 santiy.

Feature: GuestUser Functionality
  As a guest user, need to check the application features enabled.

 
  Background:
    Given User access the application

#1 Guest user > MPD-1141 > MPD-T280
@Regression1
Scenario:  Verify the home page details displayed for a Guest User
   	When User access the application and expand side menu
    Then validate the side menu options enabled to the guest user
    Then validate the Header section
    Then validate the home page sections enabled to the guest user
    Then validate the footer section

#2 Guest user > MPD-44 > MPD-T30
@Regression1
Scenario: Verify the guest user access to the video user options
    When Guest user access the application and Click on a video
    Then validate the video player user option
    And Click on user option and validated the sigin pop-up display
    Then Validate the video details displayed

#3 Guest user > MPD-1141 > MPD-T284
@Regression
Scenario: Verify the home page details displayed for a Login User
    When User access the application and Click on sigin
    And login to the application
    Then validate the side menu options enabled to the login user
    Then validate the Header section
    Then validate the home page sections enabled to the login user
    Then validate the footer section

#4 Guest user > MPD-1223 > MPD-T487
@Regression @Sanity
Scenario: Verify the functionality of user login when clicked on the banner of the home page
    When Guest user click on the banner
    Then validated the sigin pop-up display
    And Login to the applicaiton
    Then validate the side menu options enabled to the login user
    And Refresh the page
#		Then The user should be login, the Signin pop-up should not be displayed

#5 Guest user > MPD-1122 > MPD-T320
@Regression @Sanity 
Scenario: Verify the Mplay video access to a guest user.
    When Navigate to the Myplay Section
    And Click on Myplay video
    Then validated the sigin pop-up display
    #And close the Signin
    #And Click on Myplay video from Suggestion videos
    #Then validated the sigin pop-up display
    And Login to the applicaiton
    Then Myplay video should start playing
    And Refresh the page
		Then The user should be login, the Signin pop-up should not be displayed
    
