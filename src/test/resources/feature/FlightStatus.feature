
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @flightStatusBasedOnFlightNumber
  Scenario: Title of your scenario
    Given I am on delta website page
    When I enter the flight number 
    Then I validate the flight status based on flight number

  @flightStatusBasedOnLocation
  Scenario:
    Given I am on delta website page
    When I enter the from and to location
    Then I validate the flight status based on location

    
