@Regression @Login
Feature: Login

  Background:
    Given the user is in the login page

  @LoginOk @Smoke @Automated
  Scenario: Login con credenciales Validas
    When the user fills the email textbox with standard_user
    And the user fills the password textbox with secret_sauce
    And the user clicks the Login button
    Then the user is in Home Page

  @LoginFallido @Smoke @Automated
  Scenario: Login fallado por credenciales invalidas
    When the user fills the email textbox with standard_user
    And the user fills the password textbox with secret_error
    And the user clicks the Login button
    Then the user see the error message Epic sadface: Username and password do not match any user in this service


