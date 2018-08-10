#Author: greens
@US0004 @Regression @Sprint1 @Smoke @bookaflight
Feature: Title of your feature

  #AC1
  Scenario: Booking flight in OneWay trip
    Given The User is in Delta homepage
    And The User clicks the OneWay button
    When The User enters the input for origin,destination and journey date
      | ATL | MSP | 08/18/2018 |
    And The user clicks find a flight button
    Then The user should be in search results page
