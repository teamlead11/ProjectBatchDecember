#Author: your.email@your.domain.com
@hotels
Feature: To test search a hotel functionality

  @error
  Scenario: To test the error message when the user clicks book a hotel and earn miles with empty fields
    Given The User is in Delta homepage
    And user navigate to search for a hotel
    When user click submit button without entering informations
    Then user should see tbe error message
      | *WHERE ARE YOU GOING? | *CHECK-IN | *CHECK-OUT |
