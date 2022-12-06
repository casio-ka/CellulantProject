Feature add customer
  As a user
  I should be able to create new user

  Background:
    Given the user is on the login page

  Scenario Bank manager adds customer
    When the user clicks the bank manager login
    And the user clicks add customer button
    Then the user can add a new customer