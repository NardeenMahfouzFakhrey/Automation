@Test
Feature: colorfeature | filter with color

  Scenario: user could filter with color
    Given  home page to Filter
    When determined to Categories like Apparel > Shoes
    And Filter with blue color
    Then successfully7
