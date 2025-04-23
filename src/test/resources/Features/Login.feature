Feature: Login Feature

   Scenario Outline: : Successfully login
      Given User lands on the LoginPage of the application
      When User enters "<userName>" as the email address
      And User enters "<userPassword>" as the password
      And User clicks on the login button
      Then User lands on the DashboardPage of the application
      And User clicks on the logout button
      And User lands on the LoginPage of the application

      Examples:
      | userName | userPassword |
      | abc      | 123          |
      | xyz      | 456           |


