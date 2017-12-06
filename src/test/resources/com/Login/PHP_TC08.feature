#Author: your.email@your.domain.com
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Validate language drop down

  @tag2
  Scenario Outline: Validate language drop down
    Given I am in PHP travel home page
    When I select language "<language>" from dropdown
    Then I verify the selected "<language>" and "<languageValue>"

    Examples: 
      | language | languageValue |
      | French   | Emplacement   |
      | English  | Location      |
