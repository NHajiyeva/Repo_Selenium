@regression
Feature: Login

  @login1 @sanity
  Scenario: User get error on invalid credentials
#    Given I am on facebook homepage
    When I enter 'invalidEmail@test.com' in email
      And I enter 'incorrectPass@1234' in password
      And I click on login button
#    Then I verify I see the incorrect credentials error

  @smoke
  Scenario: User can login with valid credentials
#    Given I am on facebook homepage
    When I enter 'valid@gmail.com' in email
    And I enter 'correctPass@1234' in password
    And I click on login button
#    Then I verify I see the incorrect credentials error

  @login1
  Scenario: User get error blank password field
#    Given I am on facebook homepage
    When I enter 'onlyLoginEmail@gmail.com' in email
    And I click on login button
    And I enter age as 42
#    Then I verify I see the incorrect credentials error


#  Scenario: User cannot enter invalid email address
#    When I enter 'abcd' in email
#    Then I verify invalid email address is displayed
#
#  Scenario: User cannot enter invalid email address
#    When I enter '#$#*&*&' in email
#    Then I verify invalid email address is displayed
#
#  Scenario: User cannot enter invalid email address
#    When I enter '12345()8765' in email
#    Then I verify invalid email address is displayed

  # How to perform Data Driven Testing(DDT) using Cucumber(BDD)
  # using Scenario Outline with Examples
  Scenario Outline: User cannot enter invalid email address
    When I enter '<invalidEmail>' in email
    When I enter '<invalidPassword>' in email
    Then I verify invalid email address is displayed

  Examples:
    | invalidEmail | invalidPassword |
    | abcd         | abcdPassword    |
    | #$#*&*&      | &^%$#GHJK       |
    | 12345()8765  | kjdhkjh         |
