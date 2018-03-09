@tag
Feature: Verify user can able to login into the HinduNames website 

  @tag1
  Scenario: Verify user can able to login into the HinduNames website
    Given I am in hindunames.net homepage
    When I give the alphabet i want to navigate to
    |B|
    Then I verify given alphabet pages is navigated
    |B|
    
   