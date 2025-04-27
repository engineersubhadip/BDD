Feature: User Login Feature


  Scenario: User successfully logs into the application
    Given User lands on the "Login" page of the application
    When User enters the "test@sify.com" as the email
    And User enters the "test123" as the password
    And User clicks on the Login Button
    Then User lands on the "My Account" page of the application