@regressin
  Feature: Sign in


 @signIn @sanity
   Scenario: Teacher can add books in Recommendations List from Quick View
   # Given I am on Scholastic homepage
  When I click sign in button
   And I enter 'nazrinhajiyevaa@gmail.com' in email address
   And I click continue button
   And I enter 'scholastic5' in password
   And I click continue button
   And I type "harry" in search
   And I click on first result
   And I click on recommend button
   And I click on recommendations so students button
   Then I click on my list button
   And I verify item is added in recommendations to students


  @signIn1 @TC-6
  When I click sign in button
  And I enter 'nazrinhajiyevaa@gmail.com' in email address
  And I click continue button
  And I enter 'scholastic5' in password
  And I click continue button
  And I click on enter orders button
  And I select student flyer orders
  And I type 'harry' in names
  And I type '1111111' in item numbers
  And I click on add button
  And I verify that I get Please enter a valid item number error

