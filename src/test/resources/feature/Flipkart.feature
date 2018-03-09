@tag
Feature: Verify user can able to login into the flipkart website 

  @tag1
  Scenario: Verify user can able to login into the flipkart website
    Given I am in https://www.flipkart.com/ homepage
    When I want to add four products in cart
    And I want to remove last item from cart
    Then I want to verify only three products in cart
    