@checkout
Feature: Checkout the product
 
  Scenario Outline: Checkout the product in demowebshop application
  Given I am on the Demowebshop login page
    When the user enter "2k21dhar@gmail.com" and "Dhar@123"
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
  
  Given the user is on the products page
  When the user clicks on a product
  And the user enters "<name>" and "<email>"
  And the user clicks the Add to Cart button
  Then the product should be added to the cart successfully
  When the user clicks the shopping cart
  And the user agrees to the terms and conditions
  Then the user should be able to proceed to the checkout page
  #And the user should fill the billing Address
  #And the user should see the "Thank you"

Examples:
  | name     | email              |
  | Dharani  | dhar@gmail.com     | 
  