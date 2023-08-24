#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Mywatchlist functionality
  I want to use this template for my feature file
#MPD-T124
  @Regression  
  Scenario: Verify Mywatchlist functionality
    When Access the application without login and play the video on home page
    Then click on the save button and verify the signin pop up displayed or not
    Then Login to application and play the video
    Then click on the save button and Verify save changed to saved
    Then Navigate to Mywatchlist from side menu and Verify the details of video
    
    @Regression
      Scenario: Verify user navigation to player from Mycontent and Mywatchlist
    When Login to the application by a user who has videos in Mycontent and Mywatchlist
    Then Navigate to the Mycontent from the side menu
    Then Click on any thumbnail or title of a video listed on the Manage video section as public
    Then Click on any thumbnail or title of a video listed on the Manage video section as unlisted
    Then Navigate to Mywatchlist from the side menu
    Then Click on any thumbnail or title of a video listed on the Mywatchlist
    
       @Regression
      Scenario: Verify save option displayed for different user accessing the same video
    When Login by user1 and save a video say video abc
    Then In another browser login with user 2 and access abc video
    #Then Verify the Save button design is a per the requirement or not
    
    @Regression
     Scenario:  Verify the functionality to remove the video from the my watchlist
    When Access the app without login and play video
    Then click on the save button and verify the signin pop
    Then Login to app and play the video
    Then click on the save button and Verify saved or not
    Then Navigate to Mywatchlist from the side menu of app
    Then Remove the video from watchlist
    Then Access the removed video and check save
    
        @Regression
     Scenario: Verify the list of videos displayed on the Mywatchlist when it is more than 10 videos
    When Login to application for mywatchlist count verify
    Then Access Multiple videos and click save button
    Then Navigate to mywatchlist for count verify
    Then verify the count and list on mywatchlist page

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
