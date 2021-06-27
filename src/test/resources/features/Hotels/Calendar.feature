@regression
Feature: Calendar

  @TC-17 @Calendar
  Scenario : User unable to click past dates if dates are disabled
# Given I am on hotels homepage
    When I click on check in calendar
    Then I verify that I am unable to click the past dates
    And I verify that I am unable to click back button

  @TC-18
  Scenario: User can see same same amount of children and adults on Room pop up as selected
  # Given I am on hotels homepage
    When I click on guests
    And I select adults as '4'
    And I select children as '2'
    And I select first child age as '4'
    And I select second child age as '<1'
    Then I verify on rooms pop-up that number of adults as children are same as selected
    Then I verify that total number of guests are same as selected

  @TC-19
  Scenario: User can see the change dates button at the end of the results
  # Given I am on hotels homepage
    When I enter 'bora' in destination
    And I select 'Bora Bora, French Polynesia' from auto suggestion
    And I select 'October 10, 2021' as check in date
    And I select 'October 31, 2021' as check out date
    And I click apply
    And I click on search button
    Then I verify that change dates button appears at the end of the results
