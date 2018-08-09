
@tag
Feature: Title of your feature
  I want to use this template for my feature file
Background:
Given I am on delta website page

  @flightStatusBasedOnFlightNumber
  Scenario: Title of your scenario
    
    When I enter the flight number 
    Then I validate the flight status based on flight number

  @flightStatusBasedOnLocation
  Scenario:
  
    When I enter the from and to location
    Then I validate the flight status based on location

    
