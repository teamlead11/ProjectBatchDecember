#Author: your.email@your.domain.com
@tag
Feature: To list the available flights

  @tag1
  Scenario Outline: To validate flight list
    Given The User is in Delta homepage
    And The user naviagates to flight status page
    When The user search by route for the details "<Source>", "<Destination>" and "<Date>"
    And Click search button
    Then User validates the list of flights "<FlightList>"

    Examples: 
      | Source | Destination | Date            | FlightList    |
      | ATL    | MSP         | 29 October 2018 | DL1866,DL0950 |
