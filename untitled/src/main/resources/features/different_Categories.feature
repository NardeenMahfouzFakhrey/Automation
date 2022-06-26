@TEST
Feature: different_Categories |  Logged user could select different Categories


  Scenario: user could select different Categories
    Given  Logged user in home page
    When user go Categories and to sub_Categories
    Then Click on sub categories successfully