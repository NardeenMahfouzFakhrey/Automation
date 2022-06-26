@TEST
Feature: RestPassword | users could use Rest password functionality

  Scenario: users could use Rest password with vaild email
    Given go to Rest page
    When rest with valid email
    And press on Recover button
    Then rest password successfully
