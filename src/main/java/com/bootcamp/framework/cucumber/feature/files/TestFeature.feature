#Author: karthikeyan@testleaf.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When I complete action
    Then I validate the outcomes

  
  Scenario: Validate salesforces login with the valid user credentials
    Given Salesforce user want to login in to the appliction to do cretain task
    When they enter valid crendentials in login page and click the login button
    Then they should able to redriect landing page successfully

  @tag
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <username>
    When I check for the <password> in step
    Then I verify the <Accountname> in step

    Examples: 
      | username | password | Accountname |
      | name1    |        5 | success     |
      | name2    |        7 | Fail        |

  Scenario: Validate salesforces login with the invalid user credentials
    Given Salesforce user want to login in to the appliction to do cretain task
    When they enter invalid crendentials in login page and click the login button
    But they should not able to redriect landing page successfully
