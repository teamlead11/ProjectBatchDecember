#Author: your.email@your.domain.com
Feature: TO verify single flight status

  Scenario Outline: To verify the flight number,source and destination
    Given The User is in Delta homepage
    And The user navigates to flight status page
    When The user enters flight number "<flightNumber>" and date "<date>"
    Then The user should see the flight number "<flightNumber>" ,source "<source>" and destination "<destination>"

    Examples: 
      | flightNumber | date       | source | destination |
      | DL1885       | 12/01/2018 | ATL    | MSP         |
      | DL1866       | 12/01/2018 | ATL    | MSP         |
