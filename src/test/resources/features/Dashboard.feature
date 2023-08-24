#Author: Uday
#Total 1 Scneario

Feature: Dashboard Functionality
  To check the functionality available for a user on a Dashboard page.

Background:
    Given User access the application and login

#1 Dashboard > MPD-524 > MPD-T130
  @Regression1 @sanity
  Scenario: Verify the details displayed on the Dashboard page
    When User navigate to the Dashboard page
  	Then Click on Myrewards and validate user navigation
    Then Click on Uploadvideo and validate user navigation
    Then Click on Viewprofile and validate user navigation
    Then Click on ManageUpload and validate user navigation
