@TEST
Feature: switch_between_currencies |  Logged User could switch between currencies US-Euro

  Scenario: switch between currencies
    Given  home page1
    When determine to Euro
    Then successfully2
