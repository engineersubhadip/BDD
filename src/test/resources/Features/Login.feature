Feature: Login Feature

    Background: Prerequisites of the Login Test
      Given User lands on the LoginPage of the application

    Scenario: Successfully login
      When User enters "admin@yourstore.com" as the email address
      And User enters "admin" as the password
      And User clicks on the login button
      Then User lands on the DashboardPage of the application
      And User clicks on the logout button
      And User lands on the LoginPage of the application


    Scenario Outline: Data Driven Via Examples Tag
      When User enters "<userName>" as the email address
      And User enters "<userPassword>" as the password
      And User clicks on the login button
      Then User lands on the DashboardPage of the application
      And User clicks on the logout button
      And User lands on the LoginPage of the application

      Examples:
      | userName | userPassword |
      | admin@yourstore.com | admin |
      | admin1@yourstore.com | admin2 |
      | admin@yourstore.com  | admin  |

