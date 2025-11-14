@Shop
Feature: Shop

  Background:
    Given the user is logged in
    And the user is in Home Page

  @testGabo
  Scenario: Add and Remove from Cart
    When  the user clicks add Sauce Labs Backpack product button
    And the user verify the cart has 1 products
    When  the user clicks remove Sauce Labs Backpack product button
    And the user verify the cart has 0 products
