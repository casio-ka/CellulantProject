Feature: Add bank account to the customer

  Background:
    Given user is on the landing page

    Scenario: user can add bank account to existing customer

      When user selects open account
      Then user can add bank account to customer
