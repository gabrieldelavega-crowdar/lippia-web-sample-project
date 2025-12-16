@Regression @Shop
Feature: Shop

  Background:
    Given the user is logged in
    And the user is in Home Page

  @addToCart @Automated @1
  Scenario: Add from Cart
    When  the user clicks add Sauce Labs Backpack product button
    Then the user verify the cart has 1 products

  @removeFromCart @Automated @2
  Scenario: Remove from Cart
    When  the user clicks add Sauce Labs Backpack product button
    And  the user clicks remove Sauce Labs Backpack product button
    And the user verify the cart has 0 products

  @completePurchase @Smoke @Automated @3
  Scenario Outline: Complete Purchase
    When  the user clicks add <product> product button
    And the user clicks the Cart button
    And the user click the Checkout button
    And the user fill the Checkout data with Name <Fname> Lastname <Lname> and Zipcode <Zcode>
    And the user clicks Continue button
    And the user clicks the Finish button
    Then the user see the message Thank you for your order!

    Examples:
      | product             | Fname | Lname | Zcode |
      | Sauce Labs Backpack | Juan  | Perez | 5500  |

  @purchaseFailByName @Smoke @Automated @4
  Scenario Outline: Fail Purchase Incomplete Name
    When  the user clicks add <product> product button
    And the user clicks the Cart button
    And the user click the Checkout button
    And the user fill the Checkout data with Name <name> Lastname <lastname> and Zipcode <zcode>
    And the user clicks Continue button
    Then the user see the error message Error: First Name is required


    Examples:
      | product             | name | lastname | zcode |
      | Sauce Labs Backpack |      | Perez    | 5500  |

  @purchaseFailZipCode @Smoke @Automated @5 @testGabo
  Scenario Outline: Fail Purchase Incomplete Zipcode
    When  the user clicks add <product> product button
    And the user clicks the Cart button
    And the user click the Checkout button
    And the user fill the Checkout data with Name <name> Lastname <lastname> and Zipcode <zcode>
    And the user clicks Continue button
    Then the user see the error message Error: Postal Code is required




    Examples:
      | product             | name | lastname | zcode |
      | Sauce Labs Backpack | Juan | Perez    |       |