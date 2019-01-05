#Author: Greens tech
@tag
Feature: Verify round trip functionality

  Scenario: 
    Given The User is in Delta homepage
    When The user selects source and destination
      | ATL | MSP |
    And The user selects trip type, dates and number of passengers
      | Round Trip | 01/25/2019 | 01/30/2019 | 2 Passengers |
    Then The user should see the list of flights
      | DL 2811 | DL 2823 | DL 2827 | DL 2815 | DL 2819 |
