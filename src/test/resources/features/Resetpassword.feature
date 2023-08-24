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
Feature: Reset Password Functionalities
  I want to use this template for my feature file

  @Regression 
  Scenario Outline:  Email ID field validation of Reset password flow.
    When User Access the application and click on sign
    And Click on reset password link
    Then Validate the text field to enter the email id
    Then Enter  "<scenario>" and click reset Password and validate the invalid email error message "<errortype>"
    Examples:                             
  |scenario  | errortype |       
  |email id as abc |User does not exist|    
  |valid email but not registered |User does not exist|
  |registered email id with space at beginning|User does not exist|
  |registered email id with space at end|User does not exist|
  |registered email id with space at in between|Please enter a valid email address|
  |registered email id with space at in between and beginning|Please enter a valid email address|
  |registered email id with space at beginning and end|User does not exist|
  |registered email id with space at beginning,inbetween and end|Please enter a valid email address|
  |registered username|Please enter a valid email address|
    #Then validate the invalid email error message
    #Then Enter "valid email but not registered" and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered email id with space at beginning" and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered email id with space at end" and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered email id with space at in between" and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered email id with space at in between and beginning" and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered email id with space at beginning and end" and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered email id with space at beginning,inbetween and end"and click reset password
    #Then validate the invalid email error message
    #Then Enter "registered username" and click reset password
    #Then validate the invalid email error message
    #Then without entering email address and click reset password
    #Then validate the reset password button is disabled 
    #Then click on the close
   
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
