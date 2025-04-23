Feature: User Registration

  Scenario: User Registration with Different data
    Given User is on the Registration page
    When User enters the following details
    | subhadip | das | subhadip@sify.com | Bangalore |
    | arnav | mukherjee | arnav@yahoo.com | Munnar |
    Then User should be successfully registered

  Scenario: User Registration with Different data and Columns
    Given User is on the Registration page
    When User enters the following details with columns
      | firstName | lastName | emailID | Location |
      | subhadip | das | subhadip@sify.com | Bangalore |
      | arnav | mukherjee | arnav@yahoo.com | Munnar |
    Then User should be successfully registered