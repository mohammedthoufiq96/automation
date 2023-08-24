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
Feature: Functionality upload video feature
  I want to use this template for my feature file

  @Regression
  Scenario: Verify Upload video functionality with valid details
    When Login into the application
    And Navigate to MyContent section and click on upload video 
    Then Click browse from device button and select file to upload
    #Then Click cancel button
    #Then Click browse from device button and select file to upload
    Then click next button
    Then Enter Title,description,thumbnail and click next
    Then Select all field values with visibility as Public
    Then Select all field values in the Category and language
    Then Select the agreement check box and Click Submit button.
    Then Click finish button
    #Then Click on the uploaded video
    #Then Check the uploaded video is displayed under the selected category on the home page
    #Then Search the uploaded video
    
    @Regression @test1
    Scenario: Verify the Upload video options displayed on the application for a user
    When Login into the application
    And Navigate to MyContent section and click on upload video
    Then click on upload video on header of the application
    Then Navigate to dashboard and click on upload video


