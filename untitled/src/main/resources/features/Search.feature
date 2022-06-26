@TEST
Feature: Search | users will be able to search for products with different parameters

  Scenario: user could search for product using fullname
    Given user clicks on search field
    When user search with name of product
    Then user could find relative results