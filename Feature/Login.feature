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
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your scenario
    Given I want to launch ff
    When ff is launched enter url
    Then maximize the browser
		When it maximize verify the username is available
		When username is available enter the admin credentials
		|user01|pass1234|
		And verify the user is navigated to home page
		When I navigate to my info to edit the contact details
		And I verify the successful message
		Then I log out
    
   