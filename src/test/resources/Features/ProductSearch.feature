Feature: User searches for specific product

  Background:
    Given User lands on the "Home" page of the application
    When User enters "Sony Vaio" in the search bar
    And User clicks on the search button of the application
    Then User lands on the "Search" page of the application

  @Smoke
  Scenario: Search and validate product
    Given User lands on the "Search" page of the application
    Then User is able to see "Sony Vaio" in the search results

  @Sanity
  Scenario: Add Product to Cart
    Given User lands on the "Search" page of the application
    And User is able to see "Sony Vaio" in the search results
    When User clicks on Add to Cart button for "Sony Vaio"
    Then User verifies the success message

  @Regression
  Scenario: Update Quantity in Cart
    Given User lands on the "Search" page of the application
    And User is able to see "Sony Vaio" in the search results
    When User clicks on Add to Cart button for "Sony Vaio"
    And User clicks on Shopping cart icon
    And User updates the quantity to "2"
    And User clicks on Refreshes button
    Then User verifies the total price of the items