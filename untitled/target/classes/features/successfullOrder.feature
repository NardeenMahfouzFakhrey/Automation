@TEST
Feature: successfulOrder | Create successful Order


  Scenario: User Can Create Sucessfull Order
    Given User Go to Shopping cart
    When user Complete Data to create order

    Then assert user created order successful

