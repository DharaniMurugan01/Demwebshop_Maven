@ProductSorting
Feature: Product Sorting and View Options

Scenario Outline: Login and navigate to Gift Cards page
  Given I am on the Demowebshop login page
  When the user enter "<username>" and "<password>"
  Then the user should able to login successfully and new page opem
  Given the user is on the home page
  When the user clicks the Gift Cards
  Then the user should see the "Gift Cards" products

Examples: 
  | username           | password |
  | 2k21dhar@gmail.com | Dhar@123 |

Scenario Outline: Sort products and change display options
Given I am on the Demowebshop login page
  When the user enter "<username>" and "<password>"
  Then the user should able to login successfully and new page opem
  Given the user is on the home page
  When the user clicks the Gift Cards
  Then the user should see the "Gift Cards" products
  Given I am on the product page
  When I select a sorting option from the dropdown  
    | Position           |  
    | Name: A to Z       |  
    | Name: Z to A       |  
    | Price: Low to High |  
    | Price: High to Low |  
    | Created on         |  
  And I select a display count from the dropdown  
    | 4  |  
    | 8  |  
    | 12 |  
  And I select a view type from the dropdown  
    | Grid |    
    | List |  
  Then the products should show the product correctly

Examples:
  | username           | password |
  | 2k21dhar@gmail.com | Dhar@123 |
