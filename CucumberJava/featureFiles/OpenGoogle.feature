@SimpleLogin
Feature: feature to test open google functionality
  Scenario: Google search scenario
    Given user is entering google.co.in
    When user is typing the search term "ashwanthRagav"
    And enters the return key
    Then the user should see the search results

