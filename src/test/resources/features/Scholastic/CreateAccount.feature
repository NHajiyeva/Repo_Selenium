@regression
Feature: Create an account

  @createAccount @sanity
  Scenario: User can create a new teacher account in taxable state using School Search
#    Given I am on Scholastic homepage
    When I click on create an account button
    And I choose teacher
    And I click next button
    And I choose 'Mrs' from title
    And I enter 'new' in first name
    And I enter 'teacher' last name
    And I enter 'newteacher@gmail.com' in email
    And I enter '12345@' in password
    And I enter '9292563666' in mobile number
    And I click on agree with terms button
    And I click next button
    And I select 'New York' state
    And I type 'New York' in city
    And I click search button
    And I type 'Scholastic+Book+Clubs' in School Name
    And I click next button
    And I select 'Teacher By Grade' in role
    And I select '1st Grade' in grade
    And I enter '5' in number of students
    And I click next
    And I choose 'GRL' from preferred reading level system
    And I click continue to site
    Then I verify class code is presented on home page
    Then I verify class code is presented on my account page
    Then I verify same teacher name is present on my accounts
    Then I verify same address is present as selected while creating new account
















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
