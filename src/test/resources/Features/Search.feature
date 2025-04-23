Feature: Amazon Search feature

  Scenario: Amazon Search feature functionalities
    Given User is on the Amazon Search Page
    When User enters "sweater" in the search bar
    And User clicks on the search button
    Then User should see "sweater" in the search results