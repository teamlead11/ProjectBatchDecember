#Author: trainer@your.domain.com
@tag
Feature: Verify Login FUnctionality

  @tag2
  Scenario Outline: To verify whether the user can login the application for the first time without email verfication
    Given I access the appllication
    When I enter the valid "<username >" and "<password>" without email verification
    Then I verify the "<warning message>"

    Examples: 
      | username  | password | warning message            |
      | deadeater | 12345678 | Pending email verification |
