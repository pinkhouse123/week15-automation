Feature: Login Test
  As user I want to login into nop commerce website

  @Sanity, @Regression
  Scenario: User should navigate to signIn page successfully
    Given I am on homepage
    And I click on Sign in link
    Then verify that 'AUTHENTICATION' message is displayed

  @Smoke, @Regression
  Scenario Outline: verify The Error Message With In Valid Credentials
    Given I am on homepage
    And I click on Sign in link
    And Enter "<username>" in email field
    And Enter "<password>" in password field
    And I click on sign in button
    Then Verify the Error message "<message>"

    Examples:
      | username       | password | message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

  @Smoke, @Regression
  Scenario Outline: verify That User Should Log In SuccessFully With Valid Credentials
    Given I am on homepage
    And I click on Sign in link
    And Enter "<username>" in email field
    And Enter "<password>" in password field
    And I click on sign in button
    Then Verify that Sign Out link is displayed

    Examples:
      | username              | password |
      | umipatel123@gmail.com | umi123 |

  @Regression
  Scenario Outline: verify That User Should Log Out SuccessFully
    Given I am on homepage
    And I click on Sign in link
    And Enter "<username>" in email field
    And Enter "<password>" in password field
    And I click on sign in button
    And I click on sign out button
    Then Verify that Sign In link is displayed

    Examples:
      | username              | password |
      | umipatel123@gmail.com | umi123 |