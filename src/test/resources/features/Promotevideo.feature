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
Feature: Title of your feature
  I want to use this template for my feature file

  @Regression
  Scenario: Verify the activation of Promote video functionality with valid details
    When Login to application with valid crendentials
    And Navigate to mycontent section
    Then Click on promote video option
    Then Select the level of promotion and click Submit button
    
    @Regression 
  Scenario: Verify the validation message displayed on trying active promote video with low balance and multiple times.
    When Login to application with low balance
    And Navigate to mycontent section
    Then Click on promote video option for low balance
    Then validate the low balance message
    
   @Regression 
  Scenario: Verify the validation message on trying to active promote video with invalid details
    When Login to application with low balance
    And Navigate to mycontent section
    Then Click on promote video option
    #Then validate the low balance message

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
