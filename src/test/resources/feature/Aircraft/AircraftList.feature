#Author: your.email@your.domain.com
@tag
Feature: To verify the list of aircrafts under aircraft module

  @tag1
  Scenario: To verify the list of boeing aircrafts
    Given The User is in Delta homepage
    And The user navigates to aircraft section under travel info
    When The user selects the boeing under our aircraft section
    Then The user should see the list of aircrafts
      | Boeing 717 | Boeing 737-700 | Boeing 737-800 | Boeing 737-900 ER | Boeing 757-200 | Boeing 757-300 | Boeing 767-300 | Boeing 767-300ER | Boeing 767-400ER | Boeing 777-200ER | Boeing 777-200LR |
