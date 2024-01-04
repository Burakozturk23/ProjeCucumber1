Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to bank
    And Fill in the Login Username input as "Kartal"
    And Fill in the Login Password input as "1903"
    When Click to Log in button
    Then Verify that you are logged in
    And Click to Log out button

  Scenario Outline:
    Given Navigate to bank
    And Fill in the Login Username input as "<username>"
    And Fill in the Login Password input as "<password>"
    When Click to Log in button
    Then error message should be displayed
    Examples:
      | username | password |
      | Karta    | 1903     |
      | Kartal   | 1923     |