#Author: Greens
@tag
Feature: To test rent a car functionality

  @tag1
  Scenario: To test the error message when the user clicks book a car with empty fields
    Given The User is in Delta homepage
    And The user navigates to rent a car page
    When The user clicks the book a car buton
    Then The user should see the error messages
      | correct the 3 items indicated. |
