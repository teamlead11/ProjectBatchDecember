Feature: Verify user can able to book the vacation package

Scenario: Verify user can able to book the vacation package

Given I am on delta home page
When I enter the valid details in the vacation and hotle module
And I book the hotel with lowest price
And I book the flight with lowest price
And I book the return flight with lowest price
And I select the typr of car that required
And I enter the travellers information for proceeding for payment checkout
Then I verify the travellers information