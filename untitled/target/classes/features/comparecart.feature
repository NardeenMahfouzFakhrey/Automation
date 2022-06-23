@TEST
Feature: comparecart | add different products to compare list


  Scenario: could add different products to compare list
    Given different products to compare cart
    When  Frist products to compare cart
    And  And Second products to compare cart
    Then compare cart have two product

