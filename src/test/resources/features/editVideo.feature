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
Feature: Edit video functionalities
  I want to use this template for my feature file

  @Regression1 @sanity
  Scenario: Verify de-activate video functionality while editing a video
    When Login to the application by a user who has an uploaded videos
    And Navigate to the Mycontent
    Then Click on edit option of a video which you want to edit and Click next button
    Then Update the Visibility to Unlisted and complete edit process
    And Verify the unlisted video display on search results


  @Regression @sanity
  Scenario: Verify video functionality while editing a video with valid details
    When Login to the application and Navigate to the Mycontent and Click on the Edit option of a video
    Then Empty the title and description field and click next
    Then verify the validation message for titlepage
    Then Enter valid details and click next and click next on Audience and visibility
    Then Empty the fiels in category page and click submit button
    Then Verify the validation message for categorypage
    Then Enter the valid details in category and click submit
  @Regression @sanity
    Scenario: Verify video functionality while editing a video with returning back without giving submit
    When Login to the application and Navigate to the Mycontent section and Click on the Edit option of a video
    Then Edit the details and click submit button
    Then validate the saved details
    Then Click on edit option of video and edit details and click cancel
    Then validate the details
    
    
    
    @tag1
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
