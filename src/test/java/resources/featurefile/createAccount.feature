Feature: Create Account Page Test
  As a User I want to create account successfully

  @Sanity, @Smoke, @Regression
  Scenario:   verify That User Should Create Account Successfully
    Given I am on homepage
    And I click on Sign in link
    And I enter Email address
    And Click on 'Create an account' button
    And Fill all mandatory fields
    And I Click on 'Register' button
    Then Verify message 'My Account'