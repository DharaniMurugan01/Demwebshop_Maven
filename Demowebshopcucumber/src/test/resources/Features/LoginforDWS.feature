@Login
Feature: Login the Demowebshop website
  @validcredentials
  Scenario Outline: Login with valid credentials
    Given I am on the Demowebshop login page
    When the user enter "<username>" and "<password>"
    Then the user should able to login successfully and new page opem
    And the user should able to see the welcome message    
    Examples: 
      | username          |password|
      | 2k21dhar@gmail.com|Dhar@123|      
@GiftCards
Scenario Outline: Navigate to Gift Cards page
    Given I am on the Demowebshop login page
    When the user enter "<username>" and "<password>"
    Then the user should able to login successfully and new page opem
    Given the user is on the home page
    When the user clicks the Gift Cards
    Then the user should see the "Gift Cards" products
    Examples: 
      | username          |password|
      | 2k21dhar@gmail.com|Dhar@123|
      | 2k21dharani@gmail.com|Dhara@123|
  