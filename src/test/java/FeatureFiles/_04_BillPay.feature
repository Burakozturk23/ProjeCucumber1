Feature: Bill Pay Functionality

  Background:
    Given Navigate to bank
    And Fill in the Login Username input as "Kartal"
    And Fill in the Login Password input as "1903"
    When Click to Log in button

  Scenario Outline: Bill Payment Process
    And Click to Bill Pay button
    And Fill in the Payee Name input as "<payeeName>"
    And Fill in the Bill Address input as "<address>"
    And Fill in the Bill City input as "<city>"
    And Fill in the Bill State input as "<state>"
    And Fill in the Bill Zip Code input as "<zipcode>"
    And Fill in the Bill Phone input as "<phone>"
    And Fill in the Account input as "<account>"
    And Fill in the Verify Account input as "<verifyAccount>"
    And Fill in the Amount input as "<amount>"
    When Click to Send Payment button
    Then Bill Payment Complete message should be displayed
    And Click to Log out button2
    Examples:
      | payeeName | address | city | state | zipcode | phone | account | verifyAccount | amount |
      | Gas | Gursel | istanbul | Besiktas | 190323 | 2131456 | 585885 | 585885 | 120 |
      | Water | Gursel | istanbul | Besiktas | 190323 | 2131456 | 50000 | 50000 | 45 |
      | Electric | Gursel | istanbul | Besiktas | 190323 | 2131456 | 45000 | 45000 | 85 |