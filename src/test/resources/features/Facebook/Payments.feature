@regression
Feature: Payments

  @smoke
  Scenario: User can make payments using credit card
    Given I am on facebook homepage
    When I enter 'abcd@gmail.com' in email
      And I make a payment
    Then I verify that bill is paid

