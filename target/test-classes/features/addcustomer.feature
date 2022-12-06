Feature: Add a new customer
  As a user
  I should be able to add a new customer

  Scenario: user successfully adds a customer
    Given user is on the login page
    When user clicks the bank manager login button
    And user clicks add customer button
    Then user can add a new customer