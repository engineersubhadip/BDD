
Feature: Book Cab Types

  @Smoke
  Scenario: Booking a Sedan
    Given I am on the Uber Application
    When I am selecting a "Sedan" option
    And I am selecting "Bangalore" as Pickup location and "Pune" as Drop location
    Then Driver is able to accept my request

  @Regression
  Scenario: Book a MiniVan
    Given I am on the Uber Application
    When I am selecting a "MiniVan" option
    And I am selecting "Hinjewadi" as Pickup location and "Mysuru" as Drop location
    Then Driver is able to accept my request

  @Prod @Smoke
  Scenario: Book a Auto
    Given I am on the Uber Application
    When I am selecting a "Auto" option
    And I am selecting "Munnar" as Pickup location and "Mangalore" as Drop location
    Then Driver is able to accept my request