Feature:  Billing Feature

  Scenario Outline: Perform Billing Transaction
    Given User is on the Billing Page
    When User enters "billing" amount <billingAmount>
    And User enters "tax" amount <taxAmount>
    And User clicks on Calculate Button
    Then User sees the <finalAmount> in the UI

    Examples:
    | billingAmount | taxAmount | finalAmount |
    | 1000 | 10 | 1010 |
    | 500 | 20 | 520 |
    | 100 | 5.5 | 105.5 |