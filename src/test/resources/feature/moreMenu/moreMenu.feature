#Author: your.email@your.domain.com
@tag
Feature: To verify more menu options

  @tag1
  Scenario: To get the list of more menus
    Given The User is in Delta homepage
    When The user clicks more menu option
    Then The user should see the list of menu items
      | Shop Vacations | Shop Hotels | Rent a Car | Flight Deals | Destinations |
