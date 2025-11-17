@Regression @Shop
Feature: Shop

  Background:
    Given the user is logged in
    And the user is in Home Page

  @addToCart @Automated
  Scenario: Add and Remove from Cart
    When  the user clicks add Sauce Labs Backpack product button
    And the user verify the cart has 1 products
    When  the user clicks remove Sauce Labs Backpack product button
    And the user verify the cart has 0 products

  @completePurchase @Smoke @Automated @testGabo
  Scenario Outline: Complete Purchase and Data Validation
    When  the user clicks add <product1> product button
    And the user clicks add <product2> product button
    And the user clicks the Cart button
    And the user click the Checkout button
    And the user fill the Checkout data
    And the user clicks Continue button
    And the user verify <product1> and <product2> names
    And the user verify products prices
    Then the user clicks the Finish button
    And the user see the meesage Thank you for your order!


    Examples:
      | product1            | product2              |
      | Sauce Labs Backpack | Sauce Labs Bike Light |
