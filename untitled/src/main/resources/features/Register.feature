@TEST
Feature: F01_Register | users could use register functionality to open new accounts

  Scenario: user could register with valid fristname and lastname and email and password and confirmPassword
    Given go to register page
    When register with valid firstname and lastname and email and password and confirmPassword
    And press on register button
    Then register to the system successfully
    And logout to login page

