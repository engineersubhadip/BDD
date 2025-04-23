Feature: Amazon Search feature

  Scenario: Search for Sweater in the Search bar
    Given User is on the Amazon Search Page
    When User enters "sweater" in the search bar
    And User clicks on the search button
    Then User should see "sweater" in the search results

  Scenario: Search for Pillow in the Search bar
    Given User is on the Amazon Search Page
    When User enters "pillow" in the search bar
    And User clicks on the search button
    Then User should see "pillow" in the search results