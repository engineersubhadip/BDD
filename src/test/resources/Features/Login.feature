Feature: Login Feature

    Scenario: Successfully login
      Given User lands on the LoginPage of the application
      When User enters "admin@yourstore.com" as the email address
      And User enters "admin" as the password
      And User clicks on the login button
      Then User lands on the DashboardPage of the application
      And User clicks on the logout button
      And User lands on the LoginPage of the application


