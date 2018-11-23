#Author: your.email@your.domain.com
@tag
Feature: Field validation for user registration page

  @tag1
  Scenario: Title of your scenario
    Given The User is in Delta homepage
    And The user navigates to enrollment page
    When The user selects the adress type dropdown
    Then The user should see the options
      | Home | Business | Other |Select One|
