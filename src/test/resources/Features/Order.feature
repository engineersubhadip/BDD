Feature: Amazon Order Details feature

  Background:
    Given User is on the "Amazon Login" Page
    When User enters the "dummyEmail" as user email
    And User enters the "dummyPassword" as user password
    And User clicks on the Amazon login button
    And User navigates to the Orders page

  @Smoke
  Scenario: Check previous order details
    Given User is on the "previous order" Page
    Then User checks all the "previous order" details

  @Regression
  Scenario: Check cancelled order details
    Given User is on the "previous order" Page
    When User navigates to the Cancelled order tab
    Then User checks all the "cancelled order" details
