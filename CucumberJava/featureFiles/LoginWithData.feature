Feature: this is the login feature with data for orange HRM
Scenario: This is login with data scenario
    Given user is on login page of HRM
    When the user enters the valid "Admin" and "admin123"
    And the user clicks on login button
    Then the user should be navigated to home page
