Feature: this is the login feature for orange HRM
Scenario: This is login scenario
    Given user is on login page
    When the user enters the valid username and password
    And clicks on login button
    Then the user should be navigated to home page
